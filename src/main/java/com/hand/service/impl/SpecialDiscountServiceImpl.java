<<<<<<< HEAD
package com.hand.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		List<SpecialDiscount> specialDiscountList = this.specialDiscountDao.findALL();
		for (int i = 0; i < specialDiscountList.size(); i++) {
			SpecialDiscount sd = specialDiscountList.get(i);
			Iterator<DiscountAppliedRecords> discountAppliedRecordsIterator = this
					.findAppliedRecordsById(sd.getDiscount_id()).iterator();
			double appliedAmount = 0;
			while (discountAppliedRecordsIterator.hasNext()) {
				appliedAmount += discountAppliedRecordsIterator.next().getApplied_amount();
			}
			specialDiscountList.get(i).setApplied_amount(appliedAmount);
			specialDiscountList.get(i).setBalance(
					specialDiscountList.get(i).getAmount() - specialDiscountList.get(i).getApplied_amount());
		}

		return specialDiscountList;
		// List<SpecialDiscount> specialDiscounts = new ArrayList<>();
		// Iterator<SpecialDiscount> iterator = specialDiscountList.iterator();
		// while(iterator.hasNext()) {
		// SpecialDiscount temp = iterator.next();
		//
		// List<DiscountAppliedRecords> discountAppliedRecordsList =
		// this.findAppliedRecordsById(temp.getDiscount_id());
		// Iterator<DiscountAppliedRecords> iterator2 =
		// discountAppliedRecordsList.iterator();
		// double appliedAmount = 0;
		// while(iterator2.hasNext()) {
		// appliedAmount += iterator2.next().getApplied_amount();
		// }
		// temp.setApplied_amount(appliedAmount);
		// specialDiscounts.add(temp);
		// specialDiscounts.get(1);
		// }
		// return specialDiscountList;
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
			
			List<SpecialDiscount> specialDiscountList = this.specialDiscountDao.findByCondition(condition);
			for (int i = 0; i < specialDiscountList.size(); i++) {
				SpecialDiscount sd = specialDiscountList.get(i);
				Iterator<DiscountAppliedRecords> discountAppliedRecordsIterator = this
						.findAppliedRecordsById(sd.getDiscount_id()).iterator();
				double appliedAmount = 0;
				while (discountAppliedRecordsIterator.hasNext()) {
					appliedAmount += discountAppliedRecordsIterator.next().getApplied_amount();
				}
				specialDiscountList.get(i).setApplied_amount(appliedAmount);
				specialDiscountList.get(i).setBalance(
						specialDiscountList.get(i).getAmount() - specialDiscountList.get(i).getApplied_amount());
			}
			
			return specialDiscountList;
		}
	}

	@Override
	public List<DiscountAppliedRecords> findAppliedRecordsById(int id) {
		return this.appliedRecordsDao.findAllById(id);
	}

}
=======
package com.hand.service.impl;

import java.util.Iterator;
import java.util.List;

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
		List<SpecialDiscount> specialDiscountList = this.specialDiscountDao.findALL();
		for (int i = 0; i < specialDiscountList.size(); i++) {
			SpecialDiscount sd = specialDiscountList.get(i);
			Iterator<DiscountAppliedRecords> discountAppliedRecordsIterator = this
					.findAppliedRecordsById(sd.getDiscount_id()).iterator();
			double appliedAmount = 0;
			while (discountAppliedRecordsIterator.hasNext()) {
				appliedAmount += discountAppliedRecordsIterator.next().getApplied_amount();
			}
			specialDiscountList.get(i).setApplied_amount(appliedAmount);
			specialDiscountList.get(i).setBalance(
					specialDiscountList.get(i).getAmount() - specialDiscountList.get(i).getApplied_amount());
		}

		return specialDiscountList;
		// List<SpecialDiscount> specialDiscounts = new ArrayList<>();
		// Iterator<SpecialDiscount> iterator = specialDiscountList.iterator();
		// while(iterator.hasNext()) {
		// SpecialDiscount temp = iterator.next();
		//
		// List<DiscountAppliedRecords> discountAppliedRecordsList =
		// this.findAppliedRecordsById(temp.getDiscount_id());
		// Iterator<DiscountAppliedRecords> iterator2 =
		// discountAppliedRecordsList.iterator();
		// double appliedAmount = 0;
		// while(iterator2.hasNext()) {
		// appliedAmount += iterator2.next().getApplied_amount();
		// }
		// temp.setApplied_amount(appliedAmount);
		// specialDiscounts.add(temp);
		// specialDiscounts.get(1);
		// }
		// return specialDiscountList;
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
			
			List<SpecialDiscount> specialDiscountList = this.specialDiscountDao.findByCondition(condition);
			for (int i = 0; i < specialDiscountList.size(); i++) {
				SpecialDiscount sd = specialDiscountList.get(i);
				Iterator<DiscountAppliedRecords> discountAppliedRecordsIterator = this
						.findAppliedRecordsById(sd.getDiscount_id()).iterator();
				double appliedAmount = 0;
				while (discountAppliedRecordsIterator.hasNext()) {
					appliedAmount += discountAppliedRecordsIterator.next().getApplied_amount();
				}
				specialDiscountList.get(i).setApplied_amount(appliedAmount);
				specialDiscountList.get(i).setBalance(
						specialDiscountList.get(i).getAmount() - specialDiscountList.get(i).getApplied_amount());
			}
			
			return specialDiscountList;
		}
	}

	@Override
	public List<DiscountAppliedRecords> findAppliedRecordsById(int id) {
		return this.appliedRecordsDao.findAllById(id);
	}

}
>>>>>>> huangzijing
