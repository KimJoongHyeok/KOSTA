package step2;

//���� ������ �׽�Ʈ

public class TestAccessModifier {
	public static void main(String[] args) {
		Account a = new Account();
		//public �� �����ؼ� ����غ���
		System.out.println(a.no1); //�������̹Ƿ� 0���� �ʱ�ȭ
		a.no1 = 1111;
		System.out.println(a.no1);
		
		//default�� ����
		a.no2 = 2222;
		System.out.println(a.no2);
		
		
	}
}
