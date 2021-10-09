package org.kosta.webstudy18.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.webstudy18.model.MemberDAO;
import org.kosta.webstudy18.model.MemberVO;

/**
 * Servlet implementation class UpdateMemberServelt
 */
@WebServlet("/UpdateMemberServlet")
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("mvo")==null) { //로그인상태가 아니면
			response.sendRedirect("index.jsp");//index로 보냄
			return; //return keyword는 메서드 실행을 중단
		}
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		try {
			MemberVO vo = new MemberVO(id,password,name,address);
			MemberDAO.getInstance().updateMember(vo);
			session.setAttribute("mvo", vo);
			response.sendRedirect("update-result.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
