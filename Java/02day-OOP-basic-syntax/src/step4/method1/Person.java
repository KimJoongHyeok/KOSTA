package step4.method1;

public class Person {
	public void eat1() {
		System.out.println("먹다");
	}
	//호출한 측에서 데이터(argument : 전달인자) 를 매개변수(parameter)로 받는다
	public void eat2(String food) {
		System.out.println(food + "먹다");
	}
	public String eat3() {
		System.out.println("eat3 method 실행");
		return "eat3 메서드 실행 결과";
	}
}
