
package step5;

public class Engineer extends Employee {
	private String Skill;

	public Engineer(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.Skill = skill;
	}

//	public void DetailInfo() {
//		// TODO Auto-generated method stub
//		super.DetailInfo();
//		System.out.print(" Skill : " + Skill);
//	}
	
	public String DetailInfo() {
		// TODO Auto-generated method stub
		return super.DetailInfo() + " Skill : " + Skill;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Skill : " + Skill;
	}

}
