package org.kosta.myapp.service;

import java.util.List;
import java.util.Optional;

import org.kosta.myapp.entity.Employee;
import org.kosta.myapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAllEmployeeList() {
		return employeeRepository.findAllByOrderByIdDesc();
	}

	@Override
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent()==false)
			throw new EmployeeNotFoundException("사원이 존재하지 않습니다");		
		return employee.get();
	}
}
