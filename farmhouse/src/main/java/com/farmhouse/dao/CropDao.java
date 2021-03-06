package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.Crop;


@Repository("cropDao")
public class CropDao extends GenericHibernateDao<Crop>  {
	
	public CropDao() {
		setClazz(Crop.class);
	}
}