package org.kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*
	@RequestMapping("home.do")
	public ModelAndView home() {
		//첫번째 인자 : view name, 두번째 : attribute name , 세번쨰 : attribute value
		return new ModelAndView("index","message","Hello SpringMVC~");
	}
	*/
	@RequestMapping("home.do")
	public String home(Model model) {
		//request.setAttribute와 동일한 표현
		model.addAttribute("message","Hello Spring MVC 즐거운 한 주~~"); //model 정보
		//springmvc-servlet.xml 의 viewResolver 설정에 의해 
		//리턴하는 view name은 /WEB-INF/views/index.jsp 로 찾아서 응답하게 된다
		return "index"; //view name
	}
	
}

