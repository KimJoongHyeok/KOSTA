package step1.review; //1.package
//2.import
//필요시 다른 패키지의 자원을 이용하고자 할 때는 import가 필요
//import java.util.ArrayList;

//3.class
public class Person{
	//4.instance variable
	private String name;
	//5.Constructor
	public Person(String name) {
		this.name = name;
	}
	//6.method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
