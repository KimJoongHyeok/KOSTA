package step3;
class Animal{
	protected void eat() {
		System.out.println("�Դ�.");
	}
}
class Person extends Animal{
	//�޼��� �������̵�
	//�������̵��ҋ� ���������ڰ� �ڽĿ��� �������� �ȵ� but �θ� protected ���� �ڽ��� public ������
	public void eat() {
		System.out.println("����� ������ �Դ�.");
		super.eat(); //super �� �̿��� �θ�eat �޼��带 ȣ��
	}
}
class Dog extends Animal{
	//�޼��� �������̵�
	public void eat() {
		System.out.println("�������� ���ٴ��� ����ϴ� ");
		super.eat();
	}
}

public class TestOverriding1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat(); //�������̵��� �ڽ��� �޼��尡 ����
		Dog d = new Dog();
		d.eat(); //�������̵��� �޼��尡 ����
	}
}
