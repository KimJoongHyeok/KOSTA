package step4;

public class Engineer extends Employee{
	private String skill;
	
	public Engineer(String empNo,String name,int salary,String skill) {
		super(empNo,name,salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	 
//	//�޼��� �������̵�
	
//	public String getDetails() {
//	return "empNo : " + super.getEmpNo() + " name : " + super.getName() + " salary : " + super.getSalary() + " skill : " + skill;
//}
	public String getDetails() {
		return super.getDetails() + " skill : " + skill;
	}

//	
	
}
