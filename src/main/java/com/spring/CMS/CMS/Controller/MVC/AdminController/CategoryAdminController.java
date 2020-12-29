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

import com.spring.CMS.CMS.Entity.Category;
import com.spring.CMS.CMS.Service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryAdminController 
{
	@Autowired
	private CategoryService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable) 
	{
		m.addAttribute("msg", "Bienvenido a categoria.");
		m.addAttribute("categories", service.getAll(pageable));
		return new ModelAndView("/admin/category");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("category", new Category());
		return new ModelAndView("/admin/category/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("category", service.getById(id));
		return new ModelAndView("/admin/category/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Category category)
	{
		service.save(category);
		return "redirect:/admin/category";
	}
	
	@DeleteMapping({"/delete", "/delete/{category}"})
	public String delete(@PathVariable int category)
	{
		service.delete(service.getById(category));
		return "redirect:/admin/category";
	}
}
