package com.spring.CMS.CMS.Service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.CommentDAO;
import com.spring.CMS.CMS.Entity.Comment;
import com.spring.CMS.CMS.Service.CommentService;

@Service
public class CommentServiceImpl implements CommentService
{
	@Autowired
	private CommentDAO dao;
	
	@Transactional
	public List<Comment> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public List<Comment> getByPost(int post) 
	{
		return dao.getByPost(post);
	}

	@Transactional
	public List<Comment> getByUser(int user) 
	{
		return dao.getByUser(user);
	}

	@Transactional
	public Comment getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<Comment> getByDate(Date date) 
	{
		return dao.getByDate(date);
	}

	@Transactional
	public void save(Comment comment) 
	{
		dao.save(comment);
	}

	@Transactional
	public void update(Comment comment) 
	{
		dao.update(comment);
	}

	@Transactional
	public void delete(Comment comment) 
	{
		dao.delete(comment);
	}

}
