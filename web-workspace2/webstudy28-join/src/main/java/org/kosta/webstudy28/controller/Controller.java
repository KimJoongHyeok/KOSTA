package org.kosta.webstudy28.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String execute(HttpServletResponse response,HttpServletRequest request) throws Exception;
}
