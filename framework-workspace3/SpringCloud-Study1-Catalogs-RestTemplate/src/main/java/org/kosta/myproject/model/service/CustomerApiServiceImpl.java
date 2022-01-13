package org.kosta.myproject.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class CustomerApiServiceImpl implements CustomerApiService {
	@Autowired
	 private RestTemplate restTemplate;
	/**
	 * Spring  RestTemplate class ->   REST API Server와 통신할 수 있도록 지원하는 클래스 ,  
	 * HTTP  GET, POST, DELETE, PUT 방식에 대한 메서드를 제공 
       스프링에서 제공하는 여러 템틀릿 클래스(ex- SqlSessionTemplate,JDBCTempleate)와
        동일한 원칙으로 설계되어 REST 서비스 연동작업을 용이하게 한다  
	 */
	@Override
	public String findCustomerById(String customerId) {
		System.out.println("Catalog 서버(Client)에서 Customer API 서버(Server)로 "+customerId+"아이디 고객정보를 요청");
		return restTemplate.getForObject("http://localhost:7778/customers/"+customerId, String.class);
	}		
}
