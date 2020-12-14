package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Group;

public interface GroupService 
{
	public List<Group> getAll(Pageable pageable);
	public Group getById(int id);
	public List<Group> getByName(String name);
	public void save(Group group);
	public void update(Group group);
	public void delete(Group group);
}
