package com.hand.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="om_user_info",schema="Shengdisoms")
public class User {

	private String	username;
	private String	password;
	private String	name;
	private int		user_id;
	private String	en_name;
	private String	position;
	private String	phone;
	private String	email;
	private Date	invalid_date;

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "user_id", unique = true, nullable = false, length = 10)
	@GeneratedValue
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Column(name = "en_name")
	public String getEn_name() {
		return en_name;
	}

	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}

	@Column(name = "position")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "invalid_date")
	public Date getInvalid_date() {
		return invalid_date;
	}

	public void setInvalid_date(Date invalid_date) {
		this.invalid_date = invalid_date;
	}

	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + ", name=" + name + ", user_id=" + user_id
				+ ", en_name=" + en_name + ", position=" + position + ", phone=" + phone + ", email=" + email
				+ ", invalid_date=" + invalid_date + "]";
	}

}
