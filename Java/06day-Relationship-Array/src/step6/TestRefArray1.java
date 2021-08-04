package step6;

public class TestRefArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조형 데이터를 저장하는 배열
		//배열 선언
		Person [] pa;
		//배열 생성
		pa = new Person[3];
		//배열 요소 할당
		System.out.println(pa[0]); //참조형 데이터의 기본 초기화값은 null
		pa[0] = new Person("아이유",30);
		pa[1] = new Person("강하늘",34);
		pa[2] = new Person("이강인",20);
		//배열 첫번째 요소의 name을 반환받아 출력
		System.out.println(pa[0].getName());
		System.out.println("**pa 배열의 모든 요소의 name과 age를 출력");
		
		for(int i = 0;i<pa.length;i++) {
			System.out.println(pa[i].getName() + " " + pa[i].getAge());
		}
		
	}

}
