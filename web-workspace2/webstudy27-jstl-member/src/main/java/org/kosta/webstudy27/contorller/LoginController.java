package org.kosta.webstudy27.contorller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy27.model.MemberDAO;
import org.kosta.webstudy27.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberVO vo = MemberDAO.getInstance().login(id,password);
		String path = "";
		if(vo!=null) { //로그인된거
			request.getSession().setAttribute("mvo", vo);
			path = "index.jsp";
		}else {
			path = "login-fail.jsp";
		}
		return path;
	}
}
