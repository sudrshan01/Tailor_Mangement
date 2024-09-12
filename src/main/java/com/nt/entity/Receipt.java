package com.nt.entity;

public class Receipt {
	private int id;
	private String curr_date;
	private String delivery_date;
	private int customer;
	private String status;
	private int shirt_id;
	private int pant_id;
	private float amount;
	private float paid_amount;
	private float pending_amount;


	public Receipt(int id, String curr_date, String delivery_date, int customer, String status, int shirt_id,
			int pant_id, float amount, float paid_amount, float pending_amount) {
		super();
		this.id = id;
		this.curr_date = curr_date;
		this.delivery_date = delivery_date;
		this.customer = customer;
		this.status = status;
		this.shirt_id = shirt_id;
		this.pant_id = pant_id;
		this.amount = amount;
		this.paid_amount = paid_amount;
		this.pending_amount = pending_amount;
	}

		public Receipt(String curr_date, String delivery_date, int customer, String status, int shirt_id, int pant_id,
			float amount, float paid_amount, float pending_amount) {
		super();
		this.curr_date = curr_date;
		this.delivery_date = delivery_date;
		this.customer = customer;
		this.status = status;
		this.shirt_id = shirt_id;
		this.pant_id = pant_id;
		this.amount = amount;
		this.paid_amount = paid_amount;
		this.pending_amount = pending_amount;
	}

	public Receipt() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurr_date() {
		return curr_date;
	}

	public void setCurr_date(String curr_date) {
		this.curr_date = curr_date;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getShirt_id() {
		return shirt_id;
	}

	public void setShirt_id(int shirt_id) {
		this.shirt_id = shirt_id;
	}

	public int getPant_id() {
		return pant_id;
	}

	public void setPant_id(int pant_id) {
		this.pant_id = pant_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(float paid_amount) {
		this.paid_amount = paid_amount;
	}

	public float getPending_amount() {
		return pending_amount;
	}

	public void setPending_amount(float pending_amount) {
		this.pending_amount = pending_amount;
	}

	
}
