package org.kosta.webstudy23.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy23.model.ProductDAO;
import org.kosta.webstudy23.model.ProductVO;

public class FindProductByIdController implements Controller {


	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String productId = request.getParameter("productId");
		ProductVO vo = ProductDAO.getInstance().findProductId(productId);
		String path = "";
		if(vo!=null) {
			request.setAttribute("productInfo", vo);
			path = "findbyid-ok.jsp";
		}else {
			path = "findbyid-fail.jsp";
		}
		return path;
	}

}
