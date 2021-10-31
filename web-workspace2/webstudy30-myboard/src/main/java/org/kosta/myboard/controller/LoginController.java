package org.kosta.myboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.myboard.model.MemberDAO;
import org.kosta.myboard.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().login(id, password);
		String path = "";
		if(vo == null) {
			path = "redirect:login-fail.jsp";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("mvo", vo);
			path = "redirect:ListController.do";
		}
		return path;
	}

}
