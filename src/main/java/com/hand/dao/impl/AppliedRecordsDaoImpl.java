package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.AppliedRecordsDao;
import com.hand.model.DiscountAppliedRecords;

@Repository("appliedRecordsDao")
public class AppliedRecordsDaoImpl implements AppliedRecordsDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DiscountAppliedRecords> findAllById(int id) {
		String hql = "from DiscountAppliedRecords as dar where dar.discount_id = " + id;
		List<DiscountAppliedRecords> discountAppliedRecords = sessionFactory.getCurrentSession().createQuery(hql)
				.list();
		return discountAppliedRecords;
	}

}
