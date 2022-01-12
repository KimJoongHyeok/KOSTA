package org.kosta.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="jpa_department_seq_generator",sequenceName = "jpa_department_seq",initialValue = 1,allocationSize = 1)
@Table(name="jpa_department")
public class Department {
	@Id // 기본키 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "jpa_department_seq_generator")
	@Column(name = "department_id") // db 컬럼명 매핑 
    private int departmentId;
	private String dname;
	private String location;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int departmentId) {
		super();
		this.departmentId = departmentId;
	}

	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	}

	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", dname=" + dname + ", location=" + location + "]";
	}

	
}
