package step04;

public class AudioWorker implements Runnable {

	//JVM 에 의해서 실행, Thread 서비스를 정의하는 메서드
	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.println("오디오서비스 스레드 실행 : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
