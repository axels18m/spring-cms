package com.spring.CMS.CMS.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CMS.CMS.Entity.Category;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController 
{
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Category> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{category}"})
	public ResponseEntity<RepBase> save(@PathVariable Category category)
	{
		return ResponseEntity.ok(new RepBase(service.save(category)));
	}
	
	@PutMapping({"/update", "/update/{category}"})
	public ResponseEntity<RepBase> update(@PathVariable Category category)
	{
		return ResponseEntity.ok(new RepBase(service.update(category)));
	}
	
	@DeleteMapping({"/delete", "/delete/{category}"})
	public void delete(@PathVariable Category category)
	{
		service.delete(category);
	}

}
