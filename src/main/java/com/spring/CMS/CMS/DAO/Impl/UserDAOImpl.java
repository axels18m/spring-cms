package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.UserDAO;
import com.spring.CMS.CMS.Entity.User;

@Repository
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);
	
	@Override
	public List<User> getAll(Pageable pageable)
	{
		Query<User> query = session.createQuery("from user", User.class);
		return query.getResultList();
	}

	@Override
	public User getById(int id) 
	{
		return session.get(User.class, id);
	}

	@Override
	public List<User> getByGroup(int group) 
	{
		Query<User> query = session.createQuery("from user where user.group_user = " + group, User.class);
		return query.getResultList();
	}

	@Override
	public void save(User user) 
	{
		session.saveOrUpdate(user);
	}

	@Override
	public void update(User user) 
	{
		session.saveOrUpdate(user);
	}

	@Override
	public void delete(User user) 
	{
		session.delete(user);
	}
	

}
