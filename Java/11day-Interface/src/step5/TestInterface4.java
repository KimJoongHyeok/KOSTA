package step5;
//한 눈에 문법 확인 위해 인터페이스와 여러 클래스를 하나의 파일에서 작성
class A{}
class B{}
// class C extends A,B{} //compile error , 자바는 단일 상속이므로 여러 클래스를 상속받을수 없다.

interface Ex1{
	public abstract void ex1();
}
interface Ex2{
	public abstract void ex2();
}
interface Ex3 extends Ex1,Ex2{ //자바는 단일 상속이지만 인터페이스는 다중 상속을 허용한다.( 추상 메서드 상속받는다. )
	public abstract void ex3();
}

//Ex3 인터페이스를 implements 하는 클래스는 상속받은 모든 추상 메서드를 구현해야 한다.
public class TestInterface4 implements Ex3{

	@Override
	public void ex1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ex2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ex3() {
		// TODO Auto-generated method stub
		
	}
	
}
