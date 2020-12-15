package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.User_MetadataDAO;
import com.spring.CMS.CMS.Entity.User_Metadata;
import com.spring.CMS.CMS.Service.User_MetadataService;

@Service
public class User_MetadataServiceImpl implements User_MetadataService
{
	@Autowired
	private User_MetadataDAO dao;
	
	@Transactional
	public List<User_Metadata> getAll(Pageable pageable) 
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public List<User_Metadata> getByKey(String key) 
	{
		return dao.getByKey(key);
	}

	@Transactional
	public List<User_Metadata> getByType(String type) 
	{
		return dao.getByType(type);
	}

	@Transactional
	public User_Metadata getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public User_Metadata save(User_Metadata user) 
	{
		dao.save(user);
		return user;
	}

	@Transactional
	public User_Metadata update(User_Metadata user) 
	{
		dao.update(user);
		return user;
	}

	@Transactional
	public void delete(User_Metadata user) 
	{
		dao.delete(user);
	}

}
