package com.farmhouse.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmhouse.beans.SignUpBean;
import com.farmhouse.beans.UserBean;
import com.farmhouse.dao.AuthoritiesDao;
import com.farmhouse.dao.UserDao;
import com.farmhouse.dao.UserProfileDao;
import com.farmhouse.entity.Authorities;
import com.farmhouse.entity.User;
import com.farmhouse.entity.UserProfile;

@Service("userService")
public class UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	AuthoritiesDao authoritiesDao;
	
	@Autowired
	UserProfileDao userProfileDao;

	
	public boolean isExits(String username){
		try {
			return userDao.findByNamedQuery("User.findByUsername", "username", username).getUserId() != null;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public UserBean getUser(String username){
		User userEntity = userDao.findByNamedQuery("User.findByUsername", "username", username);
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
	
	@Transactional
	public void createUser(SignUpBean signup){
		
		if(!isExits(signup.getUsername())){
			User userEntity = new User();
			userEntity.setUsername(signup.getUsername());
			userEntity.setPassword(signup.getPassword());
			userEntity.setEnabled(true);
			userEntity.setAccountNonExpired(true);
			userEntity.setAccountNonLocked(true);
			userEntity.setCredientialsNonExpired(true);
			
			Authorities authorityEntity = new Authorities();
			authorityEntity.setRole("ROLE_ADMIN");
			authorityEntity.setUserId(userEntity);
			
			UserProfile userProfileEntity = new UserProfile();
			userProfileEntity.setUserIdFk(userEntity);
			userProfileEntity.setFullName(signup.getAddress());
			userProfileEntity.setAddress(signup.getAddress());
			userProfileEntity.setPhoneNumber(signup.getPhoneNumber());
			userProfileEntity.setPhotoUrl("");
			
			userDao.create(userEntity);
			authoritiesDao.create(authorityEntity);
			userProfileDao.create(userProfileEntity);
		}
		
	}
}
