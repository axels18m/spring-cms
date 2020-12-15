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

import com.spring.CMS.CMS.Entity.Group_License;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.Group_LicenseService;

@RestController
@RequestMapping("/api/group_license")
public class Group_LicenseRestController 
{
	@Autowired
	private Group_LicenseService service;
	
	@GetMapping
	public ResponseEntity<List<Group_License>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<Group_License> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{group}"})
	public ResponseEntity<RepBase> save(@PathVariable Group_License group)
	{
		return ResponseEntity.ok(new RepBase(service.save(group)));
	}
	
	@PutMapping({"/update", "/update/{group}"})
	public ResponseEntity<RepBase> update(@PathVariable Group_License group)
	{
		return ResponseEntity.ok(new RepBase(service.update(group)));
	}
	
	@DeleteMapping({"/delete", "/delete/{group}"})
	public void delete(@PathVariable Group_License group)
	{
		service.delete(group);
	}

}
