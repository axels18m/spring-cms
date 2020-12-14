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
	public Group_License getByLicense(int license) 
	{
		return dao.getByLicense(license);
	}

	@Transactional
	public void save(Group_License group) 
	{
		dao.save(group);
	}

	@Transactional
	public void update(Group_License group) 
	{
		dao.update(group);
	}

	@Transactional
	public void delete(Group_License group) 
	{
		dao.delete(group);
	}

}
