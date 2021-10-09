package org.kosta.webstudy18.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy18.model.MemberDAO;

/**
 * Servlet implementation class IdCheckServlet
 */
@WebServlet("/IdCheckServlet")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//true 면 아이디 있는거 false 면 아이디 없는거
		String path = "";
		try {
			boolean flag = MemberDAO.getInstance().idCheck(request.getParameter("memberId"));
			if(flag == true) {
				path = "id-check-fail.jsp";
			}else {
				path = "id-check-ok.jsp";
			}
			request.getRequestDispatcher(path).forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
