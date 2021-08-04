package step4;

public class Student {
	private String name;
	private String StuId;
	
	public Student(String name,String StuId) {
		this.name = name;
		this.StuId = StuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuId() {
		return StuId;
	}

	public void setStuId(String stuId) {
		StuId = stuId;
	}
	
}
