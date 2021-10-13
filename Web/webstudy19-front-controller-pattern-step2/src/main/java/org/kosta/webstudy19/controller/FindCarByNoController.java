package org.kosta.webstudy19.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy19.model.MockDAO;

//실제 컨트롤러 로직을 수행하는 개별 컨트롤러 객체
public class FindCarByNoController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 차량정보로 차정보검색
		String carNo = request.getParameter("carNo");
		String carInfo = MockDAO.getinstance().findCarInfo(carNo);
		String path = null;
		if (carInfo != null) {
			request.setAttribute("carInfo", carInfo);
			path = "findcar-ok.jsp";
		} else {
			path = "findcar-fail.jsp";
		}
		return path;
	}

}
