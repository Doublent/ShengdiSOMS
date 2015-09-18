package com.hand.service;

import java.util.List;

import com.hand.model.CustomersInfo;

public interface CustomersInfoService {
	
	void create(CustomersInfo customersInfo);
	
	List<CustomersInfo> read(String cust_name);
	
	List<CustomersInfo> read4ID(Integer cust_id);
	
	void confirm(Integer cust_id ,String status);
	
	void update(CustomersInfo customersInfo);
	
	CustomersInfo get(Integer cust_id);
	
}
