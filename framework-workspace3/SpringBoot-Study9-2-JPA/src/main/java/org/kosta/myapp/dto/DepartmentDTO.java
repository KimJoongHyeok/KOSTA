package org.kosta.myapp.dto;

public class DepartmentDTO {
	private int departmentId;
	private String dname;
	private String location;
	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentDTO(int departmentId, String dname, String location) {
		super();
		this.departmentId = departmentId;
		this.dname = dname;
		this.location = location;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [departmentId=" + departmentId + ", dname=" + dname + ", location=" + location + "]";
	}
	
}
