package com.hand.dao;

import java.util.List;

import com.hand.model.SpecialDiscount;

public interface SpecialDiscountDao {
	
	public void save(SpecialDiscount specialDiscount);

	public void remove(SpecialDiscount specialDiscount);

	public SpecialDiscount findSingleById(int id);

	public List<SpecialDiscount> findALL();

	public void update(SpecialDiscount specialDiscount);
	
	public List<SpecialDiscount> findByCondition(String condition);
}
