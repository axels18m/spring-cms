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

import com.spring.CMS.CMS.Entity.Post;
import com.spring.CMS.CMS.Service.PostService;

@Controller
@RequestMapping("/admin/post")
public class PostAdminController 
{
	@Autowired
	private PostService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable) 
	{
		m.addAttribute("msg", "Bienvenido a publicaciones.");
		m.addAttribute("posts", service.getAll(pageable));
		return new ModelAndView("/admin/post");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("post", service.getById(id));
		return new ModelAndView("/admin/post/index");
	}
	
	@GetMapping({"/new"})
	public ModelAndView insert(Model m)
	{
		m.addAttribute("post", new Post());
		return new ModelAndView("/admin/post/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Post post)
	{
		service.save(post);
		return "redirect:/admin/post";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/post";
	}
}
