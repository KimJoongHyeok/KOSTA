package org.kosta.myproject.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.kosta.myproject.model.service.BoardService;
import org.kosta.myproject.model.vo.MemberVO;
import org.kosta.myproject.model.vo.PostVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BoardController {
	@Resource
	private BoardService boardService;
	@RequestMapping("list")
	public ModelAndView list(String pageNo) {
		return new ModelAndView("board/list","lvo",boardService.getPostList(pageNo));
	}
	@RequestMapping("writeForm")
	public String writeForm() {
		return "board/write";
	}
	@PostMapping("write")
	public String write(PostVO postVO,HttpSession session,RedirectAttributes ra) {		
		MemberVO mvo=(MemberVO) session.getAttribute("mvo");
		postVO.setMemberVO(mvo);//작성자 아이디가 필요하므로 
		boardService.write(postVO);
		ra.addAttribute("no",postVO.getNo());
		return "redirect:home";
	}
	
	/**
	 * 상세 글보기 
	 * 1. 상세 글보기 시에는 조회수가 증가되어야 한다 
	 * 2. 만약 조회한 글일 경우에는 조회수가 증가되지 않도록 해야 한다 
	 * @return
	 */
	@RequestMapping("detailPost")
	public String postDetail(int no,HttpSession session,Model model) {		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> noList=(ArrayList<Integer>) session.getAttribute("noList");//MemberController의 login메서드를 확인 
		if(noList.contains(no)==false) { // noList에 존재하지 않는 글이면 조회수 증가
			boardService.updateHits(no);
			noList.add(no);// 읽은 글번호를 noList에 추가한다 
		}			
		model.addAttribute("post",boardService.findDetailPostByNo(no));
		return "board/detail-post";
	}
	@PostMapping("deletePost")
	public String deletePost(int no) {		
		boardService.deletePost(no);
		return "redirect:home";
	}	
	@PostMapping("updateView")
	public String updateView(int no,Model model) {
		model.addAttribute("post", boardService.findDetailPostByNo(no));
		return "board/update";
	}
	@PostMapping("updatePost")
	public String updatePost(PostVO pvo) {		
		boardService.updatePost(pvo);
		return "redirect:home";
	}
}


















