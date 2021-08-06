package step2;

public class Employee{ //extends Object --> java.lang.Object 는 모든 자바 클래스의 최상위 클래스
	private String empNo;
	private String name;
	private int salary;
	
	public Employee(String empNo,String name,int salary){
		super(); //Object class 의 생성자를 호출하여 객체 생성
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		salary = salary;
	}
	
	
	
}
