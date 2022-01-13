package org.kosta.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudCatalogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCatalogsApplication.class, args);
	}
	/**
	 * Spring  RestTemplate class ->   REST API Server와 통신할 수 있도록 지원하는 클래스 , 
	 *  HTTP  GET, POST, DELETE, PUT 방식에 대한 메서드를 제공 
	    스프링에서 제공하는 여러 템틀릿 클래스
	    (ex- SqlSessionTemplate,JDBCTempleate)와 동일한 원칙으로 설계되어 
	    REST 서비스 연동작업을 용이하게 한다  
	 * @return
	 */
	@Bean
	 public RestTemplate restTemplate() {
	 return new RestTemplate();
	 }
}
