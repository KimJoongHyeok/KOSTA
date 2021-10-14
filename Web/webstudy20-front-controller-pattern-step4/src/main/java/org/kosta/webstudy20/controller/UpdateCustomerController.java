package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class UpdateCustomerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * client로부터 수정할 고객정보를 받아온다
		 * MockDAO 의 updateCustomer() 를 호출해 db에 업데이트 시킨다
		 * 리다이렉트 방식으로 update-result.jsp로 보낸다
		 */
		MockDAO.getInstance().updateCustomer(request.getParameter("customerInfo"));
		return "redirect:update-result.jsp";
	}

}
