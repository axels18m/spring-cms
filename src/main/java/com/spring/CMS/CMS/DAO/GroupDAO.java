package com.spring.CMS.CMS.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Group;
import com.spring.CMS.CMS.Mapper.BaseRep;


public interface GroupDAO extends BaseRep<Group>
{
	public List<Group> getAll(Pageable pageable);
	public Group getById(int id);
	public List<Group> getByName(String name);
	public Group save(Group group);
	public Group update(Group group);
	public void delete(Group group);
}
