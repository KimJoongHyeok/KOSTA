package step6;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		File dir = new File("C:\\kosta224\\iotest2\\music");
		// dir �� music ���丮 �ȿ� �ִ� ���ϵ鸸 ( ������ ���� ) ��� ���ϸ��� ���
		File fa[] = dir.listFiles();
		//isFile(), 
		
		//�������� ���ϵ鸸 �̸� �����ϱ�
		for(int i = 0;i<fa.length;i++) {
			if(fa[i].isFile() == true) { //if(fa[i].isFile()) �ε� ���� ,��ü�� true,false�� ���еǱ� ����
			System.out.println(fa[i].getName());
			}
		}
			
	}
}
