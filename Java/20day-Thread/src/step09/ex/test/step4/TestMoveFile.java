package step09.ex.test.step4;

import java.io.File;

/*
 * ������ �̵���Ű�� ���� �׽�Ʈ
 * File class �� renameTo() �� �̿��ϸ� �ȴ�.
 */
public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath = "C:\\kosta224\\iotest\\org\\iu.jfif";
		String destPath = "C:\\kosta224\\iotest\\dest\\iu.jfif";
		
		File orgFile = new File(orgPath);
		File destFile = new File(destPath);
		
		boolean result = orgFile.renameTo(destFile); //������ �̵���Ű�� true,�̵���ų�� ������ false
		//System.out.println("move : " + result);
		String a = "Hello.World";
		String[] b = a.split(".");
		System.out.println(b[0]);
	}
}
