package step3;
//�ڵ带 �� ���� Ȯ���ϱ� ���� �ϳ��� ���Ͽ� Ŭ������ ������ �����Ѵ�. -> �н��뵵�θ� ���(���� ���߽ÿ��� ������ ���Ͽ��� Ŭ������ �����ϴ°��� ����)

//�ϳ��� ���Ͽ��� ���� Ŭ���� ���ǽÿ��� main�� �ִ� Ŭ������ public�� ����ϰ� ���ϸ� �Ǵ� main�� �ִ� Ŭ���������� �Ѵ�.
//�ϳ��� ���Ͽ� class�� ������ �����Ҷ��� public �ϳ��� �����Ҽ�����

//**********�Ű������� ���� �Ǵ� Ÿ���� �޶����
//�������� �ٸ��ٰ� �ؼ� �����ε��� �Ǵ� ���� �ƴϴ�. �Ű������� Ÿ��,����,������ �޶�� �����ε��� ������
class Person{
	//�޼��� �����ε� : method overloading -> ������ �޼�������� �پ��� �Ű������� ����
	public void eat() {
		System.out.println("�Դ�.");
	}
	public void eat(int count) {
		System.out.println(count + "�κ� �Դ�.");
	}
	
	public void eat(String menu) {
		System.out.println(menu + "�Դ�");
	}
	public void eat(String menu,int count) {
		System.out.println(menu + " " + count + "�κ� �Դ�.");
	}
}

public class TestOverloading1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat(3);
		p.eat("���");
		p.eat("���",5);
		
	}

}
