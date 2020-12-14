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
	private Session session = em.unwrap(Session.class);

	@Override
	public List<Group_License> getAll(Pageable pageable)
	{
		Query<Group_License> query = session.createQuery("from group_license", Group_License.class);
		return query.getResultList();
	}

	@Override
	public Group_License getById(int group) 
	{
		return session.get(Group_License.class, group);
	}

	@Override
	public Group_License getByLicense(int license) 
	{
		Query<Group_License> query = session.createQuery("from group_license where group_license.idLicense_gpolic = " + license, Group_License.class);
		return query.getSingleResult();
	}

	@Override
	public void save(Group_License group) 
	{
		session.saveOrUpdate(group);
	}

	@Override
	public void update(Group_License group) 
	{
		session.saveOrUpdate(group);
	}

	@Override
	public void delete(Group_License group) 
	{
		session.delete(group);
	}

}
