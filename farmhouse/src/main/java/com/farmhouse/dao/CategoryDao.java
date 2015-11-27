package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.Category;

@Repository("categoryDao")
public class CategoryDao extends GenericHibernateDao<Category>{
	
	public CategoryDao() {
		setClazz(Category.class);
	}
}

