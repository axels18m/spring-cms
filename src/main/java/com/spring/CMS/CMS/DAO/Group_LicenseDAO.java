package com.spring.CMS.CMS.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Group_License;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface Group_LicenseDAO extends BaseRep<Group_License>
{
	public List<Group_License> getAll(Pageable pageable);
	public Group_License getById(int group);
	public Group_License save(Group_License group);
	public Group_License update(Group_License group);
	public void delete(Group_License group);
	
	public List<Group_License> getByGroup(int id);
	public List<Group_License> getByLicense(int id);
	public Group_License getByGroupAndLicense(int group, int license);
}
