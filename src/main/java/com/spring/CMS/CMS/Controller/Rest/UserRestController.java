package com.spring.CMS.CMS.Controller.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Entity.User;
import com.spring.CMS.CMS.Service.UserService;
import com.spring.CMS.CMS.Service.Impl.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserRestController 
{
	@Autowired
	private UserService service;
	
	
	@PutMapping({"/save", "/save/{user"})
	@CacheEvict(value = "categories", allEntries = true)
	public ResponseEntity<RepBase> save(@RequestBody User user)
	{
		return ResponseEntity.ok(new RepBase(service.save(user)));
	}
	
	@PostMapping({"/update", "/update/{user}"})
	@CacheEvict(value = "categories", allEntries = true)
	public ResponseEntity<RepBase> update(@RequestBody User user)
	{
		return ResponseEntity.ok(new RepBase(service.save(user)));
	}
	
	@GetMapping
	@CacheEvict(value = "categories", allEntries = true) /* Update on entries change */
	public ResponseEntity<List<User>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<User> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@DeleteMapping({"/delete", "/delete/{user}"})
	@CacheEvict(value = "categories", allEntries = true)
	public void delete(@PathVariable User user)
	{
		service.delete(user);
	}
}
