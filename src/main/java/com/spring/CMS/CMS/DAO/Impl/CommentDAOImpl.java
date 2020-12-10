package com.spring.CMS.CMS.DAO.Impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.CommentDAO;
import com.spring.CMS.CMS.Entity.Comment;

@Repository
public class CommentDAOImpl implements CommentDAO
{
	@Autowired
	private EntityManager em;
	private Session session = em.unwrap(Session.class);
	
	@Override
	public List<Comment> getAll() 
	{
		Query<Comment> query =  session.createQuery("from comment", Comment.class);
		return query.getResultList();
	}
	
	@Override
	public List<Comment> getByPost(int post) 
	{
		Query<Comment> query =  session.createQuery("from comment where comment.idPost_cmmt = " + post, Comment.class);
		return query.getResultList();
	}
	@Override
	public List<Comment> getByUser(int user) 
	{
		Query<Comment> query =  session.createQuery("from comment where comment.idUser_cmmt = " + user, Comment.class);
		return query.getResultList();
	}
	@Override
	public Comment getById(int id) 
	{
		return session.get(Comment.class, id);
	}
	@Override
	public List<Comment> getByDate(Date date) 
	{
		Query<Comment> query =  session.createQuery("from comment where comment.date_cmmt = '" + date + "'", Comment.class);
		return query.getResultList();
	}
	@Override
	public void save(Comment comment) 
	{
		session.saveOrUpdate(comment);
	}
	@Override
	public void update(Comment comment) 
	{
		session.saveOrUpdate(comment);
	}
	@Override
	public void delete(Comment comment) 
	{
		session.delete(comment);
	}
	
	

}
