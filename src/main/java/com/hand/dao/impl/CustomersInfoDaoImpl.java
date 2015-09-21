package com.hand.dao.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.CustomersInfoDao;
import com.hand.model.CustomersInfo;
import com.hand.model.User;

@Repository("customersInfoDao")
public class CustomersInfoDaoImpl implements CustomersInfoDao {

	/**
	 * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void setDataSource(DataSource dataSource) {

	}

	@Override
	public Integer create(CustomersInfo customersInfo){

		return (Integer) sessionFactory.getCurrentSession().save(customersInfo);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> inquireAll(String cust_name,String type,String group_company,
			String cust_code,String status,String corporation) {
		
		String hql = "FROM CustomersInfo WHERE 1=1";		
		
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
		
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		
		return q.list();
//		return sessionFactory.getCurrentSession().createQuery(hql).list();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> inquireAllByServicePersonnel(String cust_name,String type,String group_company,
			String cust_code,String status,String corporation) {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = (User) request.getSession().getAttribute("current_user");
		String username = user.getUsername();
		
		String hql = "FROM CustomersInfo WHERE business_manager = ? ";
		
		
//		String hql = "FROM CustomersInfo WHERE 1=1";		
		
		
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
		
		hql += " or business_assistant = ?";
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
		
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setString(0,username);
		q.setString(1,username);
		
		return q.list();
//		return sessionFactory.getCurrentSession().createQuery(hql).list();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> read4ID(Integer cust_id) {
		
		String hql = "FROM CustomersInfo c WHERE c.cust_id = ?";

		return sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, cust_id).list();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> readAllByServicePersonnel() {
		HttpServletRequest request = ServletActionContext.getRequest();
		User user = (User) request.getSession().getAttribute("current_user");
		String username = user.getUsername();
		
		String hql = "FROM CustomersInfo c WHERE c.business_manager = ? or c.business_assistant = ?";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		q.setString(0,username);
		q.setString(1,username);
				
//		return sessionFactory.getCurrentSession().createQuery(hql).list();
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> readAll() {
		
		String hql = "FROM CustomersInfo WHERE 1=1";
				
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> readCode() {
		
		String hql = "SELECT cust_id,cust_code from om_customers_info";
			
		return sessionFactory.getCurrentSession().createSQLQuery(hql).list();
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
