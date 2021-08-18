package step4;

public class TestThrows4 {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		//date.day=44; //private 이므로 compile error
		try {
		//1~31인 값을 전달 - 정상 흐름
		//date.setDay(1);
		//1~31이 아닌 값을 전달 - 예외 흐름 테스트
			date.setDay(33);
			System.out.println(date.getDay());
		}catch(DayException de) {
			//1일 이상 31일 이하의 값만 할당 가능
			System.out.println(de.getMessage());
		}
	}
}
