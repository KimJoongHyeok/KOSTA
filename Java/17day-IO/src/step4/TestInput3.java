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
			//readLine() �� �̿��ؼ� ���� ������ ������ ������ �ݺ��ϸ鼭 �ֿܼ� ���
			String s = br.readLine(); //ù ������ �Է¹޴´�. ����ִٸ� ù��°���� null�� ��
			while(s != null) {
				System.out.println(s);
				s = br.readLine(); //���� ������ �Է¹޴´�.
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
