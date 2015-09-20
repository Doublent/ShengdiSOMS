package com.hand.service;

import com.hand.model.CustDiscount;

public interface CustDiscountService {

	void create(CustDiscount custDiscount);
	
	CustDiscount get(Integer id);
	
	boolean idIsValid(Integer id);
	
}
