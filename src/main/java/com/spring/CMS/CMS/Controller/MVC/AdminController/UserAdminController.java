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

import com.spring.CMS.CMS.Entity.User;
import com.spring.CMS.CMS.Service.GroupService;
import com.spring.CMS.CMS.Service.UserService;

@Controller
@RequestMapping("/admin/user")
public class UserAdminController 
{
	@Autowired 
	private UserService service;
	
	@Autowired
	private GroupService groupService;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable) 
	{
		m.addAttribute("msg", "Bienvenido a usuario.");
		m.addAttribute("users", service.getAll(pageable));
		return new ModelAndView("admin/user");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("user", new User());
		m.addAttribute("groups", groupService.getAll(new Pageable()));
		return new ModelAndView("/admin/user/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("user", service.getById(id));
		m.addAttribute("groups", groupService.getAll(new Pageable()));
		return new ModelAndView("/admin/user/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute User user)
	{
		service.save(user);
		return "redirect:/admin/user";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/user";
	}
}
