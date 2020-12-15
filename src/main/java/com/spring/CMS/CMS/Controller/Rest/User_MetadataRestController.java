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

import com.spring.CMS.CMS.Entity.User_Metadata;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.User_MetadataService;

@RestController
@RequestMapping("/api/user_metadata")
public class User_MetadataRestController 
{
	@Autowired
	private User_MetadataService service;
	
	@GetMapping
	public ResponseEntity<List<User_Metadata>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<User_Metadata> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{user}"})
	public ResponseEntity<RepBase> save(@PathVariable User_Metadata user)
	{
		return ResponseEntity.ok(new RepBase(service.save(user)));
	}
	
	@PutMapping({"/update", "/update/{user}"})
	public ResponseEntity<RepBase> update(@PathVariable User_Metadata user)
	{
		return ResponseEntity.ok(new RepBase(service.update(user)));
	}
	
	@DeleteMapping({"/delete", "/delete/{user}"})
	public void delete(@PathVariable User_Metadata user)
	{
		service.delete(user);
	}

}