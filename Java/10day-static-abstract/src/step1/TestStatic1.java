package step1;
/*
 * static member는 별도의 객체 생성이 필요없이 클래스 로드만으로 사용가능
 * -> static member에 접근할 떄는 클래스명.멤버(메서드,변수)
 * */
class Person{
	int money1; //instance variable : heap 영역에 저장
	static int money2; //static variable : meta space 영역에 저장 -> Class loading 시점에 메모리에 적재
	public void test1() {
		System.out.println("object member method");
	}
	public static void test2() {
		System.out.println("static member method");
	}
}
public class TestStatic1 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.money1); //money1은 instance variable 이므로 위 라인과 같이 객체 생성이 필요
		p.test1(); //객체의 멤버 메서드이므로 참조변수.메서드로 호출한다.
		//static member 는 별도의 객체생성없이 클래스명으로 접근가능
		System.out.println(Person.money2);
		Person.test2();
	}

}


