package org.kosta.myproject.config.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class HandlerInterceptorConfigure implements WebMvcConfigurer{	
	private LoginCheckInterceptor interceptor;
	@Autowired
	public HandlerInterceptorConfigure(LoginCheckInterceptor interceptor) {
		super();
		this.interceptor = interceptor;
	}	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
		.addInterceptor(interceptor)
		.addPathPatterns("/**") // 모든 요청에 대해 LoginCheckInterceptor를 통해 로그인 여부를 확인하되 
		.excludePathPatterns("/","/home","/css/**","/login","/list"); // 이 요청 경로들은 제외한다 
	}
}



