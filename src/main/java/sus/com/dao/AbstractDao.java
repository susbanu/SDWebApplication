package sus.com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */

@Transactional
public abstract class AbstractDao<E extends Serializable,I extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Class<E> clazz;

	@Autowired
	protected SessionFactory sessionFactory;

	public void setClazz(Class<E> clazzToSet) {
		this.clazz = clazzToSet;
	}

	@SuppressWarnings("unchecked")
	public E getById(I entityId) {
		return (E) sessionFactory.getCurrentSession().get(clazz, entityId);
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	public void save(E entity) {		
		sessionFactory.getCurrentSession().persist(entity);
	}

	public void update(E entity) {		
		sessionFactory.getCurrentSession().merge(entity);		
	}

	public void delete(E entity) {		
		sessionFactory.getCurrentSession().delete(entity);		
	}

	public void deleteById(I entityId) {
		E entity = getById(entityId);
		delete(entity);
	}
	
}
