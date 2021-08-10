package step1;
class Fish{
	int count;
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}
public class TestStatic3 {
	public static void main(String[] args) {
		Fish f1 = new Fish();
		System.out.println(f1.count); //1
		System.out.println(Fish.sCount);
		Fish f2 = new Fish();
		System.out.println(f2.count); //1
		System.out.println(Fish.sCount);
		Fish f3 = new Fish();
		System.out.println(f3.count); //1 이유는 객체 생성시 heap 영역에 별도로 객체 생성되어 count는 매번 새롭게 0 -> 1 로 메모리에 저장
		System.out.println(Fish.sCount); // 3 이유는 class loading 시에 단 한번 meta space 영역에 static sCount의 메모리가 적재되고 값이 업데이트됨
	}
}
