package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��� ��Ʈ�� �׽�Ʈ ����
 * Ư�������� �����ؼ� �����͸� ����غ��� ����
 */
public class TestOutput1 {
	public static void main(String[] args) {
		try {
			//��ġ�� ����Ǵ� Node Stream �迭�� ����
			FileWriter fw = new FileWriter("C:\\kosta224\\iotest\\memo.txt",true); //true �� append �� �߰� ����
			//����� �����ϴ� Process Stream �迭�� ����
			PrintWriter pw = new PrintWriter(fw);
			pw.println("���½ð��Դϴ�.");
			System.out.println("���ϻ��� �� ���");
			pw.close(); //��Ʈ���� �ݾ��ش�. ( �̶� �޸𸮿� �ִ� �����͸� ���� ���Ͽ� ����Ѵ�. - flush )
			//�� ��Ʈ���� close, �ݾ��شٴ� ���� ��ġ�� ����� ������ ���������ν� �ٸ� �۾��ڰ� �ش� device�� ������ �� �ֵ��� �Ѵٴ� �ǹ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
