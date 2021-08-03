package step1;

public class TestLoop {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("*************");
		//위의 for 구문 실행을 아래 while문으로도 동일하게 적용할 수 있다.
		int j = 0;
		while(j<10) {
			System.out.println(j++);
		}
		System.out.println("***********");
		int k = 0;
		do {
			System.out.println(k++);
		}while(k>1);
	}
}
