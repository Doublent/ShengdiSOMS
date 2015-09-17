package com.hand.service;

import java.util.List;

import com.hand.model.DiscountAppliedRecords;
import com.hand.model.SpecialDiscount;

public interface SpecialDiscountService {

	public void save(SpecialDiscount specialDiscount);

	public void remove(SpecialDiscount specialDiscount);

	public List<SpecialDiscount> findAll();

	public void update(SpecialDiscount specialDiscount);

	public SpecialDiscount findSingleById(int id);

	public List<SpecialDiscount> findByCondition(SpecialDiscount specialDiscount);

	public List<DiscountAppliedRecords> findAppliedRecordsById(int id);
}
