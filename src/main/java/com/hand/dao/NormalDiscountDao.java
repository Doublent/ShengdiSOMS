package com.hand.dao;

import java.util.List;

import com.hand.model.NormalDiscount;

public interface NormalDiscountDao {
	
	public void save(NormalDiscount normalDiscount);

	public void remove(NormalDiscount normalDiscount);

	public NormalDiscount findSingleById(int id);

	public List<NormalDiscount> findALL();

	public void update(NormalDiscount normalDiscount);
	
	public List<NormalDiscount> findByCondition(String condition);
}
