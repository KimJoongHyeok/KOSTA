package step5.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter out = null;
		try {
			serversocket = new ServerSocket(5432);
			System.out.println("**EchoServer 실행**");
			socket = serversocket.accept();
			String clientIp = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			
			while(true) {
				String message = br.readLine();
				System.out.println(clientIp + " 님이 보낸 메세지 : " + message);
				if(message.equals("exit")) {
					System.out.println("**EchoServer를 종료합니다**");
					break;
				}
				out.println(message);
			}
			
		}finally {
			if(socket!=null)
				socket.close();
			if(serversocket!=null)
				serversocket.close();
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
