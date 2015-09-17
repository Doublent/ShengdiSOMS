package com.hand.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.CustContactorsDao;
import com.hand.model.CustContactors;

@Repository("custContactorsDao")
public class CustContactorsDaoImpl implements CustContactorsDao {
	
	/**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		
		
		
	}

	@Override
	public void create(CustContactors custContactors) {
		
		sessionFactory.getCurrentSession().save(custContactors);
		
	}

	@Override
	public CustContactors read(Integer id) {
		
		
		return null;
	}

	@Override
	public List<CustContactors> readAll() {
		
		
		return null;
	}

	@Override
	public void delete(Integer id) {
		
		
		
	}

	@Override
	public void update(Integer id, String str) {
		
		
		
	}

}
