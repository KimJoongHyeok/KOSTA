package step4.method2;

public class TestMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int result = c.plus(2,2);
		System.out.println("연산결과 : " + result);
		System.out.println("연산결과2 : " + c.plus(3, 5));
		
		int num1 = 7;
		int num2 = 5;
		result = c.minus(num1,num2);
		System.out.println("연산결과3 : " + result);
	}

}
