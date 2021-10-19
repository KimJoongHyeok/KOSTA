package org.kosta.webstudy23.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy23.model.ProductDAO;
import org.kosta.webstudy23.model.ProductVO;

public class RegisterProductController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String maker = request.getParameter("maker");
		int price = Integer.parseInt(request.getParameter("price"));
		ProductVO vo = new ProductVO(name,maker,price);
		ProductDAO.getInstance().registerProduct(vo);
		//등록결과화면에서 alert으로 등록완료 메세지를 보여준 후 상품 리스트로 페이지로 이동되도록 처리해본다.
		//등록결과화면 대신 상품리스틀 제공하는 컨트롤러로  redirect 시킨다
		return "redirect:register-result.jsp";
		//return "redirect:AllProductListController.do";
	}

}
