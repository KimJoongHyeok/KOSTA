package step6.ex;

/*
 * 클라이언트가 여러번 접속해도 동작될 수 있도록 step1서버를 업데이트
 * ServerSocket 생성
 * while(true){
 *   Socket socket = server.Socket.accept(); //클라이언트가 여러번 접속할 수 있도록 accept() 를 반복해서 실행
 *   출력서비스
 *   close();
 * }
 */
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 		하나의 서버가 지속적으로 접속을 유지하면서 다수의 클라이언트에게 서비스 하기 위해서는
		프로게스 세부적 실행단위인 Thread를 이용해야 한다.
		(ex) 콜센터에서 다수의 고객과 동시에 상담서비스를 하기 위해 직원을 다수 채용해야 하는것과 같다)
	
		MultiServer 에서는 클라이언트 접속을 대기하다가 접속하면 해당 클라이언트와 통신하기 위한
		Socket(전화기)을 반환받아 ServerWorker(직원) 객체 생성시에 할당하고
		Thread를 생성해 start 시킨다. ( 이를 반복 )
		
		Runnable Interface의 하위인 ServerWorker 는 할당받은 소켓으로
		클라이언트와 메아리 서비스를 진행한다.
 */

public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**Multi Server 실행**");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker sw = new ServerWorker(socket);
				Thread t = new Thread(sw);
				t.start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
