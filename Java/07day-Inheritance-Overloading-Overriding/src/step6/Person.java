package step6;

public class Person extends Animal {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void printDetail() {
		//�Ʒ� age�� ��ӹ޾����� �θ� Ŭ�������� private���� ���������ڷ� ����Ǹ� ���� �Ұ�
		System.out.println(name + " " + getAge());
	}
	
}
