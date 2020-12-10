package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.UserDAO;
import com.spring.CMS.CMS.Entity.User;
import com.spring.CMS.CMS.Service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDAO dao;

	@Transactional
	public List<User> getAll() 
	{
		return dao.getAll();
	}

	@Transactional
	public User getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<User> getByGroup(int group) 
	{
		return dao.getByGroup(group);
	}

	@Transactional
	public void save(User user) 
	{
		dao.save(user);
	}

	@Transactional
	public void update(User user) 
	{
		dao.update(user);
	}

	@Transactional
	public void delete(User user) 
	{
		dao.delete(user);
	}

}
