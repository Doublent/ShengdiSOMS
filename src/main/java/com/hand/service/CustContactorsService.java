package com.hand.service;

import java.util.List;

import com.hand.model.CustContactors;
import com.hand.model.CustomersInfo;

public interface CustContactorsService {
	
	void create(CustContactors custContactors);
	
	List<CustContactors> read4ID(Integer cust_id);
	
	CustContactors get(Integer cust_id);
	
	void update(CustContactors custContactors);
	
}
