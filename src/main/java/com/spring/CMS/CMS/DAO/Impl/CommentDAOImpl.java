package com.spring.CMS.CMS.DAO.Impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.CommentDAO;
import com.spring.CMS.CMS.Entity.Comment;

@Repository
public class CommentDAOImpl implements CommentDAO
{
	@Autowired
	private EntityManager em;
	
	@Override
	public List<Comment> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Comment> query =  session.createQuery("from comment", Comment.class);
		return query.getResultList();
	}
	
	@Override
	public List<Comment> getByPost(int post) 
	{
		Session session = em.unwrap(Session.class);
		Query<Comment> query =  session.createQuery("from comment where comment.idPost_cmmt = " + post, Comment.class);
		return query.getResultList();
	}
	
	@Override
	public List<Comment> getByUser(int user) 
	{
		Session session = em.unwrap(Session.class);
		Query<Comment> query =  session.createQuery("from comment where comment.idUser_cmmt = " + user, Comment.class);
		return query.getResultList();
	}
	
	@Override
	public Comment getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Comment.class, id);
	}
	
	@Override
	public List<Comment> getByDate(Date date) 
	{
		Session session = em.unwrap(Session.class);
		Query<Comment> query =  session.createQuery("from comment where comment.date_cmmt = '" + date + "'", Comment.class);
		return query.getResultList();
	}
	
	@Override
	public Comment save(Comment comment) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(comment);
		return comment;
	}
	
	@Override
	public Comment update(Comment comment) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(comment);
		return comment;
	}
	
	@Override
	public void delete(Comment comment) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(comment);
	}
	
	

}
