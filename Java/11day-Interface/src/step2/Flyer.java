package step2;

public interface Flyer {
	String ID = "javaking"; //public static final 상수로 자동 인식
	//아래는 compile error, 인터페니슨 ㄴ구현된 메서드를 가질 수 없다
	//public void test();1{}
	public void fly(); //abstract를 명시하지 않아도 abstract method로 자동 인식
	
}
