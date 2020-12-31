package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.Group_LicenseDAO;
import com.spring.CMS.CMS.Entity.Group_License;

@Repository
public class Group_LicenseDAOImpl implements Group_LicenseDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<Group_License> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<Group_License> query = session.createQuery("from group_license", Group_License.class);
		return query.getResultList();
	}

	@Override
	public Group_License getById(int group) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(Group_License.class, group);
	}

	@Override
	public Group_License save(Group_License group) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(group);
		return group;
	}

	@Override
	public Group_License update(Group_License group) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(group);
		return group;
	}

	@Override
	public void delete(Group_License group) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(group);
	}

	@Override
	public List<Group_License> getByGroup(int id) 
	{
		Session session = em.unwrap(Session.class);
		Query<Group_License> query = session.createQuery("select gp from group_license gp inner join group_table g on gp.id_group_gpolic = g.id_group where g.id_group =  " + id, Group_License.class);
		return query.getResultList();
	}

	@Override
	public List<Group_License> getByLicense(int id) 
	{
		Session session = em.unwrap(Session.class);
		Query<Group_License> query = session.createQuery("select gp from group_license gp inner join license l on gp.id_license_gpolic = l.id_license where l.id_license = " + id, Group_License.class);
		return query.getResultList();
	}

	@Override
	public Group_License getByGroupAndLicense(int group, int license) 
	{
		Session session = em.unwrap(Session.class);
		Query<Group_License> query = session.createQuery("select gl from group_license gl inner join license l on l.id_license = gl.id_license_gpolic "
				+ "inner join group g on gl.id_group_gpolic = g.id_group where l.id_license = " + license + " and g.id_group = " + group, Group_License.class);
		return query.getSingleResult();
	}

}
