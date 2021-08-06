package step8;
//�������� ����Ǹ� �ϳ��� ��ü�� ���� Ÿ���� ������ ������ �� �ִٴ� ���� Ȯ���ϴ� ����
class Animal{
	public void eat() {
		System.out.println("�Դ�.");
	}
	public void sleep() {
		System.out.println("�ڴ�.");
	}
}
class Person extends Animal{
	public void eat() {
		System.out.println("����� �Դ�.");
	}
}
public class TestPolymorphism1 {
	public static void main(String[] args) {
		//�Ϲ������� �Ʒ��� ���� ��ü�� ����
		//Person p = new Person();
		//�Ʒ��� ���� �θ�Ÿ�� Animal�� p ������ ��ü�� ������ ���� �ִ�.
		// ->�Ʒ� �ڵ� ����ó�� �θ� Ÿ���� ������ ���� �����ϴٴ� ���� � ������ ������?
		Animal p = new Person();
		p.sleep(); //��ӹ��� �θ� �޼��尡 ����
		p.eat();
	}
}
