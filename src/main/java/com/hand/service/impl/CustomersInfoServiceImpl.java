package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.CustomersInfoDao;
import com.hand.model.CustomersInfo;
import com.hand.service.CustomersInfoService;

@Transactional
@Service("customersInfoService")
public class CustomersInfoServiceImpl implements CustomersInfoService {
	
	/**
     * 注入Dao
     */
    @Autowired
    private CustomersInfoDao customersInfoDao;
	
	@Override
	public void create(CustomersInfo customersInfo) {
		
		customersInfoDao.create(customersInfo);
		
	}

	@Override
	public List<CustomersInfo> read(String cust_name) {
		
		return customersInfoDao.read(cust_name);
		
	}
	
	

}
