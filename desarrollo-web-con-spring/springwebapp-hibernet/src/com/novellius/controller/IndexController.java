package com.novellius.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("resultado")
public class IndexController {

	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("resultado", "Resultado desde Session"); //Teniendo el mismo nombre de atributo el contenido se comparte en todos 
																	//es accesible en todos los metodos
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "about";
	}
	


}
