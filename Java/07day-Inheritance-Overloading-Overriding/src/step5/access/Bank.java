package step5.access;
//���� ������ �׽�Ʈ������ Ŭ���� , protected ���� �����ڸ� Ȯ���غ���.
public class Bank {
	public void publicTest(){
		System.out.println("public method");
	}
	protected void protectedTest() {
		System.out.println("protected method");
	}
	void defaultest() {
		System.out.println("defaultest");
	}
	/*
	 * private void privateTest() { System.out.println("prrivateTest"); }
	 */
}
