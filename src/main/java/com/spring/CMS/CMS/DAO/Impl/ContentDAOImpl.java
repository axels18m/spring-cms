package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.ContentDAO;
import com.spring.CMS.CMS.Entity.Content;

@Repository
public class ContentDAOImpl implements ContentDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);

	@Override
	public List<Content> getAll(Pageable pageable)
	{
		Query<Content> query = session.createQuery("from content", Content.class);
		return query.getResultList();
	}

	@Override
	public Content getById(int id) 
	{
		return session.get(Content.class, id);
	}

	@Override
	public List<Content> getByPost(int post) 
	{
		Query<Content> query = session.createQuery("from content where content.idPost_content = " + post, Content.class);
		return query.getResultList();
	}

	@Override
	public void save(Content content) 
	{
		session.saveOrUpdate(content);
	}

	@Override
	public void update(Content content) 
	{
		session.saveOrUpdate(content);
	}

	@Override
	public void delete(Content content) 
	{
		session.delete(content);
	}

}
