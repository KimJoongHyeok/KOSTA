package step4.method1;

public class TestMethod1 {
	//메인 메서드 : 프로그램 시작 지점
	public static void main(String[] args) {
		Person p  = new Person();
//		p.eat1();
//		p.eat2("치킨");
//		p.eat2("카스");
		p.eat3();
		String result = p.eat3();
		System.out.println("main : " + result);
		
		System.out.println("main : " + p.eat3());
	}

}
