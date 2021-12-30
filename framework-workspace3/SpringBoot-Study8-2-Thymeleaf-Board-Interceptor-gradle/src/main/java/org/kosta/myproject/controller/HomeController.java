package org.kosta.myproject.controller;

import org.kosta.myproject.model.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private BoardService boardService;
	@Autowired
	public HomeController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@RequestMapping(value={"home","/"})
	public String home(Model model) {
		model.addAttribute("lvo", boardService.getPostList());
		return "board/list";
	}
}














