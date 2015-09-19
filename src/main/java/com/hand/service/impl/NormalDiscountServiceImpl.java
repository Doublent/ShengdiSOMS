package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.NormalDiscountDao;
import com.hand.model.NormalDiscount;
import com.hand.service.NormalDiscountService;

@Transactional
@Service("normalDiscountService")
// @Component("normalDiscountService")
public class NormalDiscountServiceImpl implements NormalDiscountService {

	@Autowired
	private NormalDiscountDao normalDiscountDao;

	public NormalDiscountDao getNormalDiscountDao() {
		return normalDiscountDao;
	}

	public void setNormalDiscountDao(NormalDiscountDao normalDiscountDao) {
		this.normalDiscountDao = normalDiscountDao;
	}

	@Override
	public void save(NormalDiscount normalDiscount) {
		normalDiscountDao.save(normalDiscount);
	}

	@Override
	public void remove(NormalDiscount normalDiscount) {
		normalDiscountDao.remove(normalDiscount);
	}

	@Override
	public List<NormalDiscount> findAll() {
		return normalDiscountDao.findALL();
	}

	@Override
	public void update(NormalDiscount normalDiscount) {
		normalDiscountDao.update(normalDiscount);
	}

	@Override
	public NormalDiscount findSingleById(int id) {
		System.out.println("NormalDiscountServiceImpl.findSingleById()");
		return normalDiscountDao.findSingleById(id);
	}

	@Override
	public List<NormalDiscount> findByCondition(NormalDiscount normalDiscount) {
		String condition = "";
		if (normalDiscount.getDiscount_name().trim().length() != 0) {
			condition += " and discount_name = '" + normalDiscount.getDiscount_name() + "'";
		}
		if (normalDiscount.getType().trim().length() != 0) {
			condition += " and type = '" + normalDiscount.getType() + "'";
		}
		System.out.println("HQL = " + condition);
		if (condition.trim() == "" || condition == null) {
			return this.findAll();
		} else {
			return normalDiscountDao.findByCondition(condition);
		}
	}

}
