package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.Group_LicenseDAO;
import com.spring.CMS.CMS.Entity.Group_License;
import com.spring.CMS.CMS.Service.Group_LicenseService;

@Service
public class Group_LicenseServiceImpl implements Group_LicenseService
{
	@Autowired
	private Group_LicenseDAO dao;

	@Transactional
	public List<Group_License> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public Group_License getById(int group) 
	{
		return dao.getById(group);
	}

	@Transactional
	public Group_License save(Group_License group) 
	{
		dao.save(group);
		return group;
	}

	@Transactional
	public Group_License update(Group_License group) 
	{
		dao.update(group);
		return group;
	}

	@Transactional
	public void delete(Group_License group) 
	{
		dao.delete(group);
	}

	@Transactional
	public List<Group_License> getByGroup(int id) 
	{
		return dao.getByGroup(id);
	}

	@Transactional
	public List<Group_License> getByLicense(int id) 
	{
		return dao.getByLicense(id);
	}

	@Override
	public Group_License getByGroupAndLicense(int group, int license) 
	{
		return dao.getByGroupAndLicense(group, license);
	}

}
