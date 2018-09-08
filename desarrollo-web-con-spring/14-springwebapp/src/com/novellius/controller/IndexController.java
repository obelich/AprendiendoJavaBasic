package com.novellius.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

}
