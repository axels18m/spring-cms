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

import com.spring.CMS.CMS.Entity.License;
import com.spring.CMS.CMS.Entity.RepBase;
import com.spring.CMS.CMS.Service.LicenseService;

@RestController
@RequestMapping("/api/license")
public class LicenseRestController 
{
	@Autowired
	private LicenseService service;

	@GetMapping
	public ResponseEntity<List<License>> getAll(Pageable pageable)
	{
		return ResponseEntity.ok(service.getAll(pageable));
	}
	
	@GetMapping({"/id", "/id/{id}"})
	public ResponseEntity<License> getById(@PathVariable int id)
	{
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PutMapping({"/save", "/save/{license}"})
	public ResponseEntity<RepBase> save(@PathVariable License license)
	{
		return ResponseEntity.ok(new RepBase(service.save(license)));
	}
	
	@PutMapping({"/update", "/update/{license}"})
	public ResponseEntity<RepBase> update(@PathVariable License license)
	{
		return ResponseEntity.ok(new RepBase(service.update(license)));
	}
	
	@DeleteMapping({"/delete", "/delete/{license}"})
	public void delete(@PathVariable License license)
	{
		service.delete(license);
	}
}
