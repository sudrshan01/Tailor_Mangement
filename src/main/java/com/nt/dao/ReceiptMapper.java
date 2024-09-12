package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.entity.Receipt;

public class ReceiptMapper implements RowMapper<Receipt> {

    @Override
    public Receipt mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String currDate = rs.getString("curr_date");
        String deliveryDate = rs.getString("delivery_date");
        int customer = rs.getInt("customer");
        String status = rs.getString("status");
        int shirtId = rs.getInt("shirt_id");
        int pantId = rs.getInt("pant_id");
        float amount = rs.getFloat("amount");
        float paidAmount = rs.getFloat("paid_amount");
        float pendingAmount = rs.getFloat("pending_amount");

        return new Receipt(id, currDate, deliveryDate, customer, status, shirtId, pantId, amount, paidAmount, pendingAmount);
    }
}
