package org.kosta.myproject.model.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerApiService {
	public String findCustomerById(String customerId);
}
