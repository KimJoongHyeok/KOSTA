package step2;

//Person class를 이용해 Person 객체(object)를 생성해 변수와 메서드를 테스트하는 목적을 가진 클래스

public class TestPerson {
	public static void main(String[] args) {
		
	//Person : 클래스 명이고 참조형 데이터 타입이다
	//p : 변수, 참조변수, 객체를 참조하기 위한 주고값을 저장하는 공간
	//new : 객체 생성을 위한 자바 키워드
	//Person() : 생성자 constructor
	
	Person p = new Person();
	System.out.println(p.name); // 객체의 속성(변수)에 접근해 값을 출력
	p.eat();
	p.name = "이강인";
	System.out.println(p.name);
	p.eat();
	}
}
