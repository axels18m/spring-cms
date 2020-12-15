package com.spring.CMS.CMS.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Entity.Comment;
import com.spring.CMS.CMS.Service.CommentService;

@RestController
@RequestMapping("/api/user")
public class CommentRestController 
{
	@Autowired
	private CommentService service;
	
	
	@PutMapping({"/save", "/save/{comment"})
	public ResponseEntity<RepBase> save(@RequestBody Comment comment)
	{
		return ResponseEntity.ok(new RepBase(service.save(comment)));
	}
	
	@PostMapping({"/update", "/update/{comment}"})
	public ResponseEntity<RepBase> update(@RequestBody Comment comment)
	{
		return ResponseEntity.ok(new RepBase(service.save(comment)));
	}
	
	@GetMapping
	public ResponseEntity<List<Comment>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Comment> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@DeleteMapping({"/delete", "/delete/{comment}"})
	public void delete(@PathVariable Comment comment)
	{
		service.delete(comment);
	}
}
