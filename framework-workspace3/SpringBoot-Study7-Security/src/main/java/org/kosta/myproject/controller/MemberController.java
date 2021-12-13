package org.kosta.myproject.controller;

import javax.annotation.Resource;

import org.kosta.myproject.model.domain.MemberDTO;
import org.kosta.myproject.model.service.MemberService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	@Resource
	private MemberService memberService;
	//비인증 상태에서도 접근 가능하도록 /guest/ 이하로 url 등록 
	//org.kosta.myproject.config.security.WebSecurityConfig 설정되어 있음 
	@RequestMapping("guest/findMemberById")
	public String findMemberById(String id,Model model) {		
		MemberDTO dto = memberService.findMemberById(id);
		if (dto == null)
			return "member/findMemberById_fail";
		else {
			model.addAttribute("memberDTO",dto);
			return "member/findMemberById_success.tiles" ;
		}
	}
	//WebSecurityConfig에 등록되어 있음 ( failureUrl("/login_fail") )
	@RequestMapping("login_fail")
	public String loginFail() {
		return "member/login_fail";
	}
    //spring security에서 로그인 , 로그아웃 처리를 하므로 아래의 login , logout 관련 메서드는 필요없다  
	
	@RequestMapping("enterCafe")
	public String enterCafe() {
		//System.out.println("enterCafe");
		//return new ModelAndView("member/ajax-cafe.tiles", "count", memberService.getMemberCount());
		return "member/ajax-cafe.tiles";
	}
	
	@RequestMapping("guest/idcheckAjax")
	@ResponseBody
	public String idcheckAjax(String id) {
		return memberService.idcheck(id);
	}
	@GetMapping("getMemberTotalCount")	
	@ResponseBody
	public int getMemberTotalCount() {
		return memberService.getMemberCount();
	}
	@PostMapping("postAjaxTest")
	@ResponseBody
	public String postAjaxTest(String message) {
		System.out.println("post ajax 는 csrf token 이 필요합니다 "+message);
		return message+" ajax 요청에 대한 응답입니다";
	}	
	
	@RequestMapping("updateForm")
	public String updateForm() {
		return "member/updateForm.tiles";
	}

	@PostMapping("updateMemberAction")
	//첫번째 매개변수 Authentication : Spring Security 인증 정보 , 두번째 매개변수 memberDTO : 수정폼에서 전달받는 데이터 
	public String updateMemberAction(Authentication authentication, MemberDTO memberDTO) {
		MemberDTO dto = (MemberDTO)authentication.getPrincipal();			
		memberService.updateMember(memberDTO);//service에서 변경될 비밀번호를 암호화한다 
		// 수정한 회원정보로 Spring Security 회원정보를 업데이트한다
		dto.setPassword(memberDTO.getPassword());
		dto.setName(memberDTO.getName());
		dto.setAddress(memberDTO.getAddress());	
		return "member/update_result.tiles";
	}
	@RequestMapping("guest/registerForm")
	public String registerForm() {
		return "member/registerForm.tiles";
	}
	@PostMapping("guest/registerMember")
	public String register(MemberDTO memberDTO) {
		memberService.registerMember(memberDTO);//등록시 service에서 비밀번호를 암호화 한다 
		return "redirect:/guest/registerResultView?id=" + memberDTO.getId();
	}

	@RequestMapping("guest/registerResultView")
	public ModelAndView registerResultView(String id) {
		MemberDTO memberDTO = memberService.findMemberById(id);
		return new ModelAndView("member/register_result.tiles", "memberDTO", memberDTO);
	}


	
}
