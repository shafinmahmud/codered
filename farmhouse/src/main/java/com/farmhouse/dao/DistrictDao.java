package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.District;


@Repository("districtDao")
public class DistrictDao extends GenericHibernateDao<District>  {
	
	public DistrictDao() {
		setClazz(District.class);
	}
}
