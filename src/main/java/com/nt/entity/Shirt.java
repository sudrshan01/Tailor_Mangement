package com.nt.entity;

public class Shirt {
	private int id;
	private int customer_id;
	private String shirt_chest;
	private String shirt_collar;
	private String shirt_hand_loose;
	private String shirt_height;
	private String shirt_loose;

	private String shirt_other;
	private String shirt_press;
	private int shirt_quantity;
	private float shirt_rate;
	private String shirt_shape;
	private String shirt_shoulder;
	private String shirt_sleeve;
	private String shirt_sleeve_cup;
	private String shirt_stomach;
	private String shirt_type;
	private Pant pant;
	private Receipt receipt;
	public Shirt(int id, int customer_id, String shirt_chest, String shirt_collar, String shirt_hand_loose,
			String shirt_height, String shirt_loose, String shirt_other, String shirt_press, int shirt_quantity,
			float shirt_rate, String shirt_shape, String shirt_shoulder, String shirt_sleeve, String shirt_sleeve_cup,
			String shirt_stomach, String shirt_type, Pant pant, Receipt receipt) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.shirt_chest = shirt_chest;
		this.shirt_collar = shirt_collar;
		this.shirt_hand_loose = shirt_hand_loose;
		this.shirt_height = shirt_height;
		this.shirt_loose = shirt_loose;
		this.shirt_other = shirt_other;
		this.shirt_press = shirt_press;
		this.shirt_quantity = shirt_quantity;
		this.shirt_rate = shirt_rate;
		this.shirt_shape = shirt_shape;
		this.shirt_shoulder = shirt_shoulder;
		this.shirt_sleeve = shirt_sleeve;
		this.shirt_sleeve_cup = shirt_sleeve_cup;
		this.shirt_stomach = shirt_stomach;
		this.shirt_type = shirt_type;
		this.pant = pant;
		this.receipt = receipt;
	}
	public Shirt(int id, int customer_id, String shirt_chest, String shirt_collar, String shirt_hand_loose,
			String shirt_height, String shirt_loose, String shirt_other, String shirt_press, int shirt_quantity,
			float shirt_rate, String shirt_shape, String shirt_shoulder, String shirt_sleeve, String shirt_sleeve_cup,
			String shirt_stomach, String shirt_type) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.shirt_chest = shirt_chest;
		this.shirt_collar = shirt_collar;
		this.shirt_hand_loose = shirt_hand_loose;
		this.shirt_height = shirt_height;
		this.shirt_loose = shirt_loose;
		this.shirt_other = shirt_other;
		this.shirt_press = shirt_press;
		this.shirt_quantity = shirt_quantity;
		this.shirt_rate = shirt_rate;
		this.shirt_shape = shirt_shape;
		this.shirt_shoulder = shirt_shoulder;
		this.shirt_sleeve = shirt_sleeve;
		this.shirt_sleeve_cup = shirt_sleeve_cup;
		this.shirt_stomach = shirt_stomach;
		this.shirt_type = shirt_type;
	}
	public Shirt(int customer_id, String shirt_chest, String shirt_collar, String shirt_hand_loose, String shirt_height,
			String shirt_loose, String shirt_other, String shirt_press, int shirt_quantity, float shirt_rate,
			String shirt_shape, String shirt_shoulder, String shirt_sleeve, String shirt_sleeve_cup,
			String shirt_stomach, String shirt_type) {
		super();
		this.customer_id = customer_id;
		this.shirt_chest = shirt_chest;
		this.shirt_collar = shirt_collar;
		this.shirt_hand_loose = shirt_hand_loose;
		this.shirt_height = shirt_height;
		this.shirt_loose = shirt_loose;
		this.shirt_other = shirt_other;
		this.shirt_press = shirt_press;
		this.shirt_quantity = shirt_quantity;
		this.shirt_rate = shirt_rate;
		this.shirt_shape = shirt_shape;
		this.shirt_shoulder = shirt_shoulder;
		this.shirt_sleeve = shirt_sleeve;
		this.shirt_sleeve_cup = shirt_sleeve_cup;
		this.shirt_stomach = shirt_stomach;
		this.shirt_type = shirt_type;
	}
	public Shirt() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getShirt_chest() {
		return shirt_chest;
	}
	public void setShirt_chest(String shirt_chest) {
		this.shirt_chest = shirt_chest;
	}
	public String getShirt_collar() {
		return shirt_collar;
	}
	public void setShirt_collar(String shirt_collar) {
		this.shirt_collar = shirt_collar;
	}
	public String getShirt_hand_loose() {
		return shirt_hand_loose;
	}
	public void setShirt_hand_loose(String shirt_hand_loose) {
		this.shirt_hand_loose = shirt_hand_loose;
	}
	public String getShirt_height() {
		return shirt_height;
	}
	public void setShirt_height(String shirt_height) {
		this.shirt_height = shirt_height;
	}
	public String getShirt_loose() {
		return shirt_loose;
	}
	public void setShirt_loose(String shirt_loose) {
		this.shirt_loose = shirt_loose;
	}
	public String getShirt_other() {
		return shirt_other;
	}
	public void setShirt_other(String shirt_other) {
		this.shirt_other = shirt_other;
	}
	public String getShirt_press() {
		return shirt_press;
	}
	public void setShirt_press(String shirt_press) {
		this.shirt_press = shirt_press;
	}
	public int getShirt_quantity() {
		return shirt_quantity;
	}
	public void setShirt_quantity(int shirt_quantity) {
		this.shirt_quantity = shirt_quantity;
	}
	public float getShirt_rate() {
		return shirt_rate;
	}
	public void setShirt_rate(float shirt_rate) {
		this.shirt_rate = shirt_rate;
	}
	public String getShirt_shape() {
		return shirt_shape;
	}
	public void setShirt_shape(String shirt_shape) {
		this.shirt_shape = shirt_shape;
	}
	public String getShirt_shoulder() {
		return shirt_shoulder;
	}
	public void setShirt_shoulder(String shirt_shoulder) {
		this.shirt_shoulder = shirt_shoulder;
	}
	public String getShirt_sleeve() {
		return shirt_sleeve;
	}
	public void setShirt_sleeve(String shirt_sleeve) {
		this.shirt_sleeve = shirt_sleeve;
	}
	public String getShirt_sleeve_cup() {
		return shirt_sleeve_cup;
	}
	public void setShirt_sleeve_cup(String shirt_sleeve_cup) {
		this.shirt_sleeve_cup = shirt_sleeve_cup;
	}
	public String getShirt_stomach() {
		return shirt_stomach;
	}
	public void setShirt_stomach(String shirt_stomach) {
		this.shirt_stomach = shirt_stomach;
	}
	public String getShirt_type() {
		return shirt_type;
	}
	public void setShirt_type(String shirt_type) {
		this.shirt_type = shirt_type;
	}
	public Pant getPant() {
		return pant;
	}
	public void setPant(Pant pant) {
		this.pant = pant;
	}
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
		
}
