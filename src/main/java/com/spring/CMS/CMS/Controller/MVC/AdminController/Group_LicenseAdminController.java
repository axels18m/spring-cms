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

import com.spring.CMS.CMS.Entity.Group_License;
import com.spring.CMS.CMS.Service.Group_LicenseService;
import com.spring.CMS.CMS.Service.LicenseService;

@Controller
@RequestMapping("/admin/group_license")
public class Group_LicenseAdminController 
{
	
	@Autowired
	private Group_LicenseService service;
	
	@Autowired
	private LicenseService licenseService;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a group licenses.");
		m.addAttribute("license_groups", service.getAll(pageable));
		return new ModelAndView("/admin/group_license");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("group_license", new Group_License());
		m.addAttribute("licenses", licenseService.getAll(new Pageable()));
		return new ModelAndView("/admin/group_license/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("group_license", service.getById(id));
		return new ModelAndView("/admin/group_license/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Group_License group)
	{
		service.save(group);
		return "redirect:/admin/group_license";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/group_license";
	}
}
