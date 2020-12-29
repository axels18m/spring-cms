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

import com.spring.CMS.CMS.Entity.Group;
import com.spring.CMS.CMS.Service.GroupService;

@Controller
@RequestMapping("/admin/group")
public class GroupAdminController 
{
	@Autowired
	private GroupService service;
	
	@GetMapping({"/", ""})
	public ModelAndView home(Model m, Pageable pageable)
	{
		m.addAttribute("msg", "Bienvenido a group.");
		m.addAttribute("groups", service.getAll(pageable));
		return new ModelAndView("/admin/group");
	}
	
	@GetMapping("/new")
	public ModelAndView insert(Model m)
	{
		m.addAttribute("group", new Group());
		return new ModelAndView("/admin/group/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("group", service.getById(id));
		return new ModelAndView("/admin/group/index");
	}
	
	@PostMapping
	public String save(@ModelAttribute Group comment)
	{
		service.save(comment);
		return "redirect:/admin/group";
	}
	
	@DeleteMapping({"/delete", "/delete/{id}"})
	public String delete(@PathVariable int id)
	{
		service.delete(service.getById(id));
		return "redirect:/admin/group";
	}
}
