package com.hand.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.CustomersInfoDao;
import com.hand.model.CustomersInfo;

@Repository("customersInfoDao")
public class CustomersInfoDaoImpl implements CustomersInfoDao {

	/**
	 * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	//	private static SessionFactory factory; 
	//	Session session = factory.openSession();
	@Override
	public void setDataSource(DataSource dataSource) {



	}

	@Override
	public Integer create(CustomersInfo customersInfo){

		return (Integer) sessionFactory.getCurrentSession().save(customersInfo);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> read(String cust_name,String type,String group_company,
			String cust_code,String status,String corporation) {

		String hql = "FROM CustomersInfo WHERE 1=1";// c WHERE c.cust_name = ?";
		//		Query query = sessionFactory.getCurrentSession().createQuery(hql).setString(0, cust_name);
		//		CustomersInfo customersInfo = (CustomersInfo) query.uniqueResult();
		if(cust_name.trim().length()!=0){
			hql += " and cust_name like '%" + cust_name + "%'";
		}
		if(type.trim().length()!=0){
			hql += " and type like '%" + type + "%'";
		}
		if(group_company.trim().length()!=0){
			hql += " and group_company like '%" + group_company + "%'";
		}
		if(cust_code.trim().length()!=0){
			hql += " and cust_code like '%" + cust_code + "%'";
		}
		if(status.trim().length()!=0){
			hql += " and status like '%" + status + "%'";
		}
		if(corporation.trim().length()!=0){
			hql += " and corporation like '%" + corporation + "%'";
		}
		
		return sessionFactory.getCurrentSession().createQuery(hql).list();//setString(0, cust_name).list();


	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> read4ID(Integer cust_id) {
		
		String hql = "FROM CustomersInfo c WHERE c.cust_id = ?";

		return sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, cust_id).list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> readAll() {
		
		String hql = "FROM CustomersInfo WHERE 1=1";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
		
	}

	@Override
	public void delete(Integer id) {


	}

	@Override
	public void update(CustomersInfo customersInfo) {
		
		sessionFactory.getCurrentSession().update(customersInfo);
		
	}

	@Override
	public void confirm(Integer cust_id, String status) {
		
		String hql = "update CustomersInfo c set c.status=? where c.cust_id =?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setString(0,status);
		q.setInteger(1,cust_id);
		q.executeUpdate();

	}

	@Override
	public CustomersInfo get(Integer cust_id) {
		
		return (CustomersInfo) sessionFactory.getCurrentSession().get(CustomersInfo.class, cust_id);
		
	}

}
