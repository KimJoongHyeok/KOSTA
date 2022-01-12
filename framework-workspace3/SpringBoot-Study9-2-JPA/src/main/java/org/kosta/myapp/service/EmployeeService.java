package org.kosta.myapp.service;

import java.util.List;

import org.kosta.myapp.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAllEmployeeList();
	public Employee findEmployeeById(int id) throws EmployeeNotFoundException;
}
