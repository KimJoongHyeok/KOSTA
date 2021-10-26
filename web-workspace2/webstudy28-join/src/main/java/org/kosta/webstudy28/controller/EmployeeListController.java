package org.kosta.webstudy28.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy28.model.EmployeeDAO;
import org.kosta.webstudy28.model.EmployeeVO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		ArrayList<EmployeeVO> list = EmployeeDAO.getInstance().getAllEmployeeList();
		request.setAttribute("list", list);
		return "list.jsp";
	}

}
