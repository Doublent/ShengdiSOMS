package com.hand.service;

import java.util.List;

import com.hand.model.NormalDiscount;

public interface NormalDiscountService {

	public void save(NormalDiscount normalDiscount);

	public void remove(NormalDiscount normalDiscount);

	public List<NormalDiscount> findAll();

	public void update(NormalDiscount normalDiscount);

	public NormalDiscount findSingleById(int id);

	public List<NormalDiscount> findByCondition(NormalDiscount normalDiscount);

}
