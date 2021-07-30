package step2;

//접근 제어자 테스트

public class TestAccessModifier {
	public static void main(String[] args) {
		Account a = new Account();
		//public 에 접근해서 출력해본다
		System.out.println(a.no1); //정수형이므로 0으로 초기화
		a.no1 = 1111;
		System.out.println(a.no1);
		
		//default에 접근
		a.no2 = 2222;
		System.out.println(a.no2);
		
		
	}
}
