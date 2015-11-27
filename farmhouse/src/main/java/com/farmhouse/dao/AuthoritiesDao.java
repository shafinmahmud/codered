package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farhouse.entity.Authorities;

@Repository("authoritiesDao")
public class AuthoritiesDao extends GenericHibernateDao<Authorities>  {
	
	public AuthoritiesDao() {
		setClazz(Authorities.class);
	}
}