package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.CustDiscountDao;
import com.hand.model.CustDiscount;
import com.hand.service.CustDiscountService;

@Transactional
@Service("custDiscountService")
public class CustDiscountServiceImpl implements CustDiscountService {

	/**
	 * 注入Dao
	 */
	@Autowired
	private CustDiscountDao custDiscountDao;
	
	@Override
	public void create(CustDiscount custDiscount) {
		
		custDiscountDao.create(custDiscount);
		
	}

	@Override
	public CustDiscount get(Integer id) {
			
			return custDiscountDao.get(id);
			
	}

	@Override
	public boolean idIsValid(Integer id) {
		return custDiscountDao.get(id) == null;
	}
	
	

}
