package com.hand.dao;

import java.util.List;

import javax.sql.DataSource;

import com.hand.model.CustomersInfo;

public interface CustomersInfoDao {
	
	   public void setDataSource(DataSource dataSource);
	   
	   public Integer create(CustomersInfo customersInfo);
	   
	   public List<CustomersInfo> inquireAll(String cust_name,String type,String group_company,
				String cust_code,String status,String corporation);
	   
	   public List<CustomersInfo> inquireAllByServicePersonnel(String cust_name,String type,String group_company,
				String cust_code,String status,String corporation);
	   
	   public List<CustomersInfo> read4ID(Integer cust_id);
	   
	   public List<CustomersInfo> readAll();
	   
	   public List<CustomersInfo> readAllByServicePersonnel();
	   
	   public List<CustomersInfo> readCode();
	   
	   public void delete(Integer id);
	   
	   public void update(CustomersInfo customersInfo);
	   
	   public void confirm(Integer cust_id ,String status);
	   
	   public CustomersInfo get(Integer cust_id);
	   
	   
}
