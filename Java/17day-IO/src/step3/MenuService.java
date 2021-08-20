package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;
	/*
	 * ������ �Ű������� ���޹޴� ���� ��ο� �ش��ϴ� ���丮�� �������� �ʴ´ٸ� ���丮�� �����Ѵ�
	 */
	public MenuService(String path) {
		super();
		this.path = path;
		// ���ϰ���� ���� ���丮 ������ ��ȯ�޴´�.
		File dir = new File(path).getParentFile();
		// Ȯ�ο�System.out.println(dir.getPath());
		if (dir.isDirectory() == false) { //���丮�� ������
			dir.mkdirs(); //���丮�� �����Ѵ�.
		}
	}
	//throws
	public void order() throws IOException {
		/*//���ڵ�
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("���� �޴��� �ֹ��ϼ��� : ");
			String menu = s.nextLine();
			PrintWriter pw = new PrintWriter(new FileWriter(path,true));
			pw.println(menu);
			if(menu.equals("�ֹ���")) {
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			pw.close();
		}
		s.close();
	*/
		Scanner s = null;
		PrintWriter pw = null;
		
		try {
			s = new Scanner(System.in);
			pw = new PrintWriter(new FileWriter(path,true));
			while(true) {
				System.out.print("���� �޴��� �ֹ��ϼ��� : ");
				String menu = s.nextLine();
				if(menu.equals("�ֹ���")) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
					break;
				}
				pw.println(menu);
				System.out.println(menu + " �ֹ�");
			}
		}finally{
			if(pw != null) {
				pw.close();
			}
			if(s != null) {
				s.close();
			}
		}
		 
	}
}
