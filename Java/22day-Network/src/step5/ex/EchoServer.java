package step5.ex;

import java.io.BufferedReader;
/*
 * Ŭ���̾�Ʈ�� ������ �����ص� ���۵� �� �ֵ��� step1������ ������Ʈ
 * ServerSocket ����
 * while(true){
 *   Socket socket = server.Socket.accept(); //Ŭ���̾�Ʈ�� ������ ������ �� �ֵ��� accept() �� �ݺ��ؼ� ����
 *   ��¼���
 *   close();
 * }
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void go() throws IOException {

		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			serverSocket = new ServerSocket(5432);
			socket = serverSocket.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			String clientIp = socket.getInetAddress().toString();
			System.out.println("**EchoSerer����**");
			System.out.println(clientIp + "���� �����ϼ̽��ϴ�.");
			while (true) {
				String message = br.readLine();
				if (message== null || message.equals("exit")) {
					System.out.println("EchoServer ����");
					break;
				}
				System.out.println(clientIp + "���� �޼���" + message);
				out.println(message + "server**");
			}
		} finally {
			if (br != null)
				br.close();
			if (out != null)
				out.close();
			if (socket != null)
				socket.close();
			if (serverSocket != null)
				serverSocket.close();

		}
	}

	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
