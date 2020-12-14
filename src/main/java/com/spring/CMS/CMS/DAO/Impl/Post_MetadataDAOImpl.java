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
	private Session session = em.unwrap(Session.class);
	
	@Override
	public List<Post_Metadata> getAll(Pageable pageable)
	{
		Query<Post_Metadata> query = session.createQuery("from post_metadata", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public List<Post_Metadata> getByKey(String key) 
	{
		Query<Post_Metadata> query = session.createQuery("from post_metadata.key_postmet = '" + key + "'", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public List<Post_Metadata> getByType(String type) 
	{
		Query<Post_Metadata> query = session.createQuery("from post_metadata.type_postmet = '" + type + "'", Post_Metadata.class);
		return query.getResultList();
	}

	@Override
	public Post_Metadata getById(int id) 
	{
		return session.get(Post_Metadata.class, id);
	}

	@Override
	public void save(Post_Metadata post) 
	{
		session.saveOrUpdate(post);
	}

	@Override
	public void update(Post_Metadata post) 
	{
		session.saveOrUpdate(post);
	}

	@Override
	public void delete(Post_Metadata post) 
	{
		session.delete(post);
	}

}
