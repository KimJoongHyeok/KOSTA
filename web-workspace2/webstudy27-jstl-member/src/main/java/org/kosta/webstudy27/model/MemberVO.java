package org.kosta.webstudy27.model;

public class MemberVO {
	private String id;
	private String name;
	private String address;
	private String birth;
	private String regdate;
	public MemberVO() {
		super();
	}
	
	public MemberVO(String id, String name, String birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public MemberVO(String id, String name, String address, String birth, String regdate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birth = birth;
		this.regdate = regdate;
	}
	
	public MemberVO(String id, String name, String address, String birth) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birth = birth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	
	
}
