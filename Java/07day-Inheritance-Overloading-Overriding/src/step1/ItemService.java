package step1;

//Service : 비즈니스 로직을 정의한 클래스(Object)
public class ItemService {
	// 매개변수로 전달된 인자값이 items 배열이므로 데이터 타입은 ItemVO[]여야한다
	// items 배열 요소 아이템의 name을 모두 출력한다.
	// DAO = Data Access Object

	public void printNameAll(ItemVO[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].getName());
		}
	}

	public void printNameAndPriceByPrice(ItemVO[] items, int price) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getPrice() < price) {
				System.out.println(items[i].getName());
			}
		}
	}
}
