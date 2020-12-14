package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.GroupDAO;
import com.spring.CMS.CMS.Entity.Group;
import com.spring.CMS.CMS.Service.GroupService;

@Service
public class GroupServiceImpl implements GroupService
{
	@Autowired
	private GroupDAO dao;

	@Transactional
	public List<Group> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public Group getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<Group> getByName(String name) 
	{
		return dao.getByName(name);
	}

	@Transactional
	public void save(Group group) 
	{
		dao.save(group);
	}

	@Transactional
	public void update(Group group) 
	{
		dao.update(group);
	}

	@Transactional
	public void delete(Group group) 
	{
		dao.delete(group);
	}

}
