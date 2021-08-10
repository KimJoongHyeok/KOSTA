package step1;

public class TestStatic2 {
	//instance variable -> 객체생성할때 메모리에 할당됨
	String name = "아이유";
	//static variable : static 멤버 사용은 신중하게 해야 한다. -> class loading 시점에 한번 메모리에 적재 , 계속 유지가 되므로
	static String name2 = "박보검";
	//object member method
	public void test1() {
		System.out.println("object member method test1" + name);
	}
	//static member method
	public static void test2() {
		//test1(); //compile error : static -> non-static 으로 바로 접근 불가
		//아래와 같이 객체 생성해야 한다.
		new TestStatic2().test1();
	}
	public void test3() {
		test2(); //object 의 member method test3() 은ㅅ 실행을 위해서는 객체 생성을 전제로 하므로 static member에 바로 접근 가능
		//test3()이 실행된다는 것은 class loading -> 객체 생성 을 전제로 하니깐 static은 미리 class loading 시점에 적재되므로 
		//non - static 에서 static 으로 바로 접근 가능
	}
	public static void main(String[] args) {
		System.out.println("main method 는 static method 이다");
		// TODO Auto-generated method stub
		//아래가 오류나는 이유는 main 은 static 이기 때문
		//complie error : name 은 instance variable 이므로 객체 생성시에만 메모리에 적재
		//static 에서 non-static으로 바로 접근은 불가
		//System.out.println(name);
		
		//같은 클래스 내에서라도 인스턴스 멤버들은 객체를 생성해서 접근해야 한다.
		TestStatic2 t = new TestStatic2();
		System.out.println(t.name);
		t.test1(); //전재조건이 객체가 생성되야 메서드가 실행될수 있기에 메서드에서 name을 호출하는게 가능한것
		System.out.println(name2);
	}

}
