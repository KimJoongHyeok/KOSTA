package step3;
class Animal{
	protected void eat() {
		System.out.println("먹다.");
	}
}
class Person extends Animal{
	//메서드 오버라이딩
	//오버라이딩할떄 접근제어자가 자식에서 좁아지면 안됨 but 부모가 protected 에서 자식이 public 은가능
	public void eat() {
		System.out.println("사람이 수저로 먹다.");
		super.eat(); //super 를 이용해 부모eat 메서드를 호출
	}
}
class Dog extends Animal{
	//메서드 오버라이딩
	public void eat() {
		System.out.println("강아지가 혓바닥을 사용하다 ");
		super.eat();
	}
}

public class TestOverriding1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat(); //오버라이딩된 자신의 메서드가 실행
		Dog d = new Dog();
		d.eat(); //오버라이딩된 메서드가 실행
	}
}
