package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			int id = rs.getInt("id");
	        String address = rs.getString("address");
	        String contact = rs.getString("contact");
	        String name = rs.getString("name");
	        int payment = rs.getInt("payment");
	        int payment_paid = rs.getInt("payment_paid");
	        int payment_pending = rs.getInt("payment_pending");
	        String status = rs.getString("status");
	        String email = rs.getString("email");
	        
	        return new Customer(id, address, contact, name, payment, payment_paid, payment_pending, status, email);
	    }	}


