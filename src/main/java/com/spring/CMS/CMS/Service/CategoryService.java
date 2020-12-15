package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Category;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface CategoryService extends BaseRep<Category>
{
	public List<Category> getAll(Pageable pageable);
	public Category getById(int id);
	public List<Category> getByCatSuperior(int superior);
	public Category save(Category category);
	public Category update(Category category);
	public void delete(Category category);
}
