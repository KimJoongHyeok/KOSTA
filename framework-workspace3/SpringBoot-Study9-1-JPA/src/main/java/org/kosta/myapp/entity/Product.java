package org.kosta.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity // jpa가 관리하는 클래스
//오라클 시퀀스 설정 
@SequenceGenerator(name="jpa_product_seq_generator",sequenceName = "jpa_product_seq",initialValue = 1,allocationSize = 1)
@Table(name="jpa_product") // 테이블명 product 
public class Product {
	@Id // 기본키 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "jpa_product_seq_generator")
	@Column(name = "ID") // db 컬럼명 매핑 
    private int id;
	private String name;
	private String maker;
	private int price;
	public Product() {
		super();
	}
	
	public Product(String name, String maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	public Product(int id, String name, String maker, int price) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	
	
	
}
