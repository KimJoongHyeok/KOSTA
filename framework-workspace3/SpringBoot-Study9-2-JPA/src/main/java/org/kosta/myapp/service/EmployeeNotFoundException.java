package org.kosta.myapp.service;

public class EmployeeNotFoundException extends Exception {
	private static final long serialVersionUID = 7457178749471615413L;
	public EmployeeNotFoundException() {}
	public EmployeeNotFoundException(String message) {
		super(message);
	}	
}
