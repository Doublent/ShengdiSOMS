<<<<<<< HEAD
package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.SpecialDiscountDao;
import com.hand.model.SpecialDiscount;

@Repository("specialDiscountDao")
public class SpecialDiscountDaoImpl implements SpecialDiscountDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().save(specialDiscount);
	}

	@Override
	public void remove(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().delete(specialDiscount);
	}

	@Override
	public SpecialDiscount findSingleById(int id) {
		return (SpecialDiscount) sessionFactory.getCurrentSession().get(SpecialDiscount.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpecialDiscount> findALL() {
		String hql = "from SpecialDiscount";
		List<SpecialDiscount> specialDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return specialDiscounts;
	}

	@Override
	public void update(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().update(specialDiscount);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpecialDiscount> findByCondition(String condition) {
		String hql = "from SpecialDiscount where 1 = 1 ";
		hql += condition;
		List<SpecialDiscount> specialDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return specialDiscounts;
	}

}
=======
package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.SpecialDiscountDao;
import com.hand.model.SpecialDiscount;

@Repository("specialDiscountDao")
public class SpecialDiscountDaoImpl implements SpecialDiscountDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().save(specialDiscount);
	}

	@Override
	public void remove(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().delete(specialDiscount);
	}

	@Override
	public SpecialDiscount findSingleById(int id) {
		return (SpecialDiscount) sessionFactory.getCurrentSession().get(SpecialDiscount.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpecialDiscount> findALL() {
		String hql = "from SpecialDiscount";
		List<SpecialDiscount> specialDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return specialDiscounts;
	}

	@Override
	public void update(SpecialDiscount specialDiscount) {
		sessionFactory.getCurrentSession().update(specialDiscount);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SpecialDiscount> findByCondition(String condition) {
		String hql = "from SpecialDiscount where 1 = 1 ";
		hql += condition;
		List<SpecialDiscount> specialDiscounts = sessionFactory.getCurrentSession().createQuery(hql).list();
		return specialDiscounts;
	}

}
>>>>>>> huangzijing
