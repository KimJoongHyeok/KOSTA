package step09.ex.test.step4;

import java.io.File;

/*
 * 파일을 이동시키는 단위 테스트
 * File class 의 renameTo() 를 이용하면 된다.
 */
public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath = "C:\\kosta224\\iotest\\org\\iu.jfif";
		String destPath = "C:\\kosta224\\iotest\\dest\\iu.jfif";
		
		File orgFile = new File(orgPath);
		File destFile = new File(destPath);
		
		boolean result = orgFile.renameTo(destFile); //파일을 이동시키면 true,이동시킬게 없으면 false
		//System.out.println("move : " + result);
		String a = "Hello.World";
		String[] b = a.split(".");
		System.out.println(b[0]);
	}
}
