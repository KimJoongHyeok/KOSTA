package step3;

import step2.Account;

/*
 * step3패키지 클래스에서
 * step2 패키지 클래스의 멤버에 접근해서
 * 접근제어자를 테스트 해보는 예제
 * 
 * ctrl shift o : import
 * */

public class TestAccessModfier2 {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.no1);
		
		a.deposit(200);
	}
}
