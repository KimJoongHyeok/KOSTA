package step4;
class Animal{
	int age = 1;
	public void eat() {
		System.out.println("먹다.");
	}
}
class Person extends Animal{ //Person은 animal을 상속받는다.
	public void study() {
		System.out.println("공부하다.");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
		p.eat();
		p.study();
		
		Animal a = new Person(); //부모 객체에 자식 생성자를 생성
		//Person ap = new Animal(); 오류
	
	}

}
