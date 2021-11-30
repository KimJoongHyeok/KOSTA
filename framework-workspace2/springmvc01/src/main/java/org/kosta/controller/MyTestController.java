package org.kosta.controller;

import javax.servlet.http.HttpSession;

import org.kosta.model.CustomerDTO;
import org.kosta.model.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyTestController {
	
	@RequestMapping("hello.do")
	public ModelAndView myTest() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result1"); //ViewResolver에 의해 /WEB-INF/views/result1.jsp 로 응답한다
		mv.addObject("info", "Hello SpringMVC"); //request.setAtrribute("info","") 와 동일
		return mv;
	}
	
	//위의 컨트롤러 개발 스타일을 아래와 같이 표현가능 
	@RequestMapping("hi.do")
	public String myTest2(Model model) {
		model.addAttribute("info", "Hi SpringMVC");
		return "result1";
	}
	
	@RequestMapping("paramTest1.do")
	//@RequestParam : request.getParameter()의 역할
	//HandlerAdapter(RequestMappingHandlerAdapter)가 컨트롤러 실행시
	//매개변수에 알맞는 데이터를 생성해 전달해준다
	//@RequestParam 은 매개변수명이 form data의 name과 일치한다면 생략이 가능
	//public String paramTest1(@RequestParam String customerId,Model model) {
	public String paramTest1(String customerId,Model model) {
		model.addAttribute("customerName","아이유");
		return "result2";
	}
	
	@RequestMapping("paramTest2.do")
	public String paramTest2(String userName,String userAddress,Model model) {
		model.addAttribute("message","고객 정보 등록완료");
		return "result3";
	}
	
	@RequestMapping("paramTest3.do")
	//HandlerAdapter 가 request.getParameterValues() 처리해서 배열로 전달
	public String paramTest3(String[]hobby,Model model) {
		for(int i = 0;i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		return "result4";
	}
	
	//spring4.3 버전 미만일 떄는 아래와 같이 요청방식을 제한할 수 있다.
	//post방식만 지원
	@RequestMapping(method=RequestMethod.POST,value="methodTest1.do")
	public String methodTest1() {
		System.out.println("POST방식만 가능");
		return "result4";
	}
	//spring 4.3 버전 이상일때는 아래와 같이 더 간단하게 요청방식을 제한할 수 있다.
	@PostMapping("methodTest2.do")
	public String methodTest2() {
		System.out.println("POST방식만 가능");
		return "result4";
	}
	
	//@GetMapping("paramTest4.do")
	@PostMapping("paramTest4.do")
	//HandlerAdapter 가 아래의 매개변수에 맞게 폼데이터를 객체로 생성해서 전달한다
	public String paramTest4(CustomerDTO customerDTO) { //CustomerDTO 객체는 view에서 소문자로 시작하는 클래스명으로 공유되어 사용가능
		System.out.println(customerDTO);
		return "result4";
	}
	
	
	//redirect 는 viewResolver를 거치지 않음
	@PostMapping("redirectTest.do")
	public String redirectTest(CustomerDTO customerDTO) {
		System.out.println(customerDTO);
		//아래 방식은 클라이언트(브라우저)가 직접 jsp에 접근할 수 없도록 환경(WEB-INF)를 정의했으므르로 error
		//이유는 FrontController Pattern : 모든 클라이언트의 요청은 DispatcherServlet을 통하도록 해야하므로  
		// return "redirect:result5.jsp"; //이건 오류 redirect는 ViewResolver를 거치지 않아 WEB-INF/views/아래로 갈수 없음
		return "redirect:testResult.do?customerId=" + customerDTO.getId(); //springmvc 에서 redirect 방식으로 응답할 때는 서두에 redirect: 을 명시
	}
	
	@RequestMapping("testResult.do")
	public String testResult(String customerId) {
		System.out.println(customerId);
		return "result5";
	}
	
	@PostMapping("hasA-Test.do")
	public String testHasA(UserDTO userDTO) {
		System.out.println(userDTO + " db insert");
		return "result5";
	}
	
	@PostMapping("login.do")
	public String login(String id,String password,HttpSession session) {
		System.out.println(id + " " + password + " 로그인 ");
		session.setAttribute("cvo", new CustomerDTO(id,"아이유","분당"));
		return "result6";
	}
}









