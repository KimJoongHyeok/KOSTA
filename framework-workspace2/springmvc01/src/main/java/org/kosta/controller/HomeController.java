package org.kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*
	@RequestMapping("home.do")
	public ModelAndView home() {
		return new ModelAndView("index","message","Hello SpringMVC~");
	}
	*/
	@RequestMapping("home.do")
	public String home(Model model) {
		model.addAttribute("message","Hello Spring MVC 즐 주말~~");
		return "index";
	}
}
