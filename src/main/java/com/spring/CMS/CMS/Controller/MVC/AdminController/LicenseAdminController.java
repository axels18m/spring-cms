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

import com.spring.CMS.CMS.Entity.License;
import com.spring.CMS.CMS.Service.LicenseService;

@Controller
@RequestMapping("/admin/license")
public class LicenseAdminController 
{
	@Autowired
	private LicenseService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a licencias.");
		m.addAttribute("licenses", service.getAll(pageable));
		return new ModelAndView("/admin/license");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("license", new License());
		return new ModelAndView("/admin/license/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("license", service.getById(id));
		return new ModelAndView("/admin/license/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute License license)
	{
		service.save(license);
		return "redirect:/admin/license";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/license";
	}
}
