package step08;

public class TestThreadReview8 {
	public static void main(String[] args) {
		//Thread Review
		int makeCount = 10; //���� Ƚ��
		int makePeriod = 1000; //1�� �������� ����
		//1.makeFile() ����
		//2.makeWorker�� �̿��� ������ ������ start
		
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount,makePeriod);
		Thread t = new Thread(makeWorker);
		t.start();
		//���� 2
		int moveCount = 3;
		int movePeriod = 4000;
		//1.moveFile() ����
		//2.moveWorker�� �̿��� ������
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount,movePeriod);
		
		
	}
}
