package org.kosta.myproject.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
/*
 * 인증 관련 예외 발생 처리를 위한 클래스 
 */
public class AjaxAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
     public AjaxAuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        String ajaxHeader = ((HttpServletRequest) request).getHeader("X-Requested-With");
        boolean isAjax = "XMLHttpRequest".equals(ajaxHeader);
        //Ajax 요청이면 
        if (isAjax) {
        		System.out.println("ajax 인증처리가 필요");
        		// 인증이 필요한 서비스에 비인증상태에서 ajax 요청하면 Http status 401 error를 전달 
              response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Ajax Request UnAuthorized (Session Expired)");
        } else { // ajax 요청이 아니면        	
        	//생성자에서 할당된 loginForm url 로 redirect 이동된다 
            super.commence(request, response, authException);
        }
    }
}