package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.License;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface LicenseService extends BaseRep<License>
{
	public List<License> getAll(Pageable pageable);
	public License getById(int id);
	public List<License> getByName(String name);
	public License save(License license);
	public License update(License license);
	public void delete(License license);
	
	public List<License> getByGroupLic(int group);
	public List<License> getByDiffGroupLic(int group);
}
