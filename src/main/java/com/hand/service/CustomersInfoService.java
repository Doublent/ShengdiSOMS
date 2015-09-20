package com.hand.service;

import java.util.List;

import com.hand.model.CustomersInfo;

public interface CustomersInfoService {
	
	Integer create(CustomersInfo customersInfo);
	
	List<CustomersInfo> read(String cust_name,String type,String group_company,
			String cust_code,String status,String corporation);
	
	List<CustomersInfo> read4ID(Integer cust_id);
	
	List<CustomersInfo> readAll();
	
	List<String> readCode();
	
	void confirm(Integer cust_id ,String status);
	
	void update(CustomersInfo customersInfo);
	
	CustomersInfo get(Integer cust_id);
	
}
