package org.kosta.myapp.controller;

import java.util.Arrays;
import java.util.List;

import org.kosta.myapp.dto.EmployeeDTO;
import org.kosta.myapp.entity.Employee;
import org.kosta.myapp.service.EmployeeNotFoundException;
import org.kosta.myapp.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings({ "unchecked", "rawtypes" })
@RestController // @Controller + @ResponseBody
public class EmployeeController {
	private EmployeeService employeeService;
	/* 
	   ModelMapper : DTO <-> Entity 변환을 위한 컴포넌트 
	   org.kosta.myapp.SpringbootJpa3Application 에서 @Bean 으로 생성한 ModelMapper bean을 주입받는다 
	*/
	private ModelMapper modelMapper;
	@Autowired
	public EmployeeController(EmployeeService employeeService, ModelMapper modelMapper) {
		super();
		this.employeeService = employeeService;
		this.modelMapper = modelMapper;
	}
	@GetMapping("/employee")
	public List<EmployeeDTO> getAllEmployeeList() {		 
		List<Employee> entityList=employeeService.findAllEmployeeList();
		// Entity List를 DTO List로 변환 ( 관련 설명은 src/test/java/SpringbootJpa3TestModelMap에 있음 )
		List<EmployeeDTO> dtoList = Arrays.asList(modelMapper.map(entityList, EmployeeDTO[].class));
		return dtoList;
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity findEmployeeById(@PathVariable("id") int id) {
		ResponseEntity responseEntity=null;
		try {
			Employee employeeEntity=employeeService.findEmployeeById(id);
			//Entity를 DTO로 변환 ( 관련 설명은 src/test/java/SpringbootJpa3TestModelMap에 있음 )
			EmployeeDTO employeeDTO=modelMapper.map(employeeEntity, EmployeeDTO.class);
			responseEntity=new ResponseEntity(employeeDTO,HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			responseEntity=new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}		
		return responseEntity;
	}
}
