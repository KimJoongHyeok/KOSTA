package org.kosta.webstudy16.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy16.model.ProductDAO;
import org.kosta.webstudy16.model.ProductVO;

/**
 * Servlet implementation class RegisterProductServlet
 */
@WebServlet("/RegisterProductServlet")
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String maker = request.getParameter("maker");
		int price = Integer.parseInt(request.getParameter("price"));
		ProductVO vo = new ProductVO(name,maker,price);
		try {
			//ProductDAO 는 Singleton Dssign Pattern 적용되어 있으므로 new 생성자로 객체 생성하는 것이 아니라
			// static 메서드로 객체의 주소값을 리턴받아 register메서드를 실행한다
			ProductDAO.getInstance().register(vo);
			//forward 이동방식은 결과화면에서 사용자가 새로고침을 할 경우 재등록 되므로
			//redirect 이동방식으로 응답시 클라이언트에게 지정한 url로 이동하도록 처리한다.
			response.sendRedirect("register-result.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
