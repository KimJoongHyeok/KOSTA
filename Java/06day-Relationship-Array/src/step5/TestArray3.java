package step5;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언,생성,할당 동시에
		int price[] = {	200,300,100,2000,1200}; //배열 length 5인 배열 객체를 생성하고 요소에 값을 할당
		int money = 500;
		
		//price 배열 요소 중 money 를 초과하는 배열요소의 price만 모두 출력한다.
		//for 안에서 if문을 이용하면 된다.
		for(int i = 0;i<price.length;i++) {
			if(price[i] > money) {
				System.out.println(price[i]);
			}
		}
		
	}
}
