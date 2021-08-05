package step2;

public class Test2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다차원 배열
		// 3년간 매월 강우량 저장 -> 2차원배열
		int[][] rain = new int[3][12];
		//첫해 첫월에 강우량 저장
		rain[0][0] = 100;
		//첫해 2월
		rain[0][1] = 120;
		//마지막해 12월
		rain[2][11] = 200;
		System.out.println(rain[2][11]);
		System.out.println("******************");
		//오리 중학교 1학년 3개반 2학년 5개반, 3학년 6개반
		int [][]school = new int[3][];
		school[0] = new int [3];
		school[1] = new int [5];
		school[2] = new int [6];
		
		int i = school.length-1;	//학년의 마지막 인덱스
		int j = school[i].length-1;
		System.out.println(j);
		
		school[i][j] = 20;
		System.out.println(school[2][5]);
		
	}

}
