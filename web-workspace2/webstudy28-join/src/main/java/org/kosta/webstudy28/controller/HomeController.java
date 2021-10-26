package org.kosta.webstudy28.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy28.model.EmployeeDAO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		int result = EmployeeDAO.getInstance().getTotalCount();
		request.setAttribute("empTotalCount", result);
		return "home.jsp";
	}

}
