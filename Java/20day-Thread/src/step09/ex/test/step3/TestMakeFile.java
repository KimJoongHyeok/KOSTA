package step09.ex.test.step3;

import java.io.File;
import java.io.IOException;

public class TestMakeFile {
	public static void main(String[] args) {
		File file = new File("C:\\kosta224\\iotest\\0.mp3");
		try {
			boolean b = file.createNewFile();
			System.out.println("¿Ï·á" + b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
