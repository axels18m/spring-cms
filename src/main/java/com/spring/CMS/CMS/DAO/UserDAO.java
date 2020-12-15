package com.spring.CMS.CMS.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.User;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface UserDAO extends BaseRep<User>
{
	public List<User> getAll(Pageable pageable);
	public User getById(int id);
	public List<User> getByGroup(int group);
	public User save(User user);
	public User update(User user);
	public void delete(User user);
}
