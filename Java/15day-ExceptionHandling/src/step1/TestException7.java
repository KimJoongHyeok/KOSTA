package step1;

import java.util.Scanner;

/*
 * Scanner 를 이용해 정보를 입력받고 Exception try catch finally 를 테스트 하는 예제
 */
public class TestException7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		String info = s.nextLine();
		try {
			int age = Integer.parseInt(info);

			if (age > 19) {
				System.out.println("당신은 성인입니다.");
			} else {
				System.out.println("당신은 미성년입니다.");
			}
		} catch (NumberFormatException ne) {
			System.out.println("정수만 입력가능합니다.");
		}finally {
			s.close(); //close() 는 예외 발생 여부와 관계없이 항상 실행하게 한다.
		}

	}
}
