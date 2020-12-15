package com.spring.CMS.CMS.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
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
	public List<Category> getAll(Pageable pageable) 
	{
		return dao.getAll(pageable);
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
	public Category save(Category category) 
	{
		dao.save(category);
		return category;
	}

	@Transactional
	public Category update(Category category) 
	{
		dao.update(category);
		return category;
	}

	@Transactional
	public void delete(Category category) 
	{
		dao.delete(category);
	}

}
