package com.hand.dao;

import java.util.List;

import javax.sql.DataSource;

import com.hand.model.CustContactors;

public interface CustContactorsDao {
	
	public void setDataSource(DataSource dataSource);
	   
	   public void create(CustContactors custContactors);
	   
	   public CustContactors read(Integer id);
	   
	   public List<CustContactors> readAll();
	   
	   public void delete(Integer id);
	   
	   public void update(Integer id ,String str);
	
}
