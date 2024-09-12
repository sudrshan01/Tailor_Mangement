package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dao.CustomerDao;
import com.nt.dao.LoginDao;
import com.nt.entity.Customer;
import com.nt.entity.Receipt;
import com.nt.entity.Shirt;
@Component
@Controller
public class CustomerContoller {
	@Autowired
	private CustomerDao dao;
	
	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {
	    System.out.println("Username: " + username + ", Password: " + password);

	    boolean isLoginSuccessful = dao.addlogin(username, password);

	    if (isLoginSuccessful) {
	    	List<Customer> list = dao.datails(); // Corrected method name to "details"

	        if (list != null && !list.isEmpty()) {
	            model.addAttribute("emplist", list);
	            return "customerDetails"; // Redirect to the details page if customers are found
	        } else {
	            model.addAttribute("msg", "No customers found.");
	            return "index"; // Redirect to index page if no customers found
	        }
	    } else {
	        model.addAttribute("msg", "Invalid username or password!");
	        return "index"; // Redirect to index page with an error message on failed login
	    }
	}
	@RequestMapping("/register")
	public String register(@RequestParam String username, @RequestParam String password, Model model) {
//	    System.out.println("Username: " + username + ", Password: " + password);

	    boolean isAdd = dao.register(username, password);
	    if (isAdd) {

			 return "redirect:/index";
		}
		return null;

	}	

	// customer add
	@RequestMapping("/customer")
	public String customerAdd(@ModelAttribute Customer c, Model model) {
		boolean isAdd = dao.addCustomer(c);
		if (isAdd) {

			 return "redirect:/detail";
		}
		return null;

	}

//Customer detail
	@RequestMapping("detail")
	public String showCustomer(Model model) {
		List<Customer> list = dao.datails();
		if (list != null && !list.isEmpty()) {
			model.addAttribute("emplist", list);
			return "customerDetails";
		} else {
			model.addAttribute("errorMsg", "No employees found.");
			return "customerDetails";
		}
	}

	// select customer by id
	@RequestMapping("/selectid")
	public String selectid(@RequestParam int id, Model model) {
		List<Customer> c = dao.selectId(id);
		if (c != null) {
			model.addAttribute("emplist", c);
			return "customerDetails";
		} else {
			model.addAttribute("errorMsg", "Employee not found with id: " + id);
			return "result";
		}

	}

	// select customer by name
	@RequestMapping("/selectname")
	public String selectName(@RequestParam String name, Model model) {
		List<Customer> customers = dao.selectByName(name);
		if (!customers.isEmpty()) {
			model.addAttribute("emplist", customers);
			return "customerDetails";
		} else {
			model.addAttribute("errorMsg", "No customers found with name: " + name);
			return "result";
		}
	}

	// delete customer
	@RequestMapping("/deleteid")
	public String deleteid(@RequestParam int id, Model model) {
		boolean c = dao.deleteId(id);
		if (c) {
			List<Customer> customerList = dao.datails();
			model.addAttribute("emplist", customerList);

			return "customerDetails";
		} else {
			model.addAttribute("errorMsg", "Employee not found with id: " + id);
			return "result";
		}

	}
//update customer
	@RequestMapping("/update")
	public String update(@RequestParam int id,@RequestParam String name, @RequestParam String contact, @RequestParam String address,
			@RequestParam String status, @RequestParam String email, Model model) {
		boolean c= dao.updateCustomer(id,name, contact, address, status, email);
		if (c) {
			List<Customer> customerList = dao.datails();
			model.addAttribute("emplist", customerList);

			return "redirect:/detail";
		} else {
			model.addAttribute("errorMsg", "Employee not found with id: " + id);
			return "result";
		}

	}


	// add receipt
	@RequestMapping("/receipt")
	public String receiptAdd(@ModelAttribute Shirt r, Model model) {
		boolean kk=dao.addReceipt(r);
		if (kk) {
			List<Customer> customerList = dao.datails();
			model.addAttribute("emplist", customerList);

			return "redirect:/detail";
		} else {
			model.addAttribute("errorMsg", "Employee not found with id: ");
			return "result";
		}
	}

	// reciept detail
	@RequestMapping("/recieptAll")
	public String showReciept(@RequestParam int id, Model model) {
		List<Receipt> list = dao.recieptdatails(id);
		if (list != null && !list.isEmpty()) {
			model.addAttribute("emplist", list);
			return "recieptDetails";
		} else {
			model.addAttribute("errorMsg", "No employees found.");
			return null;
		}
	}
	@RequestMapping("/bill")
	public String lastReciept(@RequestParam int id, Model model) {
		List<Receipt> list = dao.receiptLast(id);
		if (list != null && !list.isEmpty()) {
			model.addAttribute("emplistt", list);
			return "latestReceipt";
		} else {
			model.addAttribute("errorMsg", "No employees found.");
			return null;
		}
	}

}
