package org.kosta.springmvc02.controller;

import org.kosta.springmvc02.model.dto.CustomerDTO;
import org.kosta.springmvc02.model.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	private CustomerMapper customerMapper;
	
	@Autowired
	public CustomerController(CustomerMapper cutomerMapper) {
		super();
		this.customerMapper = cutomerMapper;
	}


	@RequestMapping("getTotalCustomerCount.do")
	public String getTotalCustomerCount(Model model) {
		int totalCount = customerMapper.getTotalCustomerCount();
		model.addAttribute("totalCount",totalCount);
		return "customer-count";
	}
	
	@RequestMapping("findCustomerById.do")
	public String findCustomerById(String id,Model model) {
		CustomerDTO customerDTO = customerMapper.findCustomerById(id);
		if(customerDTO!=null) {
			model.addAttribute("customerDTO",customerDTO);
			return "findbyid-success";
		}else {
			return "findbyid-fail";
		}
	}
	
	@PostMapping("registerCustomer.do")
	public String registerCustomer(CustomerDTO customerDTO) {
		if(customerMapper.findCustomerById(customerDTO.getId()) != null) {
			return "duplicate-id";
		}
		else {
			customerMapper.registerCustomer(customerDTO);
			return "redirect:registerSuccess.do";
		}
	}
	
	@RequestMapping("registerSuccess.do")
	public String registerSuccess() {
		
		return "register-success";
	}
}










