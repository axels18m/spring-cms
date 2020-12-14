package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Category;

public interface CategoryService 
{
	public List<Category> getAll(Pageable pageable);
	public Category getById(int id);
	public List<Category> getByCatSuperior(int superior);
	public void save(Category category);
	public void update(Category category);
	public void delete(Category category);
}
