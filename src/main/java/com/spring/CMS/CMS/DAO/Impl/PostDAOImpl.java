package com.spring.CMS.CMS.DAO.Impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.PostDAO;
import com.spring.CMS.CMS.Entity.Post;

@Repository
public class PostDAOImpl implements PostDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<Post> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Post> query = session.createQuery("from post", Post.class);
		return query.getResultList();
	}

	@Override
	public Post getById(int post) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Post.class, post);
	}

	@Override
	public List<Post> getByUser(int user) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post> query = session.createQuery("from post where post.idUser_post = " + user, Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByCategory(int category) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post> query = session.createQuery("from post where post.category_post = " + category, Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByStartedDate(Date start) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post> query = session.createQuery("from post where post.startedDate_post = '" + start + "'", Post.class);
		return query.getResultList();
	}

	@Override
	public List<Post> getByEndDate(Date end) 
	{
		Session session = em.unwrap(Session.class);
		Query<Post> query = session.createQuery("from post where post.endDate_post = '" + end + "'", Post.class);
		return query.getResultList();
	}

	@Override
	public Post save(Post post) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(post);
		return post;
	}

	@Override
	public Post update(Post post) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(post);
		return post;
	}

	@Override
	public void delete(Post post) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(post);
	}

}
