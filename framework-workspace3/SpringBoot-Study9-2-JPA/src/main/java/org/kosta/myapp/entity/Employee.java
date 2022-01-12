package org.kosta.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity // jpa가 관리하는 클래스
//오라클 시퀀스 설정 
@SequenceGenerator(name="jpa_employee_seq_generator",sequenceName = "jpa_employee_seq",initialValue = 1,allocationSize = 1)
@Table(name="jpa_employee") // 테이블명 employee 
public class Employee {
	@Id // 기본키 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "jpa_employee_seq_generator")
	@Column(name = "id") // db 컬럼명 매핑 
    private int id;

    @Column(name = "ename")
    private String ename;

    @ManyToOne(optional = false) // 다 대 일 관계 ( false 는 inner join , true 는 left outer join ) 
    @JoinColumn(name = "department_id") // 외래키
    private  Department department;

     
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String ename, Department department) {
		super();
		this.ename = ename;
		this.department = department;
	}

	public Employee(int id, String ename, Department department) {
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", department=" + department + "]";
	}

	
    
}
