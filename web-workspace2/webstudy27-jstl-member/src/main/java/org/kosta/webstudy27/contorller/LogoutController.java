package org.kosta.webstudy27.contorller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession(false);
		if(session!=null)
			session.invalidate();
		return "redirect:index.jsp";
	}

}
