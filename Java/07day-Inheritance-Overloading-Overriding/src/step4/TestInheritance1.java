package step4;
class Animal{
	int age = 1;
	public void eat() {
		System.out.println("�Դ�.");
	}
}
class Person extends Animal{ //Person�� animal�� ��ӹ޴´�.
	public void study() {
		System.out.println("�����ϴ�.");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
		p.eat();
		p.study();
		
		Animal a = new Person(); //�θ� ��ü�� �ڽ� �����ڸ� ����
		//Person ap = new Animal(); ����
	
	}

}
