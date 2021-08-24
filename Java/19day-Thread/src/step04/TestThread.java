package step04;
/*
 * 멀티 스레드 테스트 예제
 * TestThread4 프로세스( main thread + 영상 thread + 음향 thread )
 */
public class TestThread {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		
		VideoWorker worker1 = new VideoWorker();
		Thread t1 = new Thread(worker1);
		
		AudioWorker worker2 = new AudioWorker();
		Thread t2 = new Thread(worker2);
		
		t1.start(); //t1스레드를 실행가능 상태로 보낸다.
		t2.start();
		System.out.println("**main thread 종료**");
	}
}
