package com.nt.dao;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.entity.Pant;
import com.nt.entity.Receipt;
import com.nt.entity.Shirt;

@Component
public class CustomerDao {
	@Autowired
	private JdbcTemplate template;

//add customer
	public boolean addCustomer(Customer c) {
		try {
			Object[] args = { c.getAddress(), c.getContact(), c.getName(), c.getPayment(), c.getPayment_paid(),
					c.getPayment_pending(), c.getStatus(), c.getEmail() };
			int result = template.update(
					"insert into customer (address,contact , name,payment,payment_paid,payment_pending,status,email) values(?,?,?,?,?,?,?,?)",
					args);
			if (result == 1) {
				return true;
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return false;
	}

//cutomer details
	public List<Customer> datails() {
		try {
			List<Customer> list = template.query("select * from customer", new CustomerMapper());
			return list;
		} catch (DataAccessException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}

	}

	// select id
	public List<Customer> selectId(int id) {

		try {
			Object[] args = { id };
			List<Customer> c = template.query("select * from customer where id=?", new CustomerMapper(), args);
			return c;
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		return Collections.emptyList();

	}

	// select by name
	public List<Customer> selectByName(String name) {
		try {
			Object[] args = { name + "%" };
			String sql = "SELECT * FROM customer WHERE name LIKE ?";
			List<Customer> c = template.query(sql, new CustomerMapper(), args);
			return c;
		} catch (Exception ex) {
			ex.printStackTrace();
			return Collections.emptyList();
		}
	}

//add recipt
	public boolean addReceipt(Shirt r) {
		try {
			// insert shirt
			Object[] args1 = { r.getCustomer_id(), r.getShirt_chest(), r.getShirt_collar(), r.getShirt_hand_loose(),
					r.getShirt_height(), r.getShirt_loose(), r.getShirt_other(), r.getShirt_press(),
					r.getShirt_quantity(), r.getShirt_rate(), r.getShirt_shape(), r.getShirt_shoulder(),
					r.getShirt_sleeve(), r.getShirt_sleeve_cup(), r.getShirt_stomach(), r.getShirt_type() };

			int result1 = template.update(
					"INSERT INTO shirt_detail (customer_id, shirt_chest, shirt_collar, shirt_hand_loose, shirt_height, shirt_loose, shirt_other, shirt_press, shirt_quantity, shirt_rate, shirt_shape, shirt_shoulder, shirt_sleeve, shirt_sleeve_cup, shirt_stomach, shirt_type) "
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
					args1);
			// insert pant
			Object[] args2 = { r.getPant().getCustomer_id(), r.getPant().getPant_height(), r.getPant().getPant_knee(),
					r.getPant().getPant_legs_bottom(), r.getPant().getPant_other(), r.getPant().getPant_pocket(),
					r.getPant().getPant_press(), r.getPant().getPant_quantity(), r.getPant().getPant_rate(),
					r.getPant().getPant_seat(), r.getPant().getPant_shape(), r.getPant().getPant_thigh(),
					r.getPant().getPant_tip(), r.getPant().getPant_type(), r.getPant().getPant_waist() };

			int result2 = template.update(
					"INSERT INTO pant_detail (customer_id, pant_height, pant_knee, pant_legs_bottom, pant_other, pant_pocket, pant_press, pant_quantity, pant_rate, pant_seat, pant_shape, pant_thigh, pant_tip, pant_type, pant_waist) "
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
					args2);
			// get max id for shirt and pant from database
			int idShirt = template.queryForObject("SELECT MAX(ID) FROM shirt_detail", Integer.class);
			int idPant = template.queryForObject("SELECT MAX(ID) FROM pant_detail", Integer.class);
			// shirt pricing
			int shirtPrice = (int) (r.getShirt_quantity() * r.getShirt_rate());
			// pant pricing
			int pantPrice = (int) (r.getPant().getPant_quantity() * r.getPant().getPant_rate());
			// total price
			int totalPrice = shirtPrice + pantPrice;

			if (result1 == 1 && result2 == 1) {
				// add receipt
				Object[] args = { r.getReceipt().getCurr_date(), r.getReceipt().getDelivery_date(),
						r.getReceipt().getCustomer(), r.getReceipt().getStatus(), idShirt, idPant, totalPrice,
						r.getReceipt().getPaid_amount() };

				int result = template.update(
						"INSERT INTO receipt (curr_date, delivery_date, customer, status, shirt_id, pant_id, amount ,paid_amount) "
								+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
						args);
				// add amount in customer table

				template.update("UPDATE customer set payment =payment +? where id=?", totalPrice, r.getCustomer_id());

				// paid amount in customer
				template.update("UPDATE customer set payment_paid =payment_paid + ? where id=?",
						r.getReceipt().getPaid_amount(), r.getCustomer_id());

              //pending amount in receipt
				template.update("UPDATE receipt set pending_amount =amount - ? where shirt_id=? && pant_id=?",
						r.getReceipt().getPaid_amount(), idShirt, idPant);

				// get pending amount from receipt
				int pendingAmount = template.queryForObject(
						"SELECT pending_amount FROM receipt WHERE shirt_id = ? AND pant_id = ?",
						new Object[] { idShirt, idPant }, Integer.class);

				// amount pending
				template.update("UPDATE customer SET payment_pending = payment_pending +? WHERE id = ?", pendingAmount,
						r.getCustomer_id());

				return true;

			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return false;
	}

	public boolean deleteId(int id) {
		try {
			Object[] args = { id };
			int result = template.update("DELETE FROM customer WHERE id=?", args);
			System.out.println(id);

			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;

	}

//reciept details
	public List<Receipt> recieptdatails(int id) {
		try {
			Object[] args = { id };

			List<Receipt> list = template.query("select * from receipt WHERE customer=?", new ReceiptMapper(), args);
			return list;
		} catch (DataAccessException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}

	}

	public boolean updateCustomer(int id, String name, String contact, String address, String status, String email) {
		try {

			Object[] args = { name, contact, address, status, email, id };
			int result = template.update(
					"UPDATE customer SET name = ?, contact = ?, address = ?, status = ?, email = ? WHERE id = ?", args);

			if (result == 1) {
				return true;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;

	}

	public List<Receipt> receiptLast(int id) {
	    try {
	        Integer maxId = template.queryForObject("SELECT MAX(ID) FROM receipt WHERE customer = ?", new Object[]{id}, Integer.class);
	        System.out.println(maxId);
	        if (maxId != null) {
	            Object[] args = { maxId };

	            List<Receipt> list = template.query("SELECT * FROM receipt WHERE id = ?", new ReceiptMapper(), args);
	            return list;
	        } else {
	            return Collections.emptyList();
	        }
	    } catch (DataAccessException e) {
	        e.printStackTrace();
	        return Collections.emptyList();
	    }
	}
	public boolean addlogin(String username, String password) {
		System.out.println(username+" "+password);
	    try {
	        // Query to fetch the stored password for the given username
	        String sql = "SELECT password FROM login WHERE username = ?";
	        Object[] args = { username };
	        
	        // Fetch the password from the database
	        String storedPassword = template.queryForObject(sql, args, String.class);
	        System.out.println(storedPassword);
	        // Compare the stored password with the provided password
	        if (storedPassword != null && storedPassword.equals(password)) {
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	public boolean register(String username, String password) {
	    try {
	        String sql = "INSERT INTO login (username, password) VALUES (?, ?)";
	        Object[] args = { username, password };
	        
	        int result = template.update(sql, args);
	        if (result == 1) {
	            return true;
	        }
	    } catch (Exception ee) {
	        ee.printStackTrace();
	    }
	    return false;
	}

	

}
