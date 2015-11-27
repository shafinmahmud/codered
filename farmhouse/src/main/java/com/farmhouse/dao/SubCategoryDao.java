package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farhouse.entity.SubCategory;


@Repository("subCategoryDao")
public class SubCategoryDao extends GenericHibernateDao<SubCategory>  {
	
	public SubCategoryDao() {
		setClazz(SubCategory.class);
	}
}
