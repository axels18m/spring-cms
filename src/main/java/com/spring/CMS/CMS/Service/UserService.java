package com.spring.CMS.CMS.Service;

import java.util.List;

import com.spring.CMS.CMS.Entity.User;

public interface UserService 
{
	public List<User> getAll();
	public User getById(int id);
	public List<User> getByGroup(int group);
	public void save(User user);
	public void update(User user);
	public void delete(User user);
}
