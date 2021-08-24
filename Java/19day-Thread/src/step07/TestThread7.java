package step07;
//Daemon Thread Test 예제
//백업스레드를 daemon thread로 처리해서 현 Word 스레드가 종료되면 함께 종료되도록 한다.
//backThread.setDaemon(true);
public class TestThread7 {
	public static void main(String[] args) {
		Thread t = new Thread(new Word());
		t.start();	
	}
}
