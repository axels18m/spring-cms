package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.CMS.CMS.DAO.CategoryDAO;
import com.spring.CMS.CMS.Entity.Category;
import com.spring.CMS.CMS.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryDAO dao;

	@Transactional
	public List<Category> getAll() 
	{
		return dao.getAll();
	}

	@Transactional
	public Category getById(int id) 
	{
		return dao.getById(id);
	}

	@Transactional
	public List<Category> getByCatSuperior(int superior) 
	{
		return dao.getByCatSuperior(superior);
	}

	@Transactional
	public void save(Category category) 
	{
		dao.save(category);
	}

	@Transactional
	public void update(Category category) 
	{
		dao.update(category);
	}

	@Transactional
	public void delete(Category category) 
	{
		dao.delete(category);
	}

}
