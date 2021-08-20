package step2;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	//콘솔에서 입력받는 예제
	public static void main(String[] args) {
		//콘솔에 연결되는 NodeStream 중 입력스트림
		InputStream is = System.in;
		//ProcessingStream 기능 지원
		Scanner s = new Scanner(is);
		System.out.print("친구이름을 입력하세요 : ");
		String name = s.nextLine(); //이름을 입력해 enter 누르기전까지 대기한다.
		System.out.println("친구이름 : " + name);
		s.close();
	}
}
