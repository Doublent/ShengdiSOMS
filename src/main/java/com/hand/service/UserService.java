package com.hand.service;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

import com.hand.model.User;

/**
 * Created by Administrator on 2015/9/8.
 */
public interface UserService {

	/**
	 * 测试方法
	 */
	void test();

	/**
	 * 保存用户
	 * 
	 * @param user
	 * @return
	 */
	
	public boolean isExist(User user);
	
	public void save(User user);

	public void removeUser(User user);

	public List<User> findAllUser();

	public void update(User user);

	public User findSingleById(int id);

	public InputStream getUserExcel();

}
