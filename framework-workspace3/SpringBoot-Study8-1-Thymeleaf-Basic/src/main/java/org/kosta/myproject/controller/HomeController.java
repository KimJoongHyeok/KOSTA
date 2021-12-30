package org.kosta.myproject.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.kosta.myproject.model.dto.MemberDTO;
import org.kosta.myproject.model.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {			
			model.addAttribute("imageName","thymeleaf.png");
			return "index";
	}
	@RequestMapping("/pathTest/pathStudy")
	public String pathTest() {			
			return "pathTest/test";
	}
	@RequestMapping("study1")
	public String study1(Model model) {
			model.addAttribute("memberDTO", new MemberDTO("java","a","아이유","종로"));
			return "step01-text-expression";
	}
	@RequestMapping("study2")
	public String study2(Model model) {
			model.addAttribute("member", new MemberDTO("java","a","아이유","종로"));
			return "step02-object-expression";
	}
	@RequestMapping("study3")
	public String study3(Model model) {
			model.addAttribute("pageNo",7);
			model.addAttribute("keyword", "spring");
			model.addAttribute("orderId", 3);			
			model.addAttribute("maker", "LG");			
			return "step03-link-querystring";
	}
	///board/list?pageNo=7&keyword=spring
	@RequestMapping("/board/list")
	public String study3Result1(int pageNo,String keyword) {
		return "step03-result1-parm";
	}
	@RequestMapping("/order/details")
	public String study3Result2(int orderId,String maker) {
		return "step03-result2-parm";
	}
	@RequestMapping("study4")
	public String study4(Model model,HttpSession session) {
			session.setAttribute("member", new MemberDTO("thymeleaf","a","강하늘","오리"));	
			return "step04-session-param";
	}
	@RequestMapping("study5")
	public String study5(Model model) {	
		model.addAttribute("product", new ProductDTO(1,"테라","하이트진로",1410,true));
		model.addAttribute("size", "L");//L,  M ,  S로  구성
		return "step05-if-unless-switch";
	}
	@RequestMapping("study6")
	public String study6(Model model) {
		ArrayList <MemberDTO> memberList=new ArrayList<MemberDTO>();
		memberList.add(new MemberDTO("java","a","아이유","종로"));
		memberList.add(new MemberDTO("thymeleaf","a","강하늘","오리"));
		model.addAttribute("memberList", memberList);		
		/////////////////////////////////////////////
		ArrayList<HashMap<String,String>> mapList=new ArrayList<HashMap<String,String>>();
		HashMap<String,String> map1=new HashMap<String, String>();
		map1.put("ID", "spring");
		map1.put("NAME", "황의조");
		mapList.add(map1);
		HashMap<String,String> map2=new HashMap<String, String>();
		map2.put("ID", "mybatis");
		map2.put("NAME", "손흥민");
		mapList.add(map2);
		model.addAttribute("mapList", mapList);
		return "step06-loop-each";
	}
	@RequestMapping("study7")
	public String study7(Model model,HttpSession session) {
		session.setAttribute("memberDTO", new MemberDTO("java","a","아이유","종로"));
		ArrayList<ProductDTO> productList=new ArrayList<ProductDTO>();
		productList.add(new ProductDTO(1,"테라","하이트진로",1410,true));
		productList.add(new ProductDTO(2,"카스","오비",1410,false));
		productList.add(new ProductDTO(3,"참이슬","하이트진로",1300,false));
		productList.add(new ProductDTO(4,"처음처럼","롯데",1500,true));		
		model.addAttribute("productList", productList);			
		return "step07-loop-each-ex";
	}
	@RequestMapping("study8")
	public String study8(Model model) {
			model.addAttribute("startPageNumber",5);
			model.addAttribute("endPageNumber",9);				
			return "step08-loop-each-start-end";
	}
	@RequestMapping("study9")
	public String study9(Model model) {
			model.addAttribute("checkIdResult","success");
		  return "step09-js";
	}
	@RequestMapping("study9-2")
	public String study9_2(Model model) {
			model.addAttribute("message","반가워요 Thymeleaf");
		  return "step09-js2";
	}
	@RequestMapping("study10")
	public String study10(Model model) {
			model.addAttribute("message","Hello thymeleaf-layout-dialect Main1");
		  return "step10-main1.html";
	}
	@RequestMapping("study10-2")
	public String study10_2(Model model) {
			model.addAttribute("message","Bye thymeleaf-layout-dialect Main2");
		  return "step10-main2.html";
	}
	@RequestMapping("study11")
	public String study11() {		
		  return "step11-ajax";
	}
	
}
