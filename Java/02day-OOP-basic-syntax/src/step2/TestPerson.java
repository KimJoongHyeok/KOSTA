package step2;

//Person class�� �̿��� Person ��ü(object)�� ������ ������ �޼��带 �׽�Ʈ�ϴ� ������ ���� Ŭ����

public class TestPerson {
	public static void main(String[] args) {
		
	//Person : Ŭ���� ���̰� ������ ������ Ÿ���̴�
	//p : ����, ��������, ��ü�� �����ϱ� ���� �ְ��� �����ϴ� ����
	//new : ��ü ������ ���� �ڹ� Ű����
	//Person() : ������ constructor
	
	Person p = new Person();
	System.out.println(p.name); // ��ü�� �Ӽ�(����)�� ������ ���� ���
	p.eat();
	p.name = "�̰���";
	System.out.println(p.name);
	p.eat();
	}
}
