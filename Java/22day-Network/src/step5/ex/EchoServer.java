package step5.ex;

import java.io.BufferedReader;
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
			System.out.println("**EchoSerer실행**");
			System.out.println(clientIp + "님이 입장하셨습니다.");
			while (true) {
				String message = br.readLine();
				if (message== null || message.equals("exit")) {
					System.out.println("EchoServer 종료");
					break;
				}
				System.out.println(clientIp + "님의 메세지" + message);
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
