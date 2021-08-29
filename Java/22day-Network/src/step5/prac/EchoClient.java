package step5.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	public void go() throws IOException {
		Socket socket = null;
		Scanner sc = null;
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			socket = new Socket(IP.LOCAL,5432);
			sc = new Scanner(System.in);
			out = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("**EchoClient ����**");
			while(true) {
				System.out.print("������ ���� �޼��� : ");
				String message = sc.nextLine();
				if(message.equals("exit")) {
					System.out.println("**EchoClient ����**");
					break;
				}
				out.println(message);
				System.out.println("�������� ���� �޼��� : " + br.readLine());
			}
			
		}finally {
			if(br!=null)
				br.close();
			if(out!=null)
				out.close();
			if(sc!=null)
				sc.close();
			if(socket!=null)
				socket.close();
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
