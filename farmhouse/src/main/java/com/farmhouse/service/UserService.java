package com.farmhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farhouse.entity.User;
import com.farmhouse.dao.UserDao;

@Service("userService")
public class UserService {

	@Autowired
	UserDao userDao;

	public User getUser(String username){	
		return userDao.findByNamedQuery("User.findByUsername", "username", username);		
	}
	
	public void createUser(){
		
	}
}
