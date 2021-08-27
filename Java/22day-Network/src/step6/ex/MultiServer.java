package step6.ex;

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

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 		�ϳ��� ������ ���������� ������ �����ϸ鼭 �ټ��� Ŭ���̾�Ʈ���� ���� �ϱ� ���ؼ���
		���ΰԽ� ������ ��������� Thread�� �̿��ؾ� �Ѵ�.
		(ex) �ݼ��Ϳ��� �ټ��� ���� ���ÿ� ��㼭�񽺸� �ϱ� ���� ������ �ټ� ä���ؾ� �ϴ°Ͱ� ����)
	
		MultiServer ������ Ŭ���̾�Ʈ ������ ����ϴٰ� �����ϸ� �ش� Ŭ���̾�Ʈ�� ����ϱ� ����
		Socket(��ȭ��)�� ��ȯ�޾� ServerWorker(����) ��ü �����ÿ� �Ҵ��ϰ�
		Thread�� ������ start ��Ų��. ( �̸� �ݺ� )
		
		Runnable Interface�� ������ ServerWorker �� �Ҵ���� ��������
		Ŭ���̾�Ʈ�� �޾Ƹ� ���񽺸� �����Ѵ�.
 */

public class MultiServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**Multi Server ����**");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker sw = new ServerWorker(socket);
				Thread t = new Thread(sw);
				t.start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
