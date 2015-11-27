package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.UserProfile;

@Repository("userProfileDao")
public class UserProfileDao extends GenericHibernateDao<UserProfile>  {
	
	public UserProfileDao() {
		setClazz(UserProfile.class);
	}
}