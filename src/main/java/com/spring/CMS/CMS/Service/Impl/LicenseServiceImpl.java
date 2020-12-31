package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.LicenseDAO;
import com.spring.CMS.CMS.Entity.License;
import com.spring.CMS.CMS.Service.LicenseService;

@Service
public class LicenseServiceImpl implements LicenseService
{
	@Autowired
	private LicenseDAO dao;

	@Transactional
	public List<License> getAll(Pageable pageable)
	{
		return dao.getAll(pageable);
	}

	@Transactional
	public License getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<License> getByName(String name) 
	{
		return dao.getByName(name);
	}

	@Transactional
	public License save(License license) 
	{
		dao.save(license);
		return license;
	}

	@Transactional
	public License update(License license) 
	{
		dao.update(license);
		return license;
	}

	@Transactional
	public void delete(License license) 
	{
		dao.delete(license);
	}

	@Transactional
	public List<License> getByGroupLic(int group) 
	{
		return dao.getByGroupLic(group);
	}

	@Transactional
	public List<License> getByDiffGroupLic(int group) 
	{
		return dao.getByDiffGroupLic(group);
	}

}
