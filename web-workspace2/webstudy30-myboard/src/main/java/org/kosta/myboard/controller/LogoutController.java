package org.kosta.myboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false); //false를 하고 session 이 없으면 null을 반환, false를 안하고 session 이 없으면 새로 생성
		if(session!=null)
			session.invalidate();
		return "ListController.do";
	}
}
