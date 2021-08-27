package step6.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable {
	private Socket socket;
	private String clientIp;

	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
		clientIp = socket.getInetAddress().toString();
	}

	@Override
	public void run() {
		System.out.println(clientIp + "���� �����ϼ̽��ϴ�.");
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(clientIp + "���� �����ϼ̽��ϴ�.");
	}

	public void echo() throws IOException {
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("exit")) {
					break;
				}
				System.out.println("Ŭ���̾�Ʈ ���� ���� �޼��� : " + message);
				out.println(message + "*server*");
			}
		} finally {
			if (br != null)
				br.close();
			if (out != null)
				out.close();
			if (socket != null) // �Ϲ������� socket�� �������ָ� �ٸ� ���α׷��� ���� �����
				socket.close();
		}
	}
}
