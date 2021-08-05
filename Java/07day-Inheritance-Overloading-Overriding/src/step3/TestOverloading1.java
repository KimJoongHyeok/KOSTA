package step3;
//코드를 한 눈에 확인하기 위해 하나의 파일에 클래스를 여러개 정의한다. -> 학습용도로만 사용(실제 개발시에는 별도의 파일에서 클래스를 정의하는것을 권장)

//하나의 파일에서 여러 클래스 정의시에는 main이 있는 클래스에 public을 명시하고 파일명 또는 main이 있는 클래스명으로 한다.
//하나의 파일에 class를 여러개 정의할때는 public 하나만 정의할수잇음

//**********매개변수의 개수 또는 타입이 달라야함
//변수명이 다르다고 해서 오버로딩이 되는 것은 아니다. 매개변수으 타입,개수,순서가 달라야 오버로딩이 설립됨
class Person{
	//메서드 오버로딩 : method overloading -> 동일한 메서드명으로 다양한 매개변수를 정의
	public void eat() {
		System.out.println("먹다.");
	}
	public void eat(int count) {
		System.out.println(count + "인분 먹다.");
	}
	
	public void eat(String menu) {
		System.out.println(menu + "먹다");
	}
	public void eat(String menu,int count) {
		System.out.println(menu + " " + count + "인분 먹다.");
	}
}

public class TestOverloading1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat(3);
		p.eat("라면");
		p.eat("라면",5);
		
	}

}
