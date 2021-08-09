package step3;
//Object casting 을 사용하는 예제
class Animal{
	public void eat() {
		System.out.println("먹다.");
	}
	public void sleep() {
		System.out.println("자다");
	}
}
class Person extends Animal{
	@Override
	public void eat() {
		System.out.println("사람이 수저로 먹다.");
	}
	//자식의 독자적 멤버(메서드)
	public void study() {
		System.out.println("사람이 공부하다.");
	}
}


public class TestPolymorphism4 {

	public static void main(String[] args) {
		// 다형성 : 부모타입의 변수로 자식 객체를 참조시켜 본다.
		Animal a = new Person();
		a.sleep(); //상속받은 멤버 ,  접근가능
		a.eat(); //오버라이딩한 메서드, 접근가능
		//자식의 독자적 멤버(메서드)에 p 변수로 접근해본다. 이 경우 compile 에러
		//이 경우 a 참조변수의 타입은 Animal 이기 때문
		//아래와 같이 Object down casting을 하면 자식의 독자적 멤버에 접근할 수 있다.
		//((Person) a).study();
		//위 코드를 풀어쓰면 아래와 같이 쓸 수도 있다.
		Person p = (Person)a;
		p.study();
		
	}

}
