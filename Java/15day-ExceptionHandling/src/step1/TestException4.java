package step1;

import java.util.ArrayList;

/*
 * try, catch review
 */
public class TestException4 {
	public static void main(String[] args) {
		String name = "아이유";
		//name = null;
		ArrayList<String>list = new ArrayList<String>();
		try { //try : 예외 발생 예상 지점 블럭화
			System.out.println(name.length()); //예외발생시 바로 catch구문으로 이동, Exception 발생하면 아래 후속작업진행 실행되지않고 즉시 catch구문이 실행
			System.out.println("후속 작업 진행" + list.get(2));
		}catch(NullPointerException ne){ //예외 발생시 해당 Exception 을 처리 -> 대안 흐름을 실행
			System.out.println("이름을 정상적으로 입력하셔야 합니다!");
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("리스트의 범위를 초과하여 정보를 확인할 수 없습니다.");
		}
		catch(Exception e) {
			e.printStackTrace(); //예외 메세지와 발생경로를 출력
		}
		System.out.println("프로그램 정상 수행");
	}
}
