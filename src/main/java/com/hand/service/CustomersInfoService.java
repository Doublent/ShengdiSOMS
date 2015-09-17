package com.hand.service;

import java.util.List;

import com.hand.model.CustomersInfo;

public interface CustomersInfoService {
	
	void create(CustomersInfo customersInfo);
	
	List<CustomersInfo> read(String cust_name);
	
}
