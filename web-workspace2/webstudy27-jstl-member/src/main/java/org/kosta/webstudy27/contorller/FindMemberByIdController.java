package org.kosta.webstudy27.contorller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy27.model.MemberDAO;
import org.kosta.webstudy27.model.MemberVO;

public class FindMemberByIdController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String id = request.getParameter("id");
		MemberVO vo = MemberDAO.getInstance().findMemberById(id);
		String path = "";
		if(vo!=null) {
			path = "find-result-ok.jsp";
			request.setAttribute("memberInfo",vo);
		}else {
			path = "find-result-fail.jsp";
		}
		return path;
	}

}
