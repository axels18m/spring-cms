package com.spring.CMS.CMS.DAO.Impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Repository;

import com.spring.CMS.CMS.DAO.LicenseDAO;
import com.spring.CMS.CMS.Entity.License;

@Repository
public class LicenseDAOIml implements LicenseDAO
{
	@Autowired
	private EntityManager em;

	@Override
	public List<License> getAll(Pageable pageable)
	{
		Session session = em.unwrap(Session.class);
		Query<License> query = session.createQuery("from license", License.class);
		return query.getResultList();
	}

	@Override
	public License getById(int id) 
	{
		Session session = em.unwrap(Session.class);
		return session.get(License.class, id);
	}

	@Override
	public List<License> getByName(String name) 
	{
		Session session = em.unwrap(Session.class);
		Query<License> query = session.createQuery("from license where license.name_lic = '" + name + "'", License.class);
		return query.getResultList();
	}

	@Override
	public License save(License license) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(license);
		return license;
	}

	@Override
	public License update(License license) 
	{
		Session session = em.unwrap(Session.class);
		session.saveOrUpdate(license);
		return license;
	}

	@Override
	public void delete(License license) 
	{
		Session session = em.unwrap(Session.class);
		session.delete(license);
	}

	@Override
	public List<License> getByGroupLic(int group) 
	{
		Session session = em.unwrap(Session.class);
		return (List<License>) (session.createQuery("select distinct l from license l inner join group_license gl on l.id_license = gl.id_license_gpolic where gl.id_group_gpolic = " + group, License.class)).getResultList();
	}

	@Override
	public List<License> getByDiffGroupLic(int group)
	{
		Session session = em.unwrap(Session.class);
		return (List<License>) (session.createQuery("select distinct l from license l inner join group_license gl on l.id_license = gl.id_license_gpolic where gl.id_group_gpolic != " + group, License.class)).getResultList();
	}

}
