package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.CustContactorsDao;
import com.hand.model.CustContactors;
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

}
