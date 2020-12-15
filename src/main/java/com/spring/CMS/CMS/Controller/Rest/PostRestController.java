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

import com.spring.CMS.CMS.Entity.Post;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.PostService;

@RestController
@RequestMapping("api/post")
public class PostRestController 
{
	@Autowired
	private PostService service;
	
	@GetMapping
	public ResponseEntity<List<Post>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id{post}"})
	public ResponseEntity<Post> getById(@PathVariable int post)
	{
		return ResponseEntity.ok(service.getById(post));
	}
	
	@PutMapping({"/save", "/save/{post}"})
	public ResponseEntity<RepBase> save(@PathVariable Post post)
	{
		return ResponseEntity.ok(new RepBase(service.save(post)));
	}
	
	
	@PutMapping({"/update", "/update/{post}"})
	public ResponseEntity<RepBase> update(@PathVariable Post post)
	{
		return ResponseEntity.ok(new RepBase(service.update(post)));
	}
	
	@DeleteMapping({"/delete", "/delete/{post}"})
	public void delete(@PathVariable Post post)
	{
		service.delete(post);
	}
}
