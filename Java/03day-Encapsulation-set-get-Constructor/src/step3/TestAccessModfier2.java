package step3;

import step2.Account;

/*
 * step3��Ű�� Ŭ��������
 * step2 ��Ű�� Ŭ������ ����� �����ؼ�
 * ���������ڸ� �׽�Ʈ �غ��� ����
 * 
 * ctrl shift o : import
 * */

public class TestAccessModfier2 {
	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.no1);
		
		a.deposit(200);
	}
}
