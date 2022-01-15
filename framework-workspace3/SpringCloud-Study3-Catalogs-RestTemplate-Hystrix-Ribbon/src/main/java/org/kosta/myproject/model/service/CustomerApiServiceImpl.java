package org.kosta.myproject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CustomerApiServiceImpl implements CustomerApiService {
	@Autowired
	 private RestTemplate restTemplate;
	/*
	 * 로드 밸런싱을 위한 Spring Cloud Ribbon 테스트를 위해 
	 * SpringBoot 설정파일 application.properties 에 접속할 RestAPI Server 를 설정한 후 
	 * # spring cloud ribbon 
     *  customer.ribbon.listOfServers=localhost:7778
	 * 
	 * 아래 restTemplate의 접속 url 을 변경한다 -> http://localhost:7778 을 customer로 변경한다 
	 * 
	 */
	@Override
	@HystrixCommand(fallbackMethod = "findCustomerByIdFallback") //fallback : 장애를 대비하는 메서드 
	public String findCustomerById(String customerId) {
		System.out.println("Catalog 서버(Client)에서 Customer API 서버(Server)로 "+customerId+"아이디 고객정보를 요청");
		return restTemplate.getForObject("http://customer/customers/"+customerId, String.class);
	}
	public String findCustomerByIdFallback(String customerId,Throwable ex) {
		//콘솔에 에러 메세지를 출력해본다 
		System.out.println("Customer API 서버(Server) 통신에 문제 발생 "+ex.getMessage());
		//클라이언트에게 예외 상황을 메세징한다 
		return "고객정보 조회 서비스가 지연되고 있습니다";
	}		
}
