package step4;

public class TestVariableScope {
	public static void main(String[] args) {
		/*
		 * Person : ������ ������ Ÿ��
		 * p : ��������, ���� �޼��� ���� ����Ǿ� �����Ƿ� �������� -> stack memory�� ����
		 * */
		Person p = new Person("������");
		p.eat();
		p.testInit();
	}
}
