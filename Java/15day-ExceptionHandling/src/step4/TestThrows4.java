package step4;

public class TestThrows4 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		//date.day=44; //private �̹Ƿ� compile error
		try {
		//1~31�� ���� ���� - ���� �帧
		//date.setDay(1);
		//1~31�� �ƴ� ���� ���� - ���� �帧 �׽�Ʈ
			date.setDay(33);
			System.out.println(date.getDay());
		}catch(DayException de) {
			//1�� �̻� 31�� ������ ���� �Ҵ� ����
			System.out.println(de.getMessage());
		}
	}
}
