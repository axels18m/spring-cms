package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.User;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface UserService extends BaseRep<User>
{
	public List<User> getAll(Pageable pageable);
	public User getById(int id);
	public User save(User user);
	public User update(User user);
	public void delete(User user);
	
	public List<User> getByGroup(int group);
}
