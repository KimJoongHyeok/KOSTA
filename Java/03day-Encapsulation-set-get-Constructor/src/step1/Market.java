package step1; //package : 클래스들을 디렉토리별로 분류하여 관리


//public : 가장 넓은 범위 접근 제어자
public class Market {

	/*
	 * 인스턴스 변수 instance variable
	 * String 
	 * */
	String name;
	
	public String searchProduct(String a) {
		System.out.println("DB에서 정보를 조회..");
		return name + " : " + a + "상품 검색 결과 -> 진라면, 신라면";
	}
	
}
