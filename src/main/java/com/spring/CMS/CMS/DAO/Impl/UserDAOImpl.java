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
	
	/* em.unwrap(Session.class) returns the corresponding classes of the JPA implementation. We have to open a 
	 * session for each query to get the methods inside it.*/
	
	@Override
	public List<User> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<User> query = session.createQuery("from user", User.class);
		return query.getResultList();
	}

	@Override
	public User getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(User.class, id);
	}

	@Override
	public List<User> getByGroup(int group) 
	{
		Session session = em.unwrap(Session.class);
		return (List<User>) (session.createQuery("select u.* from user u inner join group_table gp on gp.id_group = u.group_user where gp.id_group = " + group, User.class)).getResultList();
	}

	@Override
	public User save(User user) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(user);
		return user;
	}

	@Override
	public User update(User user) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(user);
		return user;
	}

	@Override
	public void delete(User user) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(user);
	}

}
