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
	public Integer create(CustomersInfo customersInfo) {
		
		return customersInfoDao.create(customersInfo);
		
	}

	@Override
	public List<CustomersInfo> read(String cust_name,String type,String group_company,
			String cust_code,String status,String corporation) {
		
		return customersInfoDao.read(cust_name, type, group_company, cust_code, status, corporation);
		
	}
	
	@Override
	public List<CustomersInfo> read4ID(Integer cust_id) {
		
		return customersInfoDao.read4ID(cust_id);
		
	}

	@Override
	public void confirm(Integer cust_id, String status) {
		
		customersInfoDao.confirm(cust_id, status); 
		
	}

	@Override
	public void update(CustomersInfo customersInfo) {
		
		customersInfoDao.update(customersInfo);
		
	}

	@Override
	public CustomersInfo get(Integer cust_id) {
		
		return customersInfoDao.get(cust_id);
		
	}

	@Override
	public List<CustomersInfo> readAll() {
		
		return customersInfoDao.readAll();
	}
	
	@Override
	public List<String> readCode() {
		
		return customersInfoDao.readCode();
	}

}
