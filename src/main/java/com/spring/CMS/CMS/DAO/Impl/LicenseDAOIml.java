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
	private Session session = em.unwrap(Session.class);

	@Override
	public List<License> getAll(Pageable pageable)
	{
		Query<License> query = session.createQuery("from post", License.class);
		return query.getResultList();
	}

	@Override
	public License getById(int id) 
	{
		return session.get(License.class, id);
	}

	@Override
	public List<License> getByName(String name) 
	{
		Query<License> query = session.createQuery("from post where license.name_lic = '" + name + "'", License.class);
		return query.getResultList();
	}

	@Override
	public void save(License license) 
	{
		session.saveOrUpdate(license);
	}

	@Override
	public void update(License license) 
	{
		session.saveOrUpdate(license);
	}

	@Override
	public void delete(License license) 
	{
		session.delete(license);
	}

}
