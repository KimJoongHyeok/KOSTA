package step6;

public class Person extends Animal {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void printDetail() {
		//아래 age는 상속받았지만 부모 클래스에서 private으로 접근제어자로 선언되면 접근 불가
		System.out.println(name + " " + getAge());
	}
	
}
