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
	 * SOCKET ���� ReceiverWorker ���� ,Thread ����, setDaemon(true),start(); �ַܼκ��� �Է¹���
	 * �޼����� ������ ����ϴ� ����� ���� (exit �� �Է��ϸ� ����)
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
			t.setDaemon(true); // �ڽ��� �����Ų thread �� ����Ǹ� �԰� ����ǵ��� ����
			t.start();
			// �ڽ��� �޼����� ������ ����ϴ� �۾� ����
			System.out.println("**Chat Client ����**");
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
			System.out.println("**Chat Client ����**");
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
