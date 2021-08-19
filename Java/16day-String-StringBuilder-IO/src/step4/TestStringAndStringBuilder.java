package step4;
/*
	���ڿ��� �ٷ�� String �� StringBuilder �� ������
	
	String : �Һ�, ��� -> ���ڿ� ������� ( literal pool )�� ����,
	 		 �ѹ� ������ ���ڿ��� ���� ������ ���� �ؼ� ��� -> ������ ���ڿ��� ���� ���� ��� �޸𸮸� ȿ�������� ���
	 		 String ���ڿ��� �޼��带 �̿��� �����͸� �߰� �Ǵ� ���� �Ǵ� ������ ��쿡�� ��ü�� ������� �ʰ� 
	 		 ���� ����
	StringBuilder : ����, StringBuilder �޼��带 �̿��� �߰� �Ǵ� ���� �Ǵ� ������ ��� ��ü�� ����
			 		������ ���ڿ��� ���� ����� �� ����
			 		
	String	vs	StringBuilder	vs	StringBuffer
	�Һ�			����					����
	���λ���		��ü�� ����				��ü�� ����
									����ȭ ����( thread-sage ) -> ���� ���ο���
 			
 */

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name = "������"; //String �Һ�(���)
		System.out.println(name.concat("��")); //�������� ���ڿ��� ���θ���� �˼����� -> String �� ���� ������ ������ �� �����Ƿ� 
		System.out.println(name); //name�� ������ 
		System.out.println("***************");
		StringBuilder sb = new StringBuilder("������");
		System.out.println(sb.append("��")); // �������� -> StringBuilder �� ��ü�� ����
		System.out.println(sb);//sb�� ��������(���� ��ü�� �����)
		System.out.println("*******************");
		String nick  = "�����";
		StringBuilder snick = new StringBuilder("�����");
		System.out.println(nick + " " + snick);
		//���׽�Ʈ
		System.out.println(nick == snick.toString()); //==�δ� ���ڿ� �� �Ұ�
		System.out.println(nick.equals(snick));
		System.out.println(nick.equals(snick.toString())); //equals �δ� �� ���� (StringBuilder �Ǵ� StringBuffer�� toString() �ʿ�)
		System.out.println(nick.contentEquals(snick)); //contentEquals �� String �� StringBuilder or StringBuffer �� �ٷ� �񱳰���
		
		
		
	}
}










