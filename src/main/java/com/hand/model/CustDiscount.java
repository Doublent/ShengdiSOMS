package com.hand.model;

public class CustDiscount {

	private int discount_id;
	private String discount_name;
	private String type;
	private String default_;
	private String criterion;
	private int base_qty;
	private double discount_rate;
	private String active;

	public CustDiscount() {
		super();
	}

	public CustDiscount(int discount_id, String discount_name, String type, String default_, String criterion,
			int base_qty, double discount_rate, String active) {
		super();
		this.discount_id = discount_id;
		this.discount_name = discount_name;
		this.type = type;
		this.default_ = default_;
		this.criterion = criterion;
		this.base_qty = base_qty;
		this.discount_rate = discount_rate;
		this.active = active;
	}

	public int getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(int discount_id) {
		this.discount_id = discount_id;
	}

	public String getDiscount_name() {
		return discount_name;
	}

	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDefault_() {
		return default_;
	}

	public void setDefault_(String default_) {
		this.default_ = default_;
	}

	public String getCriterion() {
		return criterion;
	}

	public void setCriterion(String criterion) {
		this.criterion = criterion;
	}

	public int getBase_qty() {
		return base_qty;
	}

	public void setBase_qty(int base_qty) {
		this.base_qty = base_qty;
	}

	public double getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(double discount_rate) {
		this.discount_rate = discount_rate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "CustDiscount [discount_id=" + discount_id + ", discount_name=" + discount_name + ", type=" + type
				+ ", default_=" + default_ + ", criterion=" + criterion + ", base_qty=" + base_qty + ", discount_rate="
				+ discount_rate + ", active=" + active + "]";
	}

}
