package test;

public class ClientOuter {
	private String socket;
	// 출력
	public void run() {
		System.out.println(socket);
	}
	// 수신을 전담하는 스레드 클래스르 Nested class로 정의
	public class ReWorker {
		public void run() {
			System.out.println(socket);
		}
	}
}
