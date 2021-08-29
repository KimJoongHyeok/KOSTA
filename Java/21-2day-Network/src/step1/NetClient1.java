package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;


public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		
		Socket socket = new Socket(IP.LOCAL,5432);
		System.out.println("**NetClient1 �� ������ ������**");
		
		//8bit(1byte) ��Ʈ���� 16bit ��Ʈ������ ��ȯ
		//InpugStreamReadeer : 8bit(1byte) ��Ʈ��(����Ʈ��Ʈ��)�� 16bit(���ڽ�Ʈ��)��Ʈ������ ��ȯ
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		//16bit�� ��ȯ�� ir�� BufferedReader�� �������ڷ� �Է�
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("������ ���� �޼��� : " + message);
		br.close();
		socket.close();
		System.out.println("**NetClient ����**");
	}
	public static void main(String[] args) {
		NetClient1 client = new NetClient1();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








