package step3;

import step2.Airplane;
import step2.Bird;
import step2.Flyer;

public class TestInterface2 {
	public static void main(String[] args) {
		//하나의 객체가 다양한 인터페이스 타입의 변수로 참조 될 수 있다.
		Flyer f1 = new SuperMan();
		f1.fly();
		Fighter f2 = new SuperMan();
		f2.fight();
		System.out.println("***************");
		Flyer fa[] = {new Airplane(),new Bird(),new SuperMan()};
		//for loop
		for(int i = 0;i<fa.length;i++) {
			fa[i].fly();
		}
		
		/*
		 * 비행기가 날다
		 * 새가 날다
		 * 수퍼맨이 날다
		 * */
	}
}
