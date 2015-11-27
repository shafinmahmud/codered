package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.User;


@Repository("userDao")
public class UserDao extends GenericHibernateDao<User>  {
	
	public UserDao() {
		setClazz(User.class);
	}
}
