package com.hand.dao;

import java.util.List;

import javax.sql.DataSource;

import com.hand.model.CustomersInfo;

public interface CustomersInfoDao {
	
	   public void setDataSource(DataSource dataSource);
	   
	   public void create(CustomersInfo customersInfo);
//	   (String cust_name, String type, String cust_code, String group_company,
//				String corporation, String country, String city, String address1, String address2, String postcode,
//				String port_of_destination, String shipping_mark, String status, String invoice_group, String currency,
//				String payment_method, String price_term1, String price_term2, String price_term3, String markup_name,
//				String discount_name, String market_area, String business_manager, String business_assistant,
//				String discount_id);
	   
	   public List<CustomersInfo> read(String cust_name);
	   
	   public List<CustomersInfo> read4ID(Integer cust_id);
	   
	   public List<CustomersInfo> readAll();
	   
	   public void delete(Integer id);
	   
	   public void update(CustomersInfo customersInfo);
	   
	   public void confirm(Integer cust_id ,String status);
	   
	   public CustomersInfo get(Integer cust_id);
	   
//	   public void check(Integer cust_id);
	   
}
