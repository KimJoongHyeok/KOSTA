package step1;

public class TestReview {
	public static void main(String[] args) {
		Market m =  new Market();
		System.out.println(m.name);
		m.name = "G마켓";
		System.out.println(m.name);
		String searchResult = m.searchProduct("라면");
		System.out.println("검색 결과 : " + searchResult);
	}
}
