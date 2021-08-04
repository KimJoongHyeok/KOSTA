package step6;

public class TestRefArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person 배열의 선언,생성,할당 동시에
		//pa 참조변수의 데이터 타입은 Person[] 배열 타입이다.
		
		Person[] pa = {
			new Person("아이유",30),
			new Person("강하늘",34),
			new Person("이강인",20)
		};
		
		int age = 25;
		//pa 배열 요소 중 나이가 변수 age 를 초과하는 요소의 name을 출력
		
		for(int i = 0;i<pa.length;i++) {
			if(pa[i].getAge() > age) {
				System.out.println(pa[i].getName() + " " + pa[i].getAge());
			}
		}
		System.out.println("***************");
		int num = 10;
		
		//pa 배열의 모든 요소의 age를 num만큼 증가시킨다
		for(int i = 0;i<pa.length;i++) {
			pa[i].setAge(pa[i].getAge()+num);
			System.out.println(pa[i].getName() + " " + pa[i].getAge());
		}
		
		
		//
		
	}

}
