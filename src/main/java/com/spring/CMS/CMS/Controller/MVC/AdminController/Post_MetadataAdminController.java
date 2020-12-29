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

import com.spring.CMS.CMS.Entity.Post_Metadata;
import com.spring.CMS.CMS.Service.ContentService;
import com.spring.CMS.CMS.Service.PostService;
import com.spring.CMS.CMS.Service.Post_MetadataService;

@Controller
@RequestMapping("/admin/post_metadata")
public class Post_MetadataAdminController 
{
	@Autowired
	private Post_MetadataService service;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private ContentService contentService;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a content.");
		m.addAttribute("metadata_posts", service.getAll(pageable));
		return new ModelAndView("/admin/post_metadata");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("post_metadata", new Post_Metadata());
		m.addAttribute("posts", postService.getAll(new Pageable()));
		m.addAttribute("contents", contentService.getAll(new Pageable()));
		return new ModelAndView("/admin/post_metadata/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("post_metadata", service.getById(id));
		m.addAttribute("posts", postService.getAll(new Pageable()));
		m.addAttribute("contents", contentService.getAll(new Pageable()));
		return new ModelAndView("/admin/post_metadata/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Post_Metadata post_metadata)
	{
		service.save(post_metadata);
		return "redirect:/admin/post_metadata";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/post_metadata";
	}

}
