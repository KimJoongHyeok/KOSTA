package step2;
//final java keyword ���� �׽�Ʈ
class FinalEX{
	final String ADMIN_ID = "java";
	public void test() {
		//�Ʒ��� ������ ���� ,final �� ����̹Ƿ� ���Ҵ� �Ұ�
		//ADMIN_ID = "spring";
	}
	public final void test2() {
		
	}
}
class SubFinalEX extends FinalEX{
	//�������̵带 �õ�
	//public void test2() {} //�θ��� final �޼���� �������̵� �Ұ� compile error
}
final class FinalEX2{}
// class SubFinalEx2 extends FinalEX2{} //final class �� ��� �Ұ�
public class TestFinal {
	public static void main(String[] args) {
		
	}
}
