package com.hand.model;

import javax.persistence.*;

@Entity
@Table(name = "om_normal_discount", schema = "ShengdiSOMS")
public class NormalDiscount {

	private int		discount_id;
	private String	discount_name;
	private String	type;
	private String	discount_base;
	private int		base_qty;
	private double	discount_rate;
	private String	activity;

	public NormalDiscount() {

	}

	public NormalDiscount(int discount_id, String discount_name, String type, String discount_base, int base_qty,
			double discount_rate, String activity) {
		super();
		this.discount_id = discount_id;
		this.discount_name = discount_name;
		this.type = type;
		this.discount_base = discount_base;
		this.base_qty = base_qty;
		this.discount_rate = discount_rate;
		this.activity = activity;
	}

	@Id
	@Column(name = "discount_id", unique = true, nullable = false, length = 10)
	@GeneratedValue
	public int getDiscount_id() {
		return discount_id;
	}

	public void setDiscount_id(int discount_id) {
		this.discount_id = discount_id;
	}

	@Column(name = "discount_name")
	public String getDiscount_name() {
		return discount_name;
	}

	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}

	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "Discount_base")
	public String getDiscount_base() {
		return discount_base;
	}

	public void setDiscount_base(String discount_base) {
		this.discount_base = discount_base;
	}

	@Column(name = "Base_qty")
	public int getBase_qty() {
		return base_qty;
	}

	public void setBase_qty(int base_qty) {
		this.base_qty = base_qty;
	}

	@Column(name = "Discount_rate")
	public double getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(double discount_rate) {
		this.discount_rate = discount_rate;
	}

	@Column(name = "activity")
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "NormalDiscount [discount_id=" + discount_id + ", discount_name=" + discount_name + ", type=" + type
				+ ", discount_base=" + discount_base + ", base_qty=" + base_qty + ", discount_rate=" + discount_rate
				+ ", activity=" + activity + "]";
	}
}
