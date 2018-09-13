package com.novellius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.novellius.pojo.Administrator;
import com.novellius.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/admins")
	public String showAdmin(Model model, @ModelAttribute("resultado") String resultado) { //Con Model se le pasan atributos del controlador a la vista
		
		Administrator administrator = new Administrator();
		model.addAttribute("admin", administrator);
		model.addAttribute("resultado", resultado);
		return "admins";
	}
	
	@RequestMapping(value="/admin/save", method=RequestMethod.POST)
	public String handleAdmin(@ModelAttribute("admin") Administrator adminForm,  Model model, RedirectAttributes re, @RequestParam("status") String status ) {
		
		if (adminService.save(adminForm)) {
			re.addAttribute("resultado", "El administrador se creo con exito");
		} else {
			re.addAttribute("resultado", "El administrador No se guardo");
		}
		

		
		
		return "redirect:/admins";
	}
	

}
