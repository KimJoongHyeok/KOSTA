package org.kosta.myproject.model.dto;

public class MemberDTO {
	private String id;
	private String password;
	private String name;
	private String address;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + "]";
	}
	// thymeleaf 에서 접근 테스트를 하기 위한 메서드 
	public boolean isExist() {
		System.out.println("isExist");
		return false;
	}
	public String register() {
		System.out.println("register");
		return "등록완료";
	}
}
