package step4;

//abstract method가 하나 이상 존재하면 abstract class 로 선언되어야 한다
abstract class Parent {
	int money = 100;

	public void eat() {
		System.out.println("먹다");
	}

	// abstract method
	public abstract void study();
}

class Child extends Parent {
	//상속받은 Parent class 의 abstract method 는 반드시 구현해야 한다. 만약 구현하지 않으면 자신이 abstract class 로 선언되어야 한다
	@Override
	public void study() {
		System.out.println("공부하다");
	}

}

public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.money); //부모로 부터 상속받은 인스턴스 변수
		p.eat(); //상속받은 메서드
		p.study(); //오버라이드한 자신의 메서드 
	}
}
