package com.nt.entity;

public class Pant {
	private int id;
	private int customer_id;
	private String pant_height;
	private String pant_knee;
	private String pant_legs_bottom;
	private String pant_other;
	private String pant_pocket;
	private String pant_press;
	private int pant_quantity;
	private float pant_rate;
	private String pant_seat;
	private String pant_shape;
	private String pant_thigh;
	private String pant_tip;
	private String pant_type;
	private String pant_waist;
	
	public Pant() {
		super();
	}
	
	public Pant(int id, int customer_id, String pant_height, String pant_knee, String pant_legs_bottom,
			String pant_other, String pant_pocket, String pant_press, int pant_quantity, float pant_rate,
			String pant_seat, String pant_shape, String pant_thigh, String pant_tip, String pant_type,
			String pant_waist) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.pant_height = pant_height;
		this.pant_knee = pant_knee;
		this.pant_legs_bottom = pant_legs_bottom;
		this.pant_other = pant_other;
		this.pant_pocket = pant_pocket;
		this.pant_press = pant_press;
		this.pant_quantity = pant_quantity;
		this.pant_rate = pant_rate;
		this.pant_seat = pant_seat;
		this.pant_shape = pant_shape;
		this.pant_thigh = pant_thigh;
		this.pant_tip = pant_tip;
		this.pant_type = pant_type;
		this.pant_waist = pant_waist;
	}

	public Pant(int customer_id, String pant_height, String pant_knee, String pant_legs_bottom, String pant_other,
			String pant_pocket, String pant_press, int pant_quantity, float pant_rate, String pant_seat,
			String pant_shape, String pant_thigh, String pant_tip, String pant_type, String pant_waist) {
		super();
		this.customer_id = customer_id;
		this.pant_height = pant_height;
		this.pant_knee = pant_knee;
		this.pant_legs_bottom = pant_legs_bottom;
		this.pant_other = pant_other;
		this.pant_pocket = pant_pocket;
		this.pant_press = pant_press;
		this.pant_quantity = pant_quantity;
		this.pant_rate = pant_rate;
		this.pant_seat = pant_seat;
		this.pant_shape = pant_shape;
		this.pant_thigh = pant_thigh;
		this.pant_tip = pant_tip;
		this.pant_type = pant_type;
		this.pant_waist = pant_waist;
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
	public String getPant_height() {
		return pant_height;
	}
	public void setPant_height(String pant_height) {
		this.pant_height = pant_height;
	}
	public String getPant_knee() {
		return pant_knee;
	}
	public void setPant_knee(String pant_knee) {
		this.pant_knee = pant_knee;
	}
	public String getPant_legs_bottom() {
		return pant_legs_bottom;
	}
	public void setPant_legs_bottom(String pant_legs_bottom) {
		this.pant_legs_bottom = pant_legs_bottom;
	}
	public String getPant_other() {
		return pant_other;
	}
	public void setPant_other(String pant_other) {
		this.pant_other = pant_other;
	}
	public String getPant_pocket() {
		return pant_pocket;
	}
	public void setPant_pocket(String pant_pocket) {
		this.pant_pocket = pant_pocket;
	}
	public String getPant_press() {
		return pant_press;
	}
	public void setPant_press(String pant_press) {
		this.pant_press = pant_press;
	}
	public int getPant_quantity() {
		return pant_quantity;
	}
	public void setPant_quantity(int pant_quantity) {
		this.pant_quantity = pant_quantity;
	}
	public float getPant_rate() {
		return pant_rate;
	}
	public void setPant_rate(float pant_rate) {
		this.pant_rate = pant_rate;
	}
	public String getPant_seat() {
		return pant_seat;
	}
	public void setPant_seat(String pant_seat) {
		this.pant_seat = pant_seat;
	}
	public String getPant_shape() {
		return pant_shape;
	}
	public void setPant_shape(String pant_shape) {
		this.pant_shape = pant_shape;
	}
	public String getPant_thigh() {
		return pant_thigh;
	}
	public void setPant_thigh(String pant_thigh) {
		this.pant_thigh = pant_thigh;
	}
	public String getPant_tip() {
		return pant_tip;
	}
	public void setPant_tip(String pant_tip) {
		this.pant_tip = pant_tip;
	}
	public String getPant_type() {
		return pant_type;
	}
	public void setPant_type(String pant_type) {
		this.pant_type = pant_type;
	}
	public String getPant_waist() {
		return pant_waist;
	}
	public void setPant_waist(String pant_waist) {
		this.pant_waist = pant_waist;
	}

}
