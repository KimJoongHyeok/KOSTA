package org.kosta.myproject.controller;

import org.kosta.myproject.model.service.CustomerApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@Autowired
	private CustomerApiService customerApiService;
	
	@GetMapping("/customers/{customerId}")	
	public String findCustomerById(@PathVariable String customerId) {		
		return customerApiService.findCustomerById(customerId);		
	}
}
