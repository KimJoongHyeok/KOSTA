package step5;

public class TestIf {
	public static void main(String[] args) {
		int age = -20;
		if(age > 19) { //���ǹ����� �߰�ȣ�� ���������϶� �ʼ����̰� ���๮�� �Ѷ����̸� ��������
			System.out.println(age + "�� �����Դϴ�.");
		}
		else if(age > 0){
			System.out.println(age + "�� �̼������Դϴ�.");
		}else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}
}
