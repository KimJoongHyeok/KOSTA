package step8;

public class TestForLoop {
	//for loop : �ݺ��� ����
	public static void main(String[] args) {
		System.out.println("**for loop**");
		for(int i = 0;i<3;i++) { // i�� 0���� �ʱ�ȭ �ǰ� i �� 3���� ���� ���� ���� �� �����ϸ鼭 �ݺ��Ѵ�.
			System.out.println("for loop : i ->" + i);
		} // for loop
		System.out.println("**while loop**");
		int j = 0;
		while(j<3) {
			System.out.println("while loop : j ->" + j++);
		}
		System.out.println("**do while**");
		//do while loop�� ���� ������ �� ���ǰ˻縦 �ϰ� �ݺ��Ѵ�.
		int k = 1;
		do {
			System.out.println("do while : k ->" + k++); //do while ���� ���๮ ���� �����ϰ� ���� ���ǰ˻�
		} while(k<0);
	}
}

