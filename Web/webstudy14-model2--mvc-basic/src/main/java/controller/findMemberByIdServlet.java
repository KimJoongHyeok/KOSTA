package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class findMemberByIdServlet
 */
@WebServlet("/findMemberByIdServlet")
public class findMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			MemberDAO dao = new MemberDAO();
			MemberVO vo = dao.findMmeberById(request.getParameter("memberId"));
			String path = null;
			if(vo==null) {
				path = "findMemberById.jsp";
				request.getRequestDispatcher("findMemberById-fail.jsp").forward(request, response);
			}else {
				path = "findMemberById-ok.jsp";
				request.setAttribute("memberId", vo.getId());
				request.setAttribute("memberName", vo.getName());
				request.setAttribute("memberAddress", vo.getAddress());
				//아니면 request.setAttribute("memberVO",vo);
				request.getRequestDispatcher("findMemberById-ok.jsp").forward(request, response);
			}	
			//request.getRequestDispatcher(path).forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
