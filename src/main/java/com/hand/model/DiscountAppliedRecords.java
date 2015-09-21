<<<<<<< HEAD
package com.hand.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "om_discount_applied_records	", schema = "ShengdiSOMS")
public class DiscountAppliedRecords {

	private int		id;
	private int		discount_id;
	private String	discount_name;
	private String	cust_code;
	private String	dn_identify_num;
	private double	applied_amount;
	private Date	applied_date;
	private String	cancel;
	private Date	cancel_date;

	public DiscountAppliedRecords() {

	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Discount_id")
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

	@Column(name = "Cust_code")
	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	@Column(name = "DN_identify_num")
	public String getDn_identify_num() {
		return dn_identify_num;
	}

	public void setDn_identify_num(String dn_identify_num) {
		this.dn_identify_num = dn_identify_num;
	}

	@Column(name = "Applied_amount")
	public double getApplied_amount() {
		return applied_amount;
	}

	public void setApplied_amount(double applied_amount) {
		this.applied_amount = applied_amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "applied_date")
	public Date getApplied_date() {
		return applied_date;
	}

	public void setApplied_date(Date applied_date) {
		this.applied_date = applied_date;
	}

	@Column(name = "cancel")
	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Cancel_date")
	public Date getCancel_date() {
		return cancel_date;
	}

	public void setCancel_date(Date cancel_date) {
		this.cancel_date = cancel_date;
	}

	@Override
	public String toString() {
		return "DiscountAppliedRecords [id=" + id + ", discount_id=" + discount_id + ", discount_name=" + discount_name
				+ ", cust_code=" + cust_code + ", dn_identify_num=" + dn_identify_num + ", applied_amount="
				+ applied_amount + ", applied_date=" + applied_date + ", cancel=" + cancel + ", cancel_date="
				+ cancel_date + "]";
	}
	
}
=======
package com.hand.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "om_discount_applied_records	", schema = "ShengdiSOMS")
public class DiscountAppliedRecords {

	private int		id;
	private int		discount_id;
	private String	discount_name;
	private String	cust_code;
	private String	dn_identify_num;
	private double	applied_amount;
	private Date	applied_date;
	private String	cancel;
	private Date	cancel_date;

	public DiscountAppliedRecords() {

	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 10)
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Discount_id")
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

	@Column(name = "Cust_code")
	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	@Column(name = "DN_identify_num")
	public String getDn_identify_num() {
		return dn_identify_num;
	}

	public void setDn_identify_num(String dn_identify_num) {
		this.dn_identify_num = dn_identify_num;
	}

	@Column(name = "Applied_amount")
	public double getApplied_amount() {
		return applied_amount;
	}

	public void setApplied_amount(double applied_amount) {
		this.applied_amount = applied_amount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "applied_date")
	public Date getApplied_date() {
		return applied_date;
	}

	public void setApplied_date(Date applied_date) {
		this.applied_date = applied_date;
	}

	@Column(name = "cancel")
	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Cancel_date")
	public Date getCancel_date() {
		return cancel_date;
	}

	public void setCancel_date(Date cancel_date) {
		this.cancel_date = cancel_date;
	}

	@Override
	public String toString() {
		return "DiscountAppliedRecords [id=" + id + ", discount_id=" + discount_id + ", discount_name=" + discount_name
				+ ", cust_code=" + cust_code + ", dn_identify_num=" + dn_identify_num + ", applied_amount="
				+ applied_amount + ", applied_date=" + applied_date + ", cancel=" + cancel + ", cancel_date="
				+ cancel_date + "]";
	}
	
}
>>>>>>> huangzijing
