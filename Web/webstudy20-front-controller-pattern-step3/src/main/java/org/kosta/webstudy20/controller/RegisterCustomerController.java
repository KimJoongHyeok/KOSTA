package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class RegisterCustomerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MockDAO.getInstance().registerCustomer(request.getParameter("customerInfo"));
		
		return "redirect:register-result.jsp";
	}

}
