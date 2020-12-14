package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.ContentDAO;
import com.spring.CMS.CMS.Entity.Content;
import com.spring.CMS.CMS.Service.ContentService;

@Service
public class ContentServiceImpl implements ContentService
{
	@Autowired
	private ContentDAO dao;
	
	@Transactional
	public List<Content> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public Content getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<Content> getByPost(int post) 
	{
		return dao.getByPost(post);
	}

	@Transactional
	public void save(Content content) 
	{
		dao.save(content);
	}

	@Transactional
	public void update(Content content) 
	{
		dao.update(content);
	}

	@Transactional
	public void delete(Content content) 
	{
		dao.delete(content);
	}
	

}
