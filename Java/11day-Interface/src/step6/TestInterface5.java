package step6;
interface OpenInterface{
	public abstract void a();	
	//public void b();
	//jdk 1.8이상에서는 default 메서드가 지원 - 유지보수성 차원
	public default void newMethod() {}
	public static void sMethod() {}
}
class KBbank implements OpenInterface {
	@Override
	public void a() {
		
	}
	
	@Override
	public void newMethod() {
		//디폴트 메서드 오버라이딩 가능
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
