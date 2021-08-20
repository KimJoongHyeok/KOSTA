package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput3 {
	public static void main(String[] args) {
		String path = "C:\\kosta224\\iotest2\\lunch\\menu.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			//readLine() 을 이용해서 읽을 라인이 존재할 떄까지 반복하면서 콘솔에 출력
			String s = br.readLine(); //첫 라인을 입력받는다. 비어있다면 첫번째부터 null이 들어감
			while(s != null) {
				System.out.println(s);
				s = br.readLine(); //다음 라인을 입력받는다.
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
