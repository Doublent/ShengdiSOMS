package com.hand.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.AppliedRecordsDao;
import com.hand.dao.SpecialDiscountDao;
import com.hand.model.DiscountAppliedRecords;
import com.hand.model.SpecialDiscount;
import com.hand.service.SpecialDiscountService;

@Transactional
@Service("specialDiscountService")
public class SpecialDiscountServiceImpl implements SpecialDiscountService {

	@Autowired
	private SpecialDiscountDao	specialDiscountDao;
	@Autowired
	private AppliedRecordsDao	appliedRecordsDao;

	@Override
	public void save(SpecialDiscount specialDiscount) {
		this.specialDiscountDao.save(specialDiscount);
	}

	@Override
	public void remove(SpecialDiscount specialDiscount) {
		this.specialDiscountDao.remove(specialDiscount);
	}

	@Override
	public List<SpecialDiscount> findAll() {
		return this.specialDiscountDao.findALL();
	}

	@Override
	public void update(SpecialDiscount specialDiscount) {
		this.specialDiscountDao.update(specialDiscount);
	}

	@Override
	public SpecialDiscount findSingleById(int id) {
		return this.specialDiscountDao.findSingleById(id);
	}

	@Override
	public List<SpecialDiscount> findByCondition(SpecialDiscount specialDiscount) {
		String condition = "";
		if (specialDiscount.getDiscount_name().trim().length() != 0) {
			System.out.println("discount_name=" + specialDiscount.getDiscount_name());
			condition += " and discount_name = '" + specialDiscount.getDiscount_name() + "'";
		}
		if (specialDiscount.getCust_code().trim().length() != 0) {
			System.out.println("cust_code=" + specialDiscount.getCust_code());
			condition += " and cust_code = '" + specialDiscount.getCust_code() + "'";
		}
		System.out.println("HQL = " + condition);
		if (condition.trim() == "" || condition == null) {
			return this.findAll();
		} else {
			return specialDiscountDao.findByCondition(condition);
		}
	}

	@Override
	public List<DiscountAppliedRecords> findAppliedRecordsById(int id) {
		return this.appliedRecordsDao.findAllById(id);
	}

}
