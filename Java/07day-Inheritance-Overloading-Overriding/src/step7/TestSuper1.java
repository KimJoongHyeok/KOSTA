package step7;

class Person{
	String name = "����̸�";
	
}
class Student extends Person{
	String name = "�л��̸�"; // ������ �ȳ�
	public void test() {
		System.out.println(name + " " + super.name); //superŰ����� �θ� ������ ���
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.test();
		
	}
}
