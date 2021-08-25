package step09.ex;
/*
 * 멀티 스레드 연습 예제
 * 
 * -요구사항 및 분석
 * 
 * CommonInfo 의 MAKE_PATH에 1초 간격으로 30번 반복하면서 30개의 파일을 생성
 * 이 때 파일명은 0_시간정보.avi or mp3 ( 확장자는 avi 또는 mp3를 랜덤하게 지정 )으로 생성한다
 * 
 * 이와 동시에 CommonInfo의 MUSIC_PATH 와 MOVIE_PATH 디렉토리에 
 * MAKE_PATH 디렉토리에서 생성된 파일들을 확장자별로 이동시킨다.
 * 7초 간격으로 5번 실행해서 모두 이동되도록 처리한다.
 * 
 * 이 두작업을 동시에 진행하기 위해서 멀티 스레드 구현이 필요하다.
 * 
 * 파일을 생성하는 스레드 : MakeFileWorker Thread
 * 파일을 이동시키는 스레드 : MoveFileWorker Thread
 * 스레드는 implements Runnable 방식으로 생성
 * 
 * -설계 및 구현
 * 자료조사 및 단위테스트
 * 1. 확장자를 랜덤하게 생성 : step09.ex.test.step1.TestRandom
 * 2. 시간정보 : step09.ex.test.step2.TestTime
 * 1,2를 이용한 파일명 생성
 * 3. 디렉토리 및 파일생성 : step09.ex.test.step3.TestMakeFile
 * 4. 파일이동 : step09.ex.test.step4.TestMoveFile
 * 
 * 구현
 * 위 단위테스트를 통한 정보를 이용해
 * 멀티 스레드 프로그램 구현
 * 
 */

public class TestThread9 implements CommonInfo {
	public static void main(String[] args) {
		int makeCount = 30;
		int makePeriod = 1000;
		int moveCount = 5;
		int movePeriod = 7000;
		MakeFileWorker makeFile = new MakeFileWorker(makeCount, makePeriod);
		MoveFileWorker moveFile = new MoveFileWorker(moveCount, movePeriod);
		Thread makefileThread = new Thread(makeFile);
		Thread movefileThread = new Thread(moveFile);
		makefileThread.start();
		movefileThread.start();

	}
}
