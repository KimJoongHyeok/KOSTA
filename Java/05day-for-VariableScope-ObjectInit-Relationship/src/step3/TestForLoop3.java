package step3;

public class TestForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ������ 2�� ���� 9�ܱ��� ���
		 * ��ø for (Nested Loop) �� �̿��Ѵ�
		 * 
		 * 2*1=2 .... 2*9=18
		 * ........
		 * 9*1=9
		 * */
		
		for(int i = 2;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.print(i + "*" + j + "=" + (i*j));
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}

}
