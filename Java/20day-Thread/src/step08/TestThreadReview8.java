package step08;

public class TestThreadReview8 {
	public static void main(String[] args) {
		//Thread Review
		int makeCount = 10; //실행 횟수
		int makePeriod = 1000; //1초 간격으로 실행
		//1.makeFile() 구현
		//2.makeWorker를 이용해 스레드 생성후 start
		
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount,makePeriod);
		Thread t = new Thread(makeWorker);
		t.start();
		//연습 2
		int moveCount = 3;
		int movePeriod = 4000;
		//1.moveFile() 구현
		//2.moveWorker를 이용한 스레드
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount,movePeriod);
		
		
	}
}
