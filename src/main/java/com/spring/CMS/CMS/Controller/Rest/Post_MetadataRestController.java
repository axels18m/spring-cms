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

import com.spring.CMS.CMS.Entity.Post_Metadata;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.Post_MetadataService;

@RestController
@RequestMapping("/api/post_metadata")
public class Post_MetadataRestController 
{
	@Autowired
	private Post_MetadataService service;
	
	@GetMapping
	public ResponseEntity<List<Post_Metadata>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Post_Metadata> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{post}"})
	public ResponseEntity<RepBase> save(@PathVariable Post_Metadata post)
	{
		return ResponseEntity.ok(new RepBase(service.save(post)));
	}
	
	@PutMapping({"/update", "/update/{post}"})
	public ResponseEntity<RepBase> update(@PathVariable Post_Metadata post)
	{
		return ResponseEntity.ok(new RepBase(service.update(post)));
	}
	
	@DeleteMapping({"/delete", "/delete/{post}"})
	public void delete(@PathVariable Post_Metadata post)
	{
		service.delete(post);
	}

}
