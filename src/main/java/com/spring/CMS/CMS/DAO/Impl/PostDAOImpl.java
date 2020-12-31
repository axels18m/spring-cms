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

	@Override
	public List<Post> getByType(int type) 
	{
		Session session = em.unwrap(Session.class);
		return (List<Post>) (session.createQuery("select p.* from post p inner join content c on c.id_content = p.type_post where c.id_content = " + type, Post.class)).getResultList();
	}
	
	@Override
	public List<Post> getByUser(int user) 
	{
		Session session = em.unwrap(Session.class);
		return (List<Post>) (session.createQuery("select p.* from post p inner join user u on u.id_user = p.id_user_post where u.id_user = " + user, Post.class)).getResultList();
	}

	@Override
	public List<Post> getByCategory(int category) 
	{
		Session session = em.unwrap(Session.class);
		return (List<Post>) (session.createQuery("select p.* from post p inner join category c on c.id_cat = p.category_post where c.id_cat = " + category, Post.class)).getResultList();
	}

}
