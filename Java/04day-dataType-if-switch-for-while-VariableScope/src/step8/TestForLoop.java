package step8;

public class TestForLoop {
	//for loop : 반복문 연습
	public static void main(String[] args) {
		System.out.println("**for loop**");
		for(int i = 0;i<3;i++) { // i는 0으로 초기화 되고 i 가 3보다 작을 동안 실행 후 증가하면서 반복한다.
			System.out.println("for loop : i ->" + i);
		} // for loop
		System.out.println("**while loop**");
		int j = 0;
		while(j<3) {
			System.out.println("while loop : j ->" + j++);
		}
		System.out.println("**do while**");
		//do while loop는 먼저 실행한 후 조건검사를 하고 반복한다.
		int k = 1;
		do {
			System.out.println("do while : k ->" + k++); //do while 문은 실행문 먼저 동작하고 이후 조건검사
		} while(k<0);
	}
}

