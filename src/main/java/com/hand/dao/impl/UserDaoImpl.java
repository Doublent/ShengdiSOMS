package com.hand.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.UserDao;
import com.hand.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	/**
	 * 使用@Autowired注解将sessionFactory注入到UserDaoImpl中
	 */
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public boolean isExist(User user) {
		String hql = "select u.user_id from User as u where u.username = :username and u.password = :password";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		List<User> result = query.list();
		if (result.isEmpty()) {
			System.out.println("用户不存在");
			return false;
		}
		return true;
	}

	public void save(User user) {
		System.out.println("UserDaoImpl.save()" + user.toString());
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void remove(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public User findSingleById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findALL() {
		String hql = "from User as user order by user_id";
		List<User> users = sessionFactory.getCurrentSession().createQuery(hql).list();
		return users;
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

}
