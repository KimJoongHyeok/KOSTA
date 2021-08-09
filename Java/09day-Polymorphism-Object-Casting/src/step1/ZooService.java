package step1;
//Service : 비즈니스 로직을 정의한 클래스
public class ZooService {
	//다형성이 지원되므로 다양한 자식 객체들을 하나의 부모 타입 Animal 의 매개변수 a 로 참조하게 할 수 있다.
	public void pass(Animal a) {
		System.out.println(a);
	}
	//다형성을 지원 또는 적용하지 않는 다면
	/*
	 * public void pass(Person p){}
	 * public void pass(Dog d){}
	 * */
	
	//이후 추가적으로 새로운 객체가 전달된다면
	//다형성을 적용하지 않으면 아래와 같이 메서드가 또 추가되어야 한다.
	// public void pass(Monkey p){}
}
