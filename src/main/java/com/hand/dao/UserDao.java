package com.hand.dao;

import java.util.List;

import com.hand.model.User;

public interface UserDao {

	/**
	 * 保存用户
	 * 
	 * @param user
	 * @return
	 */
	
	public boolean isExist(User user);

	public void save(User user);

	public void remove(User user);

	public User findSingleById(int id);

	public List<User> findALL();

	public void update(User user);

}
