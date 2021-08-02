package step2;
/*
 * 
 *  1) primitive data type (기본형 데이터 타입)
			1byte	2byte	4byte	8byte
	정수형	byte	short	int		long	정수형의 기본형은 int
	실수형					float	double	실수형의 기본형은 double
	문자형			char					문자형은 오직 한문자만 가능,문자열은 참조형인 String을 사용
	논리형	boolean							논리형은 true or false 만 가능
	*/
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//1.정수형
		byte b=1;
		b=2;
		System.out.println("byte : " + b);
		//java se api를 이용해 byte 타입의 최대값,최소값을 확인해본다.
		System.out.println("byte 형 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte 형 최소값 : " + Byte.MIN_VALUE);
		
		short s = 3; //2byte
		System.out.println("shor : " +s);
		int i = 1; //4byte
		System.out.println("int : " + i);
		long l =3L; //8byte , long형 데이터에는 대문자 or 소문자 L을 붙인다
		
		System.out.println("long : " + l);
		
		//2.실수형
		float f = 3.14F; //4byte  ,float형 데이터에는 대문자 or 소문자 F 붙인다
						 //3.14F라고 써야하는 이유는 3.14는 실수 기본형double로 인식하기떄문
		System.out.println("float : " + f);
		double d = 3.14; // 8byte  실수형의 기본형은 double
		System.out.println("double : " + d);
		
		//3.문자형 (한 문자만 가능, 문자열은 참조형 String 으로 제어)
		char c = 'a';
		System.out.println("char : " + c);
		
		//4.논리형
		boolean bool = true;
		bool = false;
		System.out.println("boolean : " + bool);
		
		//type casting 사례
		
		byte b1 = 1;
		byte b2 = 6;
		//아래는 compile error
		//byte b3 = b1 + b2; //연산결과는 7 은 정수형의 기본형인 int로 인식
		//방법 1
		//int in = b1 + b2;
		
		//방법 2
		byte b3 = (byte)(b1+b2); // 두 숫자의 연산결과가 byte형으로 인식시킨다 -> type casting (형 변환)
		System.out.println("연산 결과 : " + b3);
	}
}
