package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.CustContactorsDao;
import com.hand.model.CustContactors;
import com.hand.model.CustomersInfo;
import com.hand.service.CustContactorsService;

@Transactional
@Service("custContactorsService")
public class CustContactorsServiceImpl implements CustContactorsService {

	/**
	 * 注入Dao
	 */
	@Autowired
	private CustContactorsDao custContactorsDao;

	@Override
	public void create(CustContactors custContactors) {

		custContactorsDao.create(custContactors);

	}

	public List<CustContactors> read4ID(Integer cust_id) {

		return custContactorsDao.read4ID(cust_id);

	}

	@Override
	public CustContactors get(Integer cust_id) {

		return custContactorsDao.get(cust_id);

	}

	@Override
	public void update(CustContactors custContactors) {
		
		custContactorsDao.update(custContactors);
		
	}

}
