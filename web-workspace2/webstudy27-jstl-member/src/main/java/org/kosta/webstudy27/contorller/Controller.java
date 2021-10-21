package org.kosta.webstudy27.contorller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String execute(HttpServletResponse response,HttpServletRequest request) throws Exception;
}
