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

import com.spring.CMS.CMS.Entity.Group;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.GroupService;

@RestController
@RequestMapping("/api/group")
public class GroupRestController 
{
	@Autowired
	private GroupService service;
	
	@GetMapping
	public ResponseEntity<List<Group>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Group> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{group}"})
	public ResponseEntity<RepBase> save(@PathVariable Group group)
	{
		return ResponseEntity.ok(new RepBase(service.save(group)));
	}
	
	@PutMapping({"/update", "/update/{group}"})
	public ResponseEntity<RepBase> update(@PathVariable Group group)
	{
		return ResponseEntity.ok(new RepBase(service.update(group)));
	}
	
	@DeleteMapping({"/delete", "/delete/{group}"})
	public void delete(@PathVariable Group group)
	{
		service.delete(group);
	}

}
