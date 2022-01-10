package org.kosta.myapp.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // jpa가 관리하는 클래스 
@Table(name="JPA_MEMBER") // 테이블명 
public class Member {
	@Column(name = "ID") // db 컬럼명 매핑 
    @Id // Primary key  
	private String id;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String address;	
	public Member() {}
	public Member(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}	
	public String getId() {
		return id;
	}	
	public String getPassword() {
		return password;
	}	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + "]";
	}	
}
