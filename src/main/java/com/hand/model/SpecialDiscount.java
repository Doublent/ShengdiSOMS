package com.hand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "om_special_discount", schema = "ShengdiSOMS")
public class SpecialDiscount {

	private int		discount_id;
	private int		cust_id;
	private String	discount_name;
	private String	cust_code;
	private double	amount;
	private double	applied_amount;
	private double	balance;
	private String	activity;

	public SpecialDiscount() {

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

	@Column(name = "Cust_id")
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Column(name = "discount_name")
	public String getDiscount_name() {
		return discount_name;
	}

	public void setDiscount_name(String discount_name) {
		this.discount_name = discount_name;
	}

	@Column(name = "Cust_code")
	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	@Column(name = "Amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "Applied_amount")
	public double getApplied_amount() {
		return applied_amount;
	}

	public void setApplied_amount(double applied_amount) {
		this.applied_amount = applied_amount;
	}

	@Column(name = "Balance")
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = this.amount - this.applied_amount;
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
		return "SpecialDiscount [discount_id=" + discount_id + ", cust_id=" + cust_id + ", discount_name="
				+ discount_name + ", cust_code=" + cust_code + ", amount=" + amount + ", applied_amount="
				+ applied_amount + ", balance=" + balance + ", activity=" + activity + "]";
	}

}
