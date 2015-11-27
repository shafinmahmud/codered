package com.farmhouse.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractHibernateDao<T extends Serializable> {

	private Class<T> clazz;

	@Autowired
	SessionFactory sessionFactory;

	public final void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	@SuppressWarnings("unchecked")
	public T findOne(long id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	@SuppressWarnings("unchecked")
	public T findByNamedQuery(String namedQueryId, String param, String paramValue) {
		return (T) getCurrentSession()
				.getNamedQuery(namedQueryId)
				.setString(param, paramValue).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public T findByNamedQuery(String namedQueryId, String param, int paramValue) {
		return (T) getCurrentSession()
				.getNamedQuery(namedQueryId)
				.setInteger(param, paramValue).uniqueResult();
	}
	
	public void create(T entity) {
		getCurrentSession().persist(entity);
	}

	public void update(T entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	public void deleteById(long entityId) {
		T entity = findOne(entityId);
		delete(entity);
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}