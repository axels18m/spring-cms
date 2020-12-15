package com.spring.CMS.CMS.Mapper;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

/* Generic Interface,  */
public interface BaseRep<T> 
{
	public List<T> getAll(Pageable pageable);
	public T getById(int id);
	public T save(T object);
	public T update(T object);
	public void delete(T object);
}
