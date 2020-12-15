package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.Post_MetadataDAO;
import com.spring.CMS.CMS.Entity.Post_Metadata;

@Repository
public class Post_MetadataDAOImpl implements Post_MetadataDAO
{
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Post_Metadata> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Post_Metadata> query = session.createQuery("from post_metadata", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public List<Post_Metadata> getByKey(String key) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post_Metadata> query = session.createQuery("from post_metadata.key_postmet = '" + key + "'", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public List<Post_Metadata> getByType(String type) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post_Metadata> query = session.createQuery("from post_metadata.type_postmet = '" + type + "'", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public Post_Metadata getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Post_Metadata.class, id);
	}

	@Override
	public Post_Metadata save(Post_Metadata post) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(post);
		return post;
	}

	@Override
	public Post_Metadata update(Post_Metadata post) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(post);
		return post;
	}

	@Override
	public void delete(Post_Metadata post) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(post);
	}

}
