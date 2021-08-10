package step6.sollution;

public class Employee {
	private String EmpNo;
	private String Name;
	private int salary;

	public Employee(String EmpNo, String Name, int salary) {
		super();
		this.EmpNo = EmpNo;
		this.Name = Name;
		this.salary = salary;
	}

//	public void DetailInfo() {
//		// TODO Auto-generated method stub
//		System.out.print("empNo : " + EmpNo + " Name : " + Name + " salary : " + salary);
//	}
	
	public String DetailInfo() {
		return "empNo : " + EmpNo + " Name : " + Name + " salary : " + salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "empNo : " + EmpNo + " Name : " + Name + " salary : " + salary;
	}

	public String getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(String empNo) {
		EmpNo = empNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	 
}
