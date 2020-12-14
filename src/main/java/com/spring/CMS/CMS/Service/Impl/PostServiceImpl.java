package com.spring.CMS.CMS.Service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import com.spring.CMS.CMS.DAO.PostDAO;
import com.spring.CMS.CMS.Entity.Post;
import com.spring.CMS.CMS.Service.PostService;

@Service
public class PostServiceImpl implements PostService
{
	@Autowired
	private PostDAO dao;
	
	@Transactional
	public List<Post> getAll(Pageable pageable) 
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public Post getById(int post) 
	{
		return dao.getById(post);
	}

	@Transactional
	public List<Post> getByUser(int user) 
	{
		return dao.getByUser(user);
	}

	@Transactional
	public List<Post> getByCategory(int category) 
	{
		return dao.getByCategory(category);
	}

	@Transactional
	public List<Post> getByStartedDate(Date start) 
	{
		return dao.getByStartedDate(start);
	}

	@Transactional
	public List<Post> getByEndDate(Date end) 
	{
		return dao.getByEndDate(end);
	}

	@Transactional
	public void save(Post post) 
	{
		dao.save(post);
	}

	@Transactional
	public void update(Post post) 
	{
		dao.update(post);
	}

	@Transactional
	public void delete(Post post) 
	{
		dao.delete(post);
	}

}
