package step1;

public class TestRefArrayReview {
	public static void main(String[] args) {
		ItemVO []items = {
				  new ItemVO("1","진라면",1000),
				  new ItemVO("2","짜파게티",1600),
				  new ItemVO("3","비빔냉면",800)
			}; 
		//vo = ValueObject
		ItemService service = new ItemService();
		service.printNameAll(items);
		
		System.out.println("******************");
		
		int price = 1200; //price 미만의 items 의 name 과 price를 출력
		service.printNameAndPriceByPrice(items,price);
		
	}

}
