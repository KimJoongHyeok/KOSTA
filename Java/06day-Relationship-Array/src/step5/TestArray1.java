package step5;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언
		int []age;
		//배열 생성
		age = new int[3];
		//배열 요소에 값을 할당
		age[0] = 22; //배열 인덱스는 0부터 시작
		age[1] = 18;
		age[2] = 26;
		
		//배열 요소를 출력
		System.out.println(age[2]);
		//배열 길이
		System.out.println(age.length);
		System.out.println("*****for loop 를 이용해 age 배열 모든 요소를 출력************");
		
		for(int i = 0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	}

}
