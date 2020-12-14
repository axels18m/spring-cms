package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.User_MetadataDAO;
import com.spring.CMS.CMS.Entity.User_Metadata;

@Repository
public class User_MetadataDAOImpl implements User_MetadataDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);
	
	@Override
	public List<User_Metadata> getAll(Pageable pageable)
	{
		Query<User_Metadata> query = session.createQuery("from user_metadata", User_Metadata.class);
		return query.getResultList();
	}
	@Override
	public List<User_Metadata> getByKey(String key) 
	{
		Query<User_Metadata> query = session.createQuery("from user_metadata where user_metadata.key_metadata = '" + key + "'", User_Metadata.class);
		return query.getResultList();
	}
	@Override
	public List<User_Metadata> getByType(String type) 
	{
		Query<User_Metadata> query = session.createQuery("from user_metadata where user_metadata.type_metadata = '" + type + "'", User_Metadata.class);
		return query.getResultList();
	}
	
	@Override
	public User_Metadata getById(int id) 
	{
		return session.get(User_Metadata.class, id);
	}
	
	@Override
	public void save(User_Metadata user) 
	{
		session.saveOrUpdate(user);
	}
	
	@Override
	public void update(User_Metadata user) 
	{
		session.saveOrUpdate(user);
	}
	
	@Override
	public void delete(User_Metadata user) 
	{
		session.delete(user);
	}
}