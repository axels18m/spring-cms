package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.CategoryDAO;
import com.spring.CMS.CMS.Entity.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<Category> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Category> query = session.createQuery("from category", Category.class);
		return query.getResultList();
	}

	@Override
	public Category getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Category.class, id);
	}

	@Override
	public List<Category> getByCatSuperior(int superior) 
	{
		Session session = em.unwrap(Session.class);
		Query<Category> query = session.createQuery("from category where category.catSuperior_cat = " + superior, Category.class);
		return query.getResultList();
	}

	@Override
	public Category save(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(category);
		return category;
	}

	@Override
	public Category update(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(category);
		return category;
	}

	@Override
	public void delete(Category category) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(category);
	}
	
	

}
