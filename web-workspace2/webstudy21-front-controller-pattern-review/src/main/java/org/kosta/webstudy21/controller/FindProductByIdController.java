package org.kosta.webstudy21.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy21.model.MockDAO;

public class FindProductByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String productInfo = MockDAO.getInstance().findProductById(request.getParameter("productId"));
		String path = null;
		if(productInfo != null) {
			path = "find-ok.jsp";
			request.setAttribute("productInfo", productInfo);
		}else{
			path = "find-fail.jsp";
		}
		return path;
	}

}
