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

import com.spring.CMS.CMS.Entity.Content;
import com.spring.CMS.CMS.Service.ContentService;
import com.spring.CMS.CMS.Service.PostService;

@Controller
@RequestMapping("/admin/content")
public class ContentAdminController 
{
	@Autowired
	private ContentService service;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private ContentService contentService;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable) 
	{
		m.addAttribute("msg", "Bienvenido a content.");
		m.addAttribute("contents", service.getAll(pageable));
		return new ModelAndView("/admin/content");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("content", new Content());
		m.addAttribute("posts", postService.getAll(new Pageable()));
		m.addAttribute("contents", contentService.getAll(new Pageable()));
		return new ModelAndView("/admin/content/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("content", service.getById(id));
		m.addAttribute("posts", postService.getAll(new Pageable()));
		m.addAttribute("contents", contentService.getAll(new Pageable()));
		return new ModelAndView("/admin/content/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Content content)
	{
		service.save(content);
		return "redirect:/admin/content";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/category";
	}
}
