package com.spring.CMS.CMS.DAO.Impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.PostDAO;
import com.spring.CMS.CMS.Entity.Post;

@Repository
public class PostDAOImpl implements PostDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);

	@Override
	public List<Post> getAll() 
	{
		Query<Post> query = session.createQuery("from post", Post.class);
		return query.getResultList();
	}

	@Override
	public Post getById(int post) 
	{
		return session.get(Post.class, post);
	}

	@Override
	public List<Post> getByUser(int user) 
	{
		Query<Post> query = session.createQuery("from post where post.idUser_post = " + user, Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByCategory(int category) 
	{
		Query<Post> query = session.createQuery("from post where post.category_post = " + category, Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByStartedDate(Date start) 
	{
		Query<Post> query = session.createQuery("from post where post.startedDate_post = '" + start + "'", Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByEndDate(Date end) 
	{
		Query<Post> query = session.createQuery("from post where post.endDate_post = '" + end + "'", Post.class);
		return query.getResultList();
	}

	@Override
	public void save(Post post) 
	{
		session.saveOrUpdate(post);
	}

	@Override
	public void update(Post post) 
	{
		session.saveOrUpdate(post);
	}

	@Override
	public void delete(Post post) 
	{
		session.delete(post);
	}

}
