package sus.com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created on Mar 17, 2015
 * 
 * @author Sushant
 * @version 1.0
 */

public interface GenericDao<E extends Serializable,I> extends Serializable{

	public E getById(I entityId);
	
	public List<E> findAll();
	
	public void save(E entity);
	
	public void update(E entity);
	
	public void delete(E entity);
	
	public void deleteById(I entityId);
}
