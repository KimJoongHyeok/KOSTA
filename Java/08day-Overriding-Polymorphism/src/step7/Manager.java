package step7;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	
	@Override //어노테이션 -> 의미있는 주석 , 컴파일과 런타임시 영향을 준다.
			  //컴파일시에 오버라이드 문법을 체크해준다.
	public String toString() {
		return super.toString() + " department : " + department;
	}

	
}
