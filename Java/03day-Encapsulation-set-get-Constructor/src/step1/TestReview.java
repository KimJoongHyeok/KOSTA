package step1;

public class TestReview {
	public static void main(String[] args) {
		Market m =  new Market();
		System.out.println(m.name);
		m.name = "G����";
		System.out.println(m.name);
		String searchResult = m.searchProduct("���");
		System.out.println("�˻� ��� : " + searchResult);
	}
}
