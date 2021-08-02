package step2;
/*
 * 
 *  1) primitive data type (�⺻�� ������ Ÿ��)
			1byte	2byte	4byte	8byte
	������	byte	short	int		long	�������� �⺻���� int
	�Ǽ���					float	double	�Ǽ����� �⺻���� double
	������			char					�������� ���� �ѹ��ڸ� ����,���ڿ��� �������� String�� ���
	����	boolean							������ true or false �� ����
	*/
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//1.������
		byte b=1;
		b=2;
		System.out.println("byte : " + b);
		//java se api�� �̿��� byte Ÿ���� �ִ밪,�ּҰ��� Ȯ���غ���.
		System.out.println("byte �� �ִ밪 : " + Byte.MAX_VALUE);
		System.out.println("byte �� �ּҰ� : " + Byte.MIN_VALUE);
		
		short s = 3; //2byte
		System.out.println("shor : " +s);
		int i = 1; //4byte
		System.out.println("int : " + i);
		long l =3L; //8byte , long�� �����Ϳ��� �빮�� or �ҹ��� L�� ���δ�
		
		System.out.println("long : " + l);
		
		//2.�Ǽ���
		float f = 3.14F; //4byte  ,float�� �����Ϳ��� �빮�� or �ҹ��� F ���δ�
						 //3.14F��� ����ϴ� ������ 3.14�� �Ǽ� �⺻��double�� �ν��ϱ⋚��
		System.out.println("float : " + f);
		double d = 3.14; // 8byte  �Ǽ����� �⺻���� double
		System.out.println("double : " + d);
		
		//3.������ (�� ���ڸ� ����, ���ڿ��� ������ String ���� ����)
		char c = 'a';
		System.out.println("char : " + c);
		
		//4.����
		boolean bool = true;
		bool = false;
		System.out.println("boolean : " + bool);
		
		//type casting ���
		
		byte b1 = 1;
		byte b2 = 6;
		//�Ʒ��� compile error
		//byte b3 = b1 + b2; //�������� 7 �� �������� �⺻���� int�� �ν�
		//��� 1
		//int in = b1 + b2;
		
		//��� 2
		byte b3 = (byte)(b1+b2); // �� ������ �������� byte������ �νĽ�Ų�� -> type casting (�� ��ȯ)
		System.out.println("���� ��� : " + b3);
	}
}
