

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ReviewServer {
	public void go() throws IOException  {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ReviewServer**");
			while(true) {
				//대기하다 클라이언트가 접속하면 동작된다
				//리턴되는 Socket은 개별 클라이언트와 대화할 상담원 전화기
				Socket socket = serverSocket.accept();
				String clientIP = socket.getInetAddress().toString();
				System.out.println(clientIP + "님이 접속했습니다.");
				//true는 autoflush : buffer에 있는 데이터를 즉시 출력
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				out.println(clientIP + "님 즐거운 금요일 입니다.");
				out.close();
				socket.close();
			}
			
		}finally {
			if(serverSocket!=null)
			serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new ReviewServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
