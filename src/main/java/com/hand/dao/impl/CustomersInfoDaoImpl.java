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
	public void create(CustomersInfo customersInfo){

		sessionFactory.getCurrentSession().save(customersInfo);

		//	(String cust_name, String type, String cust_code, String group_company, String corporation,
		//			String country, String city, String address1, String address2, String postcode, String port_of_destination,
		//			String shipping_mark, String status, String invoice_group, String currency, String payment_method,
		//			String price_term1, String price_term2, String price_term3, String markup_name, String discount_name,
		//			String market_area, String business_manager, String business_assistant, String discount_id) {

		//	      Transaction tx = null;
		//	      try{
		//	         tx = session.beginTransaction();
		//	         CustomersInfo customersInfo = new CustomersInfo( cust_name,  type,  cust_code,  group_company,  corporation,
		//	     			 country,  city,  address1,  address2,  postcode,  port_of_destination,
		//	    			 shipping_mark,  status,  invoice_group,  currency,  payment_method,
		//	    			 price_term1,  price_term2,  price_term3,  markup_name,  discount_name,
		//	    			 market_area,  business_manager,  business_assistant,  discount_id);
		//	         session.save(customersInfo);
		//	         tx.commit();
		//	      }catch (HibernateException e) {
		//	         if (tx!=null) tx.rollback();
		//	         e.printStackTrace(); 
		//	      }finally {
		//	         session.close(); 
		//	      }

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> read(String cust_name) {

		String hql = "FROM CustomersInfo c WHERE c.cust_name = ?";
		//		Query query = sessionFactory.getCurrentSession().createQuery(hql).setString(0, cust_name);
		//		CustomersInfo customersInfo = (CustomersInfo) query.uniqueResult();

		return sessionFactory.getCurrentSession().createQuery(hql).setString(0, cust_name).list();


		//		Transaction tx = null;
		//	      try{
		//	    	  tx = session.beginTransaction();
		//		         Customer customer = 
		//		                   (Customer)session.get(Customer.class, ID); 
		//		         
		//		         System.out.println("已经保存的数据如下：");
		//		     	System.out.println("ID:"+customer.getCustomer_id());
		//		     	System.out.println("FirstName:"+customer.getFirst_name());
		//		     	System.out.println("LastName:"+customer.getLast_name());
		//		     	System.out.println("Email:"+customer.getEmail());
		//		     	System.out.println("Address:"+((Address)session.get(Address.class,customer.getAddress_id())).getAddress());
		//		         
		//		         tx.commit();
		//	      }catch (HibernateException e) {
		//	         if (tx!=null) tx.rollback();
		//	         e.printStackTrace(); 
		//	      }finally {
		//	         session.close(); 
		//	      }

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CustomersInfo> read4ID(Integer cust_id) {
		
		String hql = "FROM CustomersInfo c WHERE c.cust_id = ?";

		return sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, cust_id).list();
		
	}

	@Override
	public List<CustomersInfo> readAll() {

		//		Transaction tx = null;
		//	      try{
		//	         tx = session.beginTransaction();
		//	         List employees = session.createQuery("FROM Employee").list(); 
		//	         for (Iterator iterator = 
		//	                           employees.iterator(); iterator.hasNext();){
		//	            Employee employee = (Employee) iterator.next(); 
		//	            System.out.print("First Name: " + employee.getFirstName()); 
		//	            System.out.print("  Last Name: " + employee.getLastName()); 
		//	            System.out.println("  Salary: " + employee.getSalary()); 
		//	         }
		//	         tx.commit();
		//	      }catch (HibernateException e) {
		//	         if (tx!=null) tx.rollback();
		//	         e.printStackTrace(); 
		//	      }finally {
		//	         session.close(); 
		//	      }

		return null;
	}

	@Override
	public void delete(Integer id) {

		Transaction tx = null;
		//	      try{
		//	         tx = session.beginTransaction();
		//	         Employee employee = 
		//	                   (Employee)session.get(Employee.class, EmployeeID); 
		//	         session.delete(employee); 
		//	         tx.commit();
		//	      }catch (HibernateException e) {
		//	         if (tx!=null) tx.rollback();
		//	         e.printStackTrace(); 
		//	      }finally {
		//	         session.close(); 
		//	      }


	}

	@Override
	public void update(CustomersInfo customersInfo) {
		
		sessionFactory.getCurrentSession().update(customersInfo);
		
		
		//		Transaction tx = null;
		//	      try{
		//	         tx = session.beginTransaction();
		//	         Employee employee = 
		//	                    (Employee)session.get(Employee.class, EmployeeID); 
		//	         employee.setSalary( salary );
		//	         session.update(employee); 
		//	         tx.commit();
		//	      }catch (HibernateException e) {
		//	         if (tx!=null) tx.rollback();
		//	         e.printStackTrace(); 
		//	      }finally {
		//	         session.close(); 
		//	      }



	}

	@Override
	public void confirm(Integer cust_id, String status) {
//		String hql = "update Web w set w.littlewarm=? w.noticepic=? w.help=? where w.id =?";
//		Query q = session.createQuery(hql);
//		q.setString(0,littlewarmValue);
//		q.setByte(1,noticepicValue);
//		q.setString(2,helpValue);
//		q.setInteger(3,idValue);
//		q.executeUpdate();
		
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
