package step4;

public class TestHasAEx {
	/*
	 * Has a 관계 : aggregation (집합) 관계를 연습해보는 예제
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School("코스타");
		System.out.println(s.getName());
		s.setStudent(new Student("아이유","21"));
		System.out.println(s.getStudent().getName());
		System.out.println(s.getStudent().getStuId());
	}

}
