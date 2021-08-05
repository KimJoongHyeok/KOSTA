package step7;

class Person{
	String name = "사람이름";
	
}
class Student extends Person{
	String name = "학생이름"; // 에러는 안남
	public void test() {
		System.out.println(name + " " + super.name); //super키워드로 부모에 접근해 출력
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.test();
		
	}
}
