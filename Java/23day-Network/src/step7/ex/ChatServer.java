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
	 * serversocket���� loop accept() ServerWorker ���� Thread ���� start();
	 */
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(5431);
			System.out.println("**ChatServer ����**");
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
	 * ������ serverworker�� Ŭ���̾�Ʈ�κ��� �Է¹��� �޼����� ������ ��ü Ŭ���̾�Ʈ���� ����ϱ� ���� �޼��� �Ʒ� �޼��带 ����
	 * serverworker�� run�޼��忡�� ȣ���ؼ� ����Ѵ�.
	 */
	public void sendMessage(String message) {
		// list���������鼭 pw.println(list.get)
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
				System.out.println(clientIP + " ����� �����߻�" + e.getMessage());
			} finally {
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					// list���� ���� ��ü�� �����Ѵ�
					list.remove(this);
					sendMessage(clientIP + "���� �����̽��ϴ�.");
				}
			}
		}

		public void chatting() throws IOException {
			clientIP = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			sendMessage(clientIP + "���� �����ϼ̽��ϴ�.");
			while (true) {
				String message = br.readLine();
				if (message == null || message.trim().equalsIgnoreCase("exit"))
					break;
				sendMessage(clientIP + " ��: " + message);
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
