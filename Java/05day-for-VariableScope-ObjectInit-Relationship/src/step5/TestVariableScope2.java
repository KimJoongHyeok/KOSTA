package step5;

public class TestVariableScope2 {
	public static void main(String[] args) {
		//sp 는 참조변수(reference variable)이자 지역변수(local variable) ->stack memory 영역에 저장
		SmartPhone sp = new SmartPhone();
		System.out.println(sp.getModel()); // null
		System.out.println(sp.getPrice());
	}
}
