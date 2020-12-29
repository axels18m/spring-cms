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

import com.spring.CMS.CMS.Entity.Comment;
import com.spring.CMS.CMS.Service.CommentService;
import com.spring.CMS.CMS.Service.PostService;
import com.spring.CMS.CMS.Service.UserService;

@Controller
@RequestMapping("/admin/comment")
public class CommentAdminController 
{
	@Autowired
	private CommentService service;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a comment.");
		m.addAttribute("comments", service.getAll(pageable));
		return new ModelAndView("/admin/comment");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("comment", new Comment());
		m.addAttribute("users", userService.getAll(new Pageable()));
		m.addAttribute("posts", postService.getAll(new Pageable()));
		return new ModelAndView("/admin/comment/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("comment", service.getById(id));
		m.addAttribute("users", userService.getAll(new Pageable()));
		m.addAttribute("posts", postService.getAll(new Pageable()));
		return new ModelAndView("/admin/comment/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Comment comment)
	{
		service.save(comment);
		return "redirect:/admin/comment";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/comment";
	}
}
