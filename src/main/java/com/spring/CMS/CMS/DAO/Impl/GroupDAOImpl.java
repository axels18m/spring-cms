package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.GroupDAO;
import com.spring.CMS.CMS.Entity.Group;

@Repository
public class GroupDAOImpl implements GroupDAO
{
	@Autowired 
	private EntityManager em;
	private Session session = em.unwrap(Session.class);

	@Override
	public List<Group> getAll(Pageable pageable)
	{
		Query<Group> query = session.createQuery("from group", Group.class);
		return query.getResultList();		
	}

	@Override
	public Group getById(int id) 
	{
		return session.get(Group.class, id);
	}

	@Override
	public List<Group> getByName(String name) 
	{
		Query<Group> query = session.createQuery("from group where group.name_group = '" + name + "'", Group.class);
		return query.getResultList();
	}

	@Override
	public void save(Group group) 
	{
		session.saveOrUpdate(group);
	}

	@Override
	public void update(Group group) 
	{
		session.saveOrUpdate(group);
	}

	@Override
	public void delete(Group group) 
	{
		session.delete(group);
	}

}
