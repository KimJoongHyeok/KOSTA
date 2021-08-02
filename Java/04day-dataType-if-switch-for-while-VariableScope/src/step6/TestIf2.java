package step6;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate d = new MyDate();
		d.setMonth(8);
		System.out.println(d.getMonth());
		System.out.println("*************");
		MyDate d2 = new MyDate();
		//month 는 1~12사이의 값이어야 한다
		d2.setMonth(13);
		System.out.println(d2.getMonth());
	}
}
