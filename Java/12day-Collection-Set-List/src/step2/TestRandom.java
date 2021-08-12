package step2;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//임의의 수를 발생시키기 위해 Random객체를 이용
		Random r = new Random();
		for(int i = 0;i<10;i++) {
			System.out.println(r.nextInt(3)); //범위 bound 를 3으로 주면 0 ~ 2 까지 랜덤한 수가 나온다
		}
		
	}
}
