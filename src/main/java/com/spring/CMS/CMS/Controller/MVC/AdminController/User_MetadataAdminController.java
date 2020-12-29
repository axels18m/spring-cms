package com.spring.CMS.CMS.Controller.MVC.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.CMS.CMS.Entity.User_Metadata;
import com.spring.CMS.CMS.Service.User_MetadataService;

@Controller
@RequestMapping("/admin/user_metadata")
public class User_MetadataAdminController 
{
	@Autowired
	private User_MetadataService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a content.");
		m.addAttribute("metadata_users", service.getAll(pageable));
		return new ModelAndView("/admin/user_metadata");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("user_metadata", new User_Metadata());
		return new ModelAndView("/admin/user_metadata/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("metadata_user", service.getById(id));
		return new ModelAndView("/admin/user_metadata/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute User_Metadata user_metadata)
	{
		service.save(user_metadata);
		return "redirect:/admin/user_metadata";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/user_metadata";
	}
}
