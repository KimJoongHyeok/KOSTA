
package step1;

public class Manager extends Employee {
	private String Department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.Department = department;
	}

//	public void DetailInfo() {
//		super.DetailInfo();
//		System.out.print(" Department : " + Department);
//	}
	
	public String DetailInfo() {
		return super.DetailInfo() + " Department : " + Department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Department : " + Department;
	}

}
