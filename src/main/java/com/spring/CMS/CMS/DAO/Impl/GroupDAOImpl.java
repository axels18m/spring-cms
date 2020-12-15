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

	@Override
	public List<Group> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Group> query = session.createQuery("from group", Group.class);
		return query.getResultList();		
	}

	@Override
	public Group getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Group.class, id);
	}

	@Override
	public List<Group> getByName(String name) 
	{
		Session session = em.unwrap(Session.class);
		Query<Group> query = session.createQuery("from group where group.name_group = '" + name + "'", Group.class);
		return query.getResultList();
	}

	@Override
	public Group save(Group group) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(group);
		return group;
	}

	@Override
	public Group update(Group group) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(group);
		return group;
	}

	@Override
	public void delete(Group group) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(group);
	}

}
