package com.hand.dao;

import java.util.List;

import com.hand.model.DiscountAppliedRecords;

public interface AppliedRecordsDao {
	
	public List<DiscountAppliedRecords> findAllById(int id);
	
//	public void save(DiscountAppliedRecords discountAppliedRecord);
//
//	public void remove(DiscountAppliedRecords discountAppliedRecord);
//
//	public DiscountAppliedRecords findSingleById(int id);
//
//	public List<DiscountAppliedRecords> findALL();
//
//	public void update(DiscountAppliedRecords DiscountAppliedRecord);
	
//	public List<DiscountAppliedRecords> findByCondition(String condition);
}
