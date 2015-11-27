package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.Division;

@Repository("divisionDao")
public class DivisionDao extends GenericHibernateDao<Division>  {
	
	public DivisionDao() {
		setClazz(Division.class);
	}
}
