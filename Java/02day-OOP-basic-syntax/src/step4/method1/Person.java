package step4.method1;

public class Person {
	public void eat1() {
		System.out.println("�Դ�");
	}
	//ȣ���� ������ ������(argument : ��������) �� �Ű�����(parameter)�� �޴´�
	public void eat2(String food) {
		System.out.println(food + "�Դ�");
	}
	public String eat3() {
		System.out.println("eat3 method ����");
		return "eat3 �޼��� ���� ���";
	}
}
