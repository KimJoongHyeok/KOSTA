package step8;

class GrandParent{//extends Object -> ��Ӱ��谡 ���� Ŭ������ extends Object �� �ڵ�����, ��� Ŭ������ java.lang.object �� �ڼ�
					//super() �� �ڵ����� -> ��� �ڹ� Ŭ������ root or �ֻ��� Ŭ������ Object�� �����ڸ� ȣ���� Object ��ü�� ����
	GrandParent(){
		System.out.println("GrandParent ��ü ����");
	}
}

class Parent extends GrandParent{ 	
	Parent(){
		//super(); -> 
		System.out.println("Parent ��ü ����");
	}
}

class Child extends Parent{
	Child(){
		super(); //������ �ڵ����� ���Ե�
		System.out.println("Child ��ü ����");
		//super(); -> ����(�����ڿ��� ù���� ���忡 �;���)
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		new Child(); //��ü�� ����, �ڽ� ��ü�� �����ϸ� �θ�ü -> �ڽİ�ü ������ �����ȴ�.
		
//		Child c = new Parent(); //����
//		Child cp = new Child();
//		Parent p = new Child(); //����
	}
}
