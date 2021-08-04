package step5;

public class TestArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 저장하는 배열 선언,생성,할당 동시에
		String []food = {"고기국수","참이슬","테라"}; //length 가 3인 문자열 타입의 배열을 생성하고 초기화
		for(int i = 0;i<food.length;i++) { //실행문이 한라인이면 {} 생략가능
			System.out.println(food[i]);
		}

	}

}
