package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {

	/*
	 * SOCKET 생성 ReceiverWorker 생성 ,Thread 생성, setDaemon(true),start(); 콘솔로부터 입력받은
	 * 메세지를 서버로 출력하느 기능을 구현 (exit 을 입력하면 종료)
	 */
	private Socket socket;
	private BufferedReader br;
	private PrintWriter out;
	private Scanner sc;

	public void go() throws UnknownHostException, IOException {
		try {
			socket = new Socket(IP.LOCAL, 7894);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			sc = new Scanner(System.in);
			ReceiveWorker rw = new ReceiveWorker();
			Thread t = new Thread(rw);
			t.setDaemon(true); // 자신을 실행시킨 thread 가 종료되면 함게 종료되도록 설정
			t.start();
			// 자신의 메세지를 서버로 출력하는 작업 정의
			System.out.println("**Chat Client 실행**");
			while (true) {
				
				String message = sc.nextLine();
				out.println(message);
				if (message.trim().equalsIgnoreCase("exit")) {
					break;
				}
			}
		} finally {
			if (sc != null)
				sc.close();
			if (socket != null)
				socket.close();
			System.out.println("**Chat Client 종료**");
		}
	}

	public class ReceiveWorker implements Runnable {

		@Override
		public void run() {
			try {
				receiveMessage();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void receiveMessage() throws IOException {
			while(true) {
				String message = br.readLine();
				if(message==null)
					break;
				System.out.println(message);
			}
		}
	}

	public static void main(String[] args) {
		try {
			new ChatClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
