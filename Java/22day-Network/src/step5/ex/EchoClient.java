package step5.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * ������ �����Ͽ� �ֿܼ� �Է��� ������ 
 * ������ ���
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		Scanner sc = null;
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			sc = new Scanner(System.in);
			socket = new Socket(IP.INST, 5432);
			out = new PrintWriter(socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("**EchoClient ����**");
			while (true) {
				System.out.println("������ ���� �޼���");
				String message = sc.nextLine();
				out.println(message);
				if (message.equals("exit")) {
					System.out.println("EchoClient ����");
					break;
				}
				System.out.println("�������� �Է¹��� �޼��� : " + br.readLine());
			}
		} finally {
			if (br != null)
				br.close();
			if (out != null)
				out.close();
			if (sc != null)
				sc.close();
			if (socket != null) {
				socket.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
