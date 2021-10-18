package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class DeleteCustomerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MockDAO.getInstance().deleteCustomer(request.getParameter("customerId"));
		return "redirect:delete-result.jsp";
	}

}
