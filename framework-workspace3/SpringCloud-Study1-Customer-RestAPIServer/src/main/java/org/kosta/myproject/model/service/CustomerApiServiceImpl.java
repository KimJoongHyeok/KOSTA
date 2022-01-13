package org.kosta.myproject.model.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;
@Service
public class CustomerApiServiceImpl implements CustomerApiService {
	@Override
	public String findCustomerById(String customerId) {
		System.out.println("Customer API 서버에서 Catalog  서버로 "+customerId+"아이디 고객정보를 조회해서 응답");
		return customerId+"번 고객 상세정보 "+ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	}		
}
