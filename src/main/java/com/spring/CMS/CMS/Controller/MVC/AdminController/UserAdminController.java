package com.spring.CMS.CMS.Controller.MVC.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/user")
public class UserAdminController 
{
	@GetMapping({"/", ""})
	public ModelAndView home(Model m) 
	{
		m.addAttribute("msg", "Bienvenido a usuario.");
		return new ModelAndView("admin/user");
	}

}
