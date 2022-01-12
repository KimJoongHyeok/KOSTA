package org.kosta.myapp.dto;

public class EmployeeDTO {
	private int id;
	private String ename;
	private  DepartmentDTO department;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(int id, String ename, DepartmentDTO department) {
		super();
		this.id = id;
		this.ename = ename;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public DepartmentDTO getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", ename=" + ename + ", department=" + department + "]";
	}
	
}
