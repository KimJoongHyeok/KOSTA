package step5;

public class TestIf {
	public static void main(String[] args) {
		int age = -20;
		if(age > 19) { //조건문에서 중괄호는 여러라인일때 필수적이고 실행문이 한라인이면 생략가능
			System.out.println(age + "세 성인입니다.");
		}
		else if(age > 0){
			System.out.println(age + "세 미성년자입니다.");
		}else {
			System.out.println("잘못된 입력값입니다.");
		}
	}
}
