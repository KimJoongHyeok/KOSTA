package org.kosta.webstudy19.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy19.model.MockDAO;

public class FindCarListMakerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String maker = request.getParameter("maker");
		ArrayList<String> list = MockDAO.getinstance().findCarListByMaker(maker);
		request.setAttribute("carList", list);
		return "findcarlist-result.jsp";
	}

}
