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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.CMS.CMS.Entity.Group;
import com.spring.CMS.CMS.Entity.Group_License;
import com.spring.CMS.CMS.Service.GroupService;
import com.spring.CMS.CMS.Service.Group_LicenseService;
import com.spring.CMS.CMS.Service.LicenseService;

@Controller
@RequestMapping("/admin/group")
public class GroupAdminController 
{
	@Autowired
	private GroupService service;
	
	@Autowired
	private LicenseService licService;
	
	@Autowired
	private Group_LicenseService glService;
	
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
		m.addAttribute("licenses", licService.getAll(new Pageable()));
		return new ModelAndView("/admin/group/index");
	}
	
	@GetMapping({"/edit/{id}", "/edit"})
	public ModelAndView update(Model m, @PathVariable int id)
	{
		m.addAttribute("group", service.getById(id));
		m.addAttribute("notAvailableLicenses", licService.getByDiffGroupLic(id));
		m.addAttribute("availableLicenses", licService.getByGroupLic(id));
		m.addAttribute("showLicenses", true);
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
	
	@PostMapping("/addLicense")
	public RedirectView addLicense(@RequestParam int group, @RequestParam int license)
	{
		Group_License gl = new Group_License();
		gl.setId_license_gpolic(license);
		gl.setId_group_gpolic(group);
		glService.save(gl);
		return new RedirectView("/admin/group/edit/" + group);
	}
	
	@PostMapping("/deleteLicense")
	public RedirectView deleteLicense(@RequestParam int group, @RequestParam int license)
	{
		glService.delete(glService.getByGroupAndLicense(group, license));
		return new RedirectView("/admin/group/edit/" + group);
	}
}
