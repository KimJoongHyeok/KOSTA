package step1;

public class TestRefArrayReview {
	public static void main(String[] args) {
		ItemVO []items = {
				  new ItemVO("1","�����",1000),
				  new ItemVO("2","¥�İ�Ƽ",1600),
				  new ItemVO("3","����ø�",800)
			}; 
		//vo = ValueObject
		ItemService service = new ItemService();
		service.printNameAll(items);
		
		System.out.println("******************");
		
		int price = 1200; //price �̸��� items �� name �� price�� ���
		service.printNameAndPriceByPrice(items,price);
		
	}

}
