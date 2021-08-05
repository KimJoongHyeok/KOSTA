package step8;

class GrandParent{//extends Object -> 상속관계가 없는 클래스는 extends Object 가 자동삽입, 모든 클래스는 java.lang.object 의 자손
					//super() 가 자동삽입 -> 모든 자바 클래스의 root or 최상위 클래스인 Object의 생성자를 호출해 Object 객체를 생성
	GrandParent(){
		System.out.println("GrandParent 객체 생성");
	}
}

class Parent extends GrandParent{ 	
	Parent(){
		//super(); -> 
		System.out.println("Parent 객체 생성");
	}
}

class Child extends Parent{
	Child(){
		super(); //없으면 자동으로 삽입됨
		System.out.println("Child 객체 생성");
		//super(); -> 오류(생성자에서 첫번쨰 문장에 와야함)
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		new Child(); //객체를 만듬, 자식 객체를 생성하면 부모객체 -> 자식객체 순으로 생성된다.
		
//		Child c = new Parent(); //오류
//		Child cp = new Child();
//		Parent p = new Child(); //정상
	}
}
