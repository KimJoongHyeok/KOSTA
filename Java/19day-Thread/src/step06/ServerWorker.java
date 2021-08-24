package step06;
// 채팅 서비스를 담당하는 클래스
// 이 클래스로부터 다수의 스레드가 생성되어 실행된다.

//***
// 다수의 스레드에 의해 run()메서드가 실행되지만 
// 스레드별로 별도의 stack 메모리 영역이 생성되므로 
// 지역변수 local variable 을 사용하는데에는 문제가 없다.
public class ServerWorker implements Runnable{

	@Override
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void chatting() throws InterruptedException {
		//현재 실행중인 스레드의 이름을 반환받는다.
		String threadName = Thread.currentThread().getName();
		for(int i = 0;i<10;i++) {
			System.out.println(threadName + "서버일꾼스레드 채팅서비스 " + i);
			Thread.sleep(1000);
		}
	}

	
}
