package step4.method1;

public class TestMethod1 {
	//���� �޼��� : ���α׷� ���� ����
	public static void main(String[] args) {
		Person p  = new Person();
//		p.eat1();
//		p.eat2("ġŲ");
//		p.eat2("ī��");
		p.eat3();
		String result = p.eat3();
		System.out.println("main : " + result);
		
		System.out.println("main : " + p.eat3());
	}

}
