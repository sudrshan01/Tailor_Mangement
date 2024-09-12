package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDao {
	@Autowired
	private JdbcTemplate template;
		
	
	}


//PreparedStatement ps = null;
//ResultSet rs = null;
//System.out.println(username + " " + password);
//try {
//	ps = con.prepareStatement("SELECT password, id FROM users WHERE username =?");
//	ps.setString(1, username);
//	rs = ps.executeQuery();
//
//	if (rs.next()) {
//		String pass = rs.getString("password");
//		int ur = rs.getInt("id");
//		System.out.println(ur);
//
//		Productdao v = new Productdao(ur);
//		System.out.println(pass);
//		if (pass.equals(password)) {
//			System.out.println(pass + "  " + password);
//			return true;
//		}
//	}
//} catch (Exception e) {
//	e.printStackTrace(); // Proper error handling should be implemented
//} finally {
//	// Close resources properly in finally block
//	try {
//		if (rs != null)
//			rs.close();
//		if (ps != null)
//			ps.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
//return false;
//}

