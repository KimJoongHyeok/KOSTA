package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 입력 스트림을 이용해 파일에서 데이터를 입력 받는 예제
 */
public class TestInput1 {
	public static void main(String[] args) {
		
		try { //파일에 입력받기 위한 NodeStream 을 생성
			FileReader fr = new FileReader("C:\\kosta224\\iotest2\\lunch\\menu.txt");
			//한 라인씩 입력받는 기능을 지원하는 Processing Stream을 생성
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine()); //한라인씩 입력받는다.
			System.out.println(br.readLine()); //그 다음 라인을 입력받는다.
			System.out.println(br.readLine()); //더 이상 읽을 라인이 없으므로 null을 반환
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
