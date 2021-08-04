package step2;

public class TestAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SmartPhone sp = new SmartPhone("갤럭시 20",120);
			//System.out.println(sp.getModel() + " " + sp.getPrice());
			
			Customer c = new Customer("코코");
			c.setSmartPhone(sp);
			System.out.println(c.getName());
			//코코고객의 스마트폰 모델명을 반환받아 출력해본다.
			System.out.println(c.getSmartPhone().getModel());
			//코코 고객의 스마트폰 가격을 반환받아 출력해본다
			System.out.println(c.getSmartPhone().getPrice());
			System.out.println("******************");
			
			Customer c2 = new Customer("배니");
			c2.setSmartPhone(new SmartPhone("아이폰 9",200));
			//c2 즉 배니 고객의 스마트폰 모델명을 반환받아 출력
			System.out.println(c2.getSmartPhone().getModel());
			System.out.println(c2.getSmartPhone().getPrice());
			//customer2 고객의 스마트폰 model 명을 iphone11로 변경
			c2.getSmartPhone().setModel("아이폰11");
			System.out.println(c2.getSmartPhone().getModel());
			
	}

}
