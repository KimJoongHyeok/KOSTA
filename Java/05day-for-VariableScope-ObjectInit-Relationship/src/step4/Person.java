package step4;

public class Person {
	
	private String name; // 인스턴스 변수, 클래스 차원에서 선언되었기때문
	private String email; // 선언만 해도 기본 초기화, 참조형은 null로 초기화
	
	//parameter(매개변수) 의 name 은 local변수
	public Person(String name) {
		this.name = name;
	}
	public void eat() {
		//count 는 로컬변수
		int count = 3;
		System.out.println(count + "인분 먹다.");
		if(count > 0) {
			int lv = 1;
			System.out.println(lv);
		}
		//local variable 은 선언된 영역내에서만 사용가능
	}
	public void eat2() {
		//int count; //지역변수 local variable 을 선언만 한다
		//System.out.println(count); compile error
		int count2 = 0;
		System.out.println(count2);
	}
	public void testInit() {
		//인스턴스 변수 초기화를 확인
		System.out.println("name : " + name);
		System.out.println("email : " + email);
	}
}
