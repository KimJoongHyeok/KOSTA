package step6;
interface OpenInterface{
	public abstract void a();	
	//public void b();
	//jdk 1.8�̻󿡼��� default �޼��尡 ���� - ���������� ����
	public default void newMethod() {}
	public static void sMethod() {}
}
class KBbank implements OpenInterface {
	@Override
	public void a() {
		
	}
	
	@Override
	public void newMethod() {
		//����Ʈ �޼��� �������̵� ����
		OpenInterface.super.newMethod();
	}
}
class KaKaobank implements OpenInterface {
	@Override
	public void a() {
		
	}
}

public class TestInterface5 {

}
