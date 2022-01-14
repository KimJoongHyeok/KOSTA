package org.kosta.myproject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CustomerApiServiceImpl implements CustomerApiService {
	@Autowired
	 private RestTemplate restTemplate;
	
	@Override
	@HystrixCommand(fallbackMethod = "findCustomerByIdFallback") //fallback : 장애를 대비하는 메서드 
	public String findCustomerById(String customerId) {
		System.out.println("Catalog 서버(Client)에서 Customer API 서버(Server)로 "+customerId+"아이디 고객정보를 요청");
		return restTemplate.getForObject("http://localhost:7778/customers/"+customerId, String.class);
	}
	/*
	 * fallbackMethod: 장애시 대안흐름을 수행하도록 한다 
	 */
	public String findCustomerByIdFallback(String customerId,Throwable ex) {
		//콘솔에 에러 메세지를 출력해본다 
		System.out.println("Customer API 서버(Server) 통신에 문제 발생 "+ex.getMessage());
		//클라이언트에게 예외 상황을 메세징한다 
		return "고객정보 조회 서비스가 지연되고 있습니다 잠시후에 다시 접속해주세요";
	}		
}
