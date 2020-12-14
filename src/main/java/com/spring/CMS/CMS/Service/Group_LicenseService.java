package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Group_License;

public interface Group_LicenseService 
{
	public List<Group_License> getAll(Pageable pageable);
	public Group_License getById(int group);
	public Group_License getByLicense(int license);
	public void save(Group_License group);
	public void update(Group_License group);
	public void delete(Group_License group);
}
