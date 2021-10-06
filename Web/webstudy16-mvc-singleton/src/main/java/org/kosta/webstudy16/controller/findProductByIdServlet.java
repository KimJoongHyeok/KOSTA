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
 * Servlet implementation class findProductByIdServlet
 */
@WebServlet("/findProductByIdServlet")
public class findProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productId = request.getParameter("productId");
		String path = "";
		ProductVO vo = null;

		try {
			vo = ProductDAO.getInstance().findProductById(productId);
			if (vo == null) {
				path = "find-fail.jsp";
			} else {
				path = "find-ok.jsp";
			}
			request.setAttribute("productId", vo);
			request.getRequestDispatcher(path).forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
