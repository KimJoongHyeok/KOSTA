package step5.test;

import step5.access.Bank; //ctrl + shift + o

public class KostaBank extends Bank{	
	public void test() {
		publicTest(); 
		protectedTest(); //다른 패키지이지만 상속받았으므로 protected method 접근가능
	}
	
}
