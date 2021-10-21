package org.kosta.webstudy27.contorller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy27.model.MemberDAO;
import org.kosta.webstudy27.model.MemberVO;

public class FindAddressController implements Controller {

	@Override
	public String execute(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String address = request.getParameter("address");
		ArrayList<MemberVO>list = MemberDAO.getInstance().findAddress(address);
		request.setAttribute("addressList", list);
		return "find-address-result.jsp";
	}
}
