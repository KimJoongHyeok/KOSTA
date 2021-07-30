package step4;

public class KostaMember {
	private String id;
	private String password;
	
	public void setId(String id) {
		//this는 현재 객체를 가르킨다. this.id는 인스턴스 변수 id이고 id는 매개변수 id이다.
		//매개변수 id와 인스턴스 변수id를 구분하기 위해 this 자바 키워드를 사용한다
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}
