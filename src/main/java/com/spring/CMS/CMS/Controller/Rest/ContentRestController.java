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

import com.spring.CMS.CMS.Entity.Content;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.ContentService;

@RestController
@RequestMapping("/api/content")
public class ContentRestController 
{
	@Autowired
	private ContentService service;
	
	@GetMapping
	public ResponseEntity<List<Content>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Content> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{content}"})
	public ResponseEntity<RepBase> save(@PathVariable Content content)
	{
		return ResponseEntity.ok(new RepBase(service.save(content)));
	}
	
	@PutMapping({"/update", "/update/{content}"})
	public ResponseEntity<RepBase> update(@PathVariable Content content)
	{
		return ResponseEntity.ok(new RepBase(service.update(content)));
	}
	
	@DeleteMapping({"/delete", "/delete/{content}"})
	public void delete(@PathVariable Content content)
	{
		service.delete(content);
	}
}
