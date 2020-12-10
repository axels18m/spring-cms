package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.CategoryDAO;
import com.spring.CMS.CMS.Entity.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);

	@Override
	public List<Category> getAll() 
	{
		Query<Category> query = session.createQuery("from category", Category.class);
		return query.getResultList();
	}

	@Override
	public Category getById(int id) 
	{
		return session.get(Category.class, id);
	}

	@Override
	public List<Category> getByCatSuperior(int superior) 
	{
		Query<Category> query = session.createQuery("from category where category.catSuperior_cat = " + superior, Category.class);
		return query.getResultList();
	}

	@Override
	public void save(Category category) 
	{
		session.saveOrUpdate(category);
	}

	@Override
	public void update(Category category) 
	{
		session.saveOrUpdate(category);
	}

	@Override
	public void delete(Category category) 
	{
		session.delete(category);
	}
	
	

}
