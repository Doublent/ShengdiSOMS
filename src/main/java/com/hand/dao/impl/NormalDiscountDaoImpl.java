package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.NormalDiscountDao;
import com.hand.model.NormalDiscount;

@Repository("normalDiscountDao")
public class NormalDiscountDaoImpl implements NormalDiscountDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(NormalDiscount normalDiscount) {
		sessionFactory.getCurrentSession().save(normalDiscount);
	}

	@Override
	public void remove(NormalDiscount normalDiscount) {
		sessionFactory.getCurrentSession().delete(normalDiscount);
	}

	@Override
	public NormalDiscount findSingleById(int id) {
		return (NormalDiscount) sessionFactory.getCurrentSession().get(NormalDiscount.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NormalDiscount> findALL() {
		String hql = "from NormalDiscount";
		List<NormalDiscount> normalDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return normalDiscounts;
	}

	@Override
	public void update(NormalDiscount normalDiscount) {
		sessionFactory.getCurrentSession().update(normalDiscount);
	}

	@SuppressWarnings("unchecked")
	public List<NormalDiscount> findByCondition(String condition) {
		String hql = "from NormalDiscount where 1 = 1 ";
		hql += condition;
		List<NormalDiscount> normalDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return normalDiscounts;
	}
}
