package com.hand.dao;

import javax.sql.DataSource;

import com.hand.model.CustDiscount;

public interface CustDiscountDao {
	
	public void setDataSource(DataSource dataSource);
	
	public void create(CustDiscount custDiscount);
	
	public CustDiscount get(Integer id);
}
