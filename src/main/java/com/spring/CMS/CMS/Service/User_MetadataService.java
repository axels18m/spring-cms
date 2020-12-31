package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.User_Metadata;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface User_MetadataService extends BaseRep<User_Metadata>
{
	public List<User_Metadata> getAll(Pageable pageable);
	public List<User_Metadata> getByKey(String key);
	public List<User_Metadata> getByType(String type);
	public User_Metadata getById(int id);
	public User_Metadata save(User_Metadata user);
	public User_Metadata update(User_Metadata user);
	public void delete(User_Metadata user);
	
	public List<User_Metadata> getByUser(int user);
}
