package com.farmhouse.dao;

import org.springframework.stereotype.Repository;

import com.farmhouse.entity.Rating;


@Repository("ratingDao")
public class RatingDao extends GenericHibernateDao<Rating>  {
	
	public RatingDao() {
		setClazz(Rating.class);
	}
}

