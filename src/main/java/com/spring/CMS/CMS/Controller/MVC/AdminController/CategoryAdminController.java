package com.spring.CMS.CMS.Controller.MVC.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.CMS.CMS.Entity.Category;
import com.spring.CMS.CMS.Service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryAdminController 
{
	@Autowired
	private CategoryService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m) 
	{
		m.addAttribute("msg", "Bienvenido a categoria.");
		return new ModelAndView("/admin/category");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("category", new Category());
		return new ModelAndView("/admin/new/category");
	}
	
	@PostMapping
	public String save(@ModelAttribute Category category)
	{
		service.save(category);
		return "redirect:/admin/category";
	}
}
