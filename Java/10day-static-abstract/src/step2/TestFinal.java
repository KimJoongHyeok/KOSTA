package step2;
//final java keyword 역할 테스트
class FinalEX{
	final String ADMIN_ID = "java";
	public void test() {
		//아래는 컴파일 에러 ,final 은 상수이므로 재할당 불가
		//ADMIN_ID = "spring";
	}
	public final void test2() {
		
	}
}
class SubFinalEX extends FinalEX{
	//오버라이드를 시도
	//public void test2() {} //부모의 final 메서드는 오버라이드 불가 compile error
}
final class FinalEX2{}
// class SubFinalEx2 extends FinalEX2{} //final class 는 상속 불가
public class TestFinal {
	public static void main(String[] args) {
		
	}
}
