package org.kosta.myboard.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.myboard.model.BoardDAO;
import org.kosta.myboard.model.PostVO;

public class ListController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		ArrayList<PostVO>list = BoardDAO.getInstance().getPostingList();
		request.setAttribute("postList", list);
		//template layout 페이지를 이용해 리스트 화면을 제공
		request.setAttribute("url", "board/list.jsp");	
		return "layout.jsp";
	}

}
