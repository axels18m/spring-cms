package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.License;

public interface LicenseService 
{
	public List<License> getAll(Pageable pageable);
	public License getById(int id);
	public List<License> getByName(String name);
	public void save(License license);
	public void update(License license);
	public void delete(License license);
}
