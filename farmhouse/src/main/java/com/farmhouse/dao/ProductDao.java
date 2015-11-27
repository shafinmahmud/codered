package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farhouse.entity.Product;


@Repository("productDao")
public class ProductDao extends GenericHibernateDao<Product>  {
	
	public ProductDao() {
		setClazz(Product.class);
	}
}
