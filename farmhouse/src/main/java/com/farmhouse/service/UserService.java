package com.farmhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmhouse.beans.SignUpBean;
import com.farmhouse.beans.UserBean;
import com.farmhouse.dao.UserDao;
import com.farmhouse.dao.UserProfileDao;
import com.farmhouse.entity.User;

@Service("userService")
public class UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	UserProfileDao userProfileDao;

	public UserBean getUser(String username){
		User userEntity = userDao.findByNamedQuery("User.findByUserName", "username", username);
		UserBean userBean = new UserBean();
		if(userEntity != null){
			
			userBean.setUsername(userEntity.getUsername());
			userBean.setFullName(userProfileDao.findOne(userEntity.getUserId()).getFullName());
			userBean.setAddress(userProfileDao.findOne(userEntity.getUserId()).getAddress());
			userBean.setAddress(userProfileDao.findOne(userEntity.getUserId()).getPhoneNumber());
			userBean.setAddress(userProfileDao.findOne(userEntity.getUserId()).getPhotoUrl());
			return userBean;
		}
		return userBean;
	}
	
	public void createUser(SignUpBean signup){
		
	}
}
