package step7.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	/*
	 * serversocket생성 loop accept() ServerWorker 생성 Thread 생성 start();
	 */
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(5431);
			System.out.println("**ChatServer 실행**");
			while (true) {
				Socket socket = serversocket.accept();
				ServerWorker serverworker = new ServerWorker(socket);
				list.add(serverworker);
				Thread t = new Thread(serverworker);
				t.start();
			}
		} finally {
			if (serversocket != null)
				serversocket.close();
		}
	}

	/*
	 * 각각의 serverworker가 클라이언트로부터 입력받은 메세지를 접속한 전체 클라이언트에게 출력하기 위한 메서드 아래 메서드를 개별
	 * serverworker의 run메서드에서 호출해서 사용한다.
	 */
	public void sendMessage(String message) {
		// list루프돌리면서 pw.println(list.get)
		for (int i = 0; i < list.size(); i++) {
			list.get(i).out.println(message);
		}
	}

	public class ServerWorker implements Runnable {
		private Socket socket;
		private String clientIP;
		private BufferedReader br;
		private PrintWriter out;

		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
			//clientIP = socket.getInetAddress().toString();
		}

		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(clientIP + " 통신중 오류발생" + e.getMessage());
			} finally {
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					// list에서 현재 객체를 삭제한다
					list.remove(this);
					sendMessage(clientIP + "님이 나가셨습니다.");
				}
			}
		}

		public void chatting() throws IOException {
			clientIP = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			sendMessage(clientIP + "님이 입장하셨습니다.");
			while (true) {
				String message = br.readLine();
				if (message == null || message.trim().equalsIgnoreCase("exit"))
					break;
				sendMessage(clientIP + " 님: " + message);
			}
		}
	}

	public static void main(String[] args) {
		try {
			new ChatServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
