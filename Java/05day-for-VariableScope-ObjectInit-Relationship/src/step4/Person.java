package step4;

public class Person {
	
	private String name; // �ν��Ͻ� ����, Ŭ���� �������� ����Ǿ��⶧��
	private String email; // ���� �ص� �⺻ �ʱ�ȭ, �������� null�� �ʱ�ȭ
	
	//parameter(�Ű�����) �� name �� local����
	public Person(String name) {
		this.name = name;
	}
	public void eat() {
		//count �� ���ú���
		int count = 3;
		System.out.println(count + "�κ� �Դ�.");
		if(count > 0) {
			int lv = 1;
			System.out.println(lv);
		}
		//local variable �� ����� ������������ ��밡��
	}
	public void eat2() {
		//int count; //�������� local variable �� ���� �Ѵ�
		//System.out.println(count); compile error
		int count2 = 0;
		System.out.println(count2);
	}
	public void testInit() {
		//�ν��Ͻ� ���� �ʱ�ȭ�� Ȯ��
		System.out.println("name : " + name);
		System.out.println("email : " + email);
	}
}
