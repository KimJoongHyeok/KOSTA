package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	/**
	 * return 하는 String 은 클라이언트에게 응답하기 위한 view path 정보
	 * forward 방식이때는 return "findbyid-ok.jsp"와 같이 view path정보를 반환
	 * redirect 방식일대는 return redirect:register-result.jsp 와 같이 redirect: 을 서두에 추가하여 반환
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String execute(HttpServletRequest request,HttpServletResponse response) throws Exception; 
}
