package com.hand.dao.impl;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.CustDiscountDao;
import com.hand.model.CustDiscount;

@Repository("custDiscountDao")
public class CustDiscountDaoImpl implements CustDiscountDao {

	/**
     * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
     */
    @Autowired
    private SessionFactory sessionFactory;
	
    @Override
    public void setDataSource(DataSource dataSource) {
    	// TODO Auto-generated method stub
    	
    }
    
	@Override
	public void create(CustDiscount custDiscount) {
				
		sessionFactory.getCurrentSession().save(custDiscount);
		
	}

	@Override
	public CustDiscount get(Integer id) {
		
		return (CustDiscount) sessionFactory.getCurrentSession().get(CustDiscount.class, id);
		
	}

}
