package step3;
//Object casting �� ����ϴ� ����
class Animal{
	public void eat() {
		System.out.println("�Դ�.");
	}
	public void sleep() {
		System.out.println("�ڴ�");
	}
}
class Person extends Animal{
	@Override
	public void eat() {
		System.out.println("����� ������ �Դ�.");
	}
	//�ڽ��� ������ ���(�޼���)
	public void study() {
		System.out.println("����� �����ϴ�.");
	}
}


public class TestPolymorphism4 {

	public static void main(String[] args) {
		// ������ : �θ�Ÿ���� ������ �ڽ� ��ü�� �������� ����.
		Animal a = new Person();
		a.sleep(); //��ӹ��� ��� ,  ���ٰ���
		a.eat(); //�������̵��� �޼���, ���ٰ���
		//�ڽ��� ������ ���(�޼���)�� p ������ �����غ���. �� ��� compile ����
		//�� ��� a ���������� Ÿ���� Animal �̱� ����
		//�Ʒ��� ���� Object down casting�� �ϸ� �ڽ��� ������ ����� ������ �� �ִ�.
		//((Person) a).study();
		//�� �ڵ带 Ǯ��� �Ʒ��� ���� �� ���� �ִ�.
		Person p = (Person)a;
		p.study();
		
	}

}