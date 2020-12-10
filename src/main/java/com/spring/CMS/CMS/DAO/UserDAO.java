package com.spring.CMS.CMS.DAO;

import java.util.List;

import com.spring.CMS.CMS.Entity.User;

public interface UserDAO 
{
	public List<User> getAll();
	public User getById(int id);
	public List<User> getByGroup(int group);
	public void save(User user);
	public void update(User user);
	public void delete(User user);
}
