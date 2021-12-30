package org.kosta.myproject.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.kosta.myproject.model.service.MemberService;
import org.kosta.myproject.model.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {	
	private MemberService memberService;
	@Autowired
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	@PostMapping("login")
	public String login(MemberVO vo,HttpSession session) {
		MemberVO mvo=memberService.login(vo);
		if(mvo!=null) {
			session.setAttribute("mvo", mvo);
			//조회수 증가 방지를 위해 세션에 noList를 추가한다 
			session.setAttribute("noList", new ArrayList<Integer>());			
			return "redirect:/home";
		}else {
			return "member/login-fail";
		} 
		
	}
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:home";
	}
}





























