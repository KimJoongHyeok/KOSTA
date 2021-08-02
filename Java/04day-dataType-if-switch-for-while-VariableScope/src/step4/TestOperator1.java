package step4;
//연산자 연습
public class TestOperator1 {
	public static void main(String[] args) {
		int i = 7;
		int j = 3;
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.println(i=j); // 할당 또는 대입
		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("**************");
		int k = 7;
		System.out.println(k++);
		System.out.println(k);
		System.out.println("결과 예상");
		System.out.println(k--); //8
		System.out.println(--k); //6
		int money = 200;
		//위의 money에 100을 더하고자 한다.
		money += 100;
		//money에 150 을 뺴고자 한다
		money -= 150;
		System.out.println(money);
		
		/*
		 * 삼항 연산자
		 * (조건식) ? 식1 : 식2 ;
		 * 조건식이 참이면 식1 이 실행, 거짓이면 식2가 실행
		 * */
		int x = 10;
		int result = (x>0)? x+1:x+2;
		System.out.println(result);
	}
}
