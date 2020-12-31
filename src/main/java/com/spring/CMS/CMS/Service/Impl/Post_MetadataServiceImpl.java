package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.Post_MetadataDAO;
import com.spring.CMS.CMS.Entity.Post_Metadata;
import com.spring.CMS.CMS.Service.Post_MetadataService;

@Service
public class Post_MetadataServiceImpl implements Post_MetadataService
{
	@Autowired
	private Post_MetadataDAO dao;
	
	@Transactional
	public List<Post_Metadata> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public List<Post_Metadata> getByKey(String key) 
	{
		return dao.getByKey(key);
	}

	@Transactional
	public List<Post_Metadata> getByType(String type) 
	{
		return dao.getByType(type);
	}

	@Transactional
	public Post_Metadata getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public Post_Metadata save(Post_Metadata post) 
	{
		dao.save(post);
		return post;
	}

	@Transactional
	public Post_Metadata update(Post_Metadata post) 
	{
		dao.update(post);
		return post;
	}

	@Transactional
	public void delete(Post_Metadata post) 
	{
		dao.delete(post);
	}

	@Transactional
	public List<Post_Metadata> getByPost(int post)
	{
		return dao.getByPost(post);
	}

}
