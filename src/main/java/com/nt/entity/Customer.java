package com.nt.entity;

public class Customer {
private int id;
private String address;
private String contact;
private String name;
private int payment;
private int payment_paid;
private int payment_pending;
private String status;
private String email;

public Customer(int id, String address, String contact, String name, int payment, int payment_paid, int payment_pending,
		String status, String email) {
	super();
	this.id = id;
	this.address = address;
	this.contact = contact;
	this.name = name;
	this.payment = payment;
	this.payment_paid = payment_paid;
	this.payment_pending = payment_pending;
	this.status = status;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPayment() {
	return payment;
}
public void setPayment(int payment) {
	this.payment = payment;
}
public int getPayment_paid() {
	return payment_paid;
}
public void setPayment_paid(int payment_paid) {
	this.payment_paid = payment_paid;
}
public int getPayment_pending() {
	return payment_pending;
}
public void setPayment_pending(int payment_pending) {
	this.payment_pending = payment_pending;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Customer(String address, String contact, String name, int payment, int payment_paid, int payment_pending,
		String status, String email) {
	super();
	this.address = address;
	this.contact = contact;
	this.name = name;
	this.payment = payment;
	this.payment_paid = payment_paid;
	this.payment_pending = payment_pending;
	this.status = status;
	this.email = email;
}
public Customer() {
	super();
}


}
