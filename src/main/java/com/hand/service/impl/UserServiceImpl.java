package com.hand.service.impl;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.UserDao;
import com.hand.model.User;
import com.hand.service.UserService;

/**
 * Created by Administrator on 2015/9/8.
 */
// 使用Spring提供的@Service注解将声明的类标注为一个Service，如此就不需要再Spring配置文件中注册该类的bean
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * 注入userDao
	 */
	@Autowired
	private UserDao userDao;

	public void test() {
		System.out.println("Hello World!");
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void removeUser(User user) {
		userDao.remove(user);
	}

	public boolean isExist(User user) {
		List<User> result = this.userDao.isExist(user);
		// System.out.println( result.get(0).toString());
		if (result.isEmpty()) {
			System.out.println("用户不存在");
			return false;
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		// session.putValue("current_username", result);
		User current_user = result.get(0);
		session.setAttribute("current_user", current_user);
		return true;
	}

	@Transactional
	@Override
	public List<User> findAllUser() {
		return userDao.findALL();
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Transactional
	@Override
	public User findSingleById(int id) {
		return userDao.findSingleById(id);
	}

	@Transactional
	@Override
	public InputStream getUserExcel() {
		return null;
	}

}
