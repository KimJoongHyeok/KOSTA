package step5;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언, 생성 동시에
		int salary[] = new int[4];
		salary[0] = 400;
		salary[1] = 500;
		salary[2] = 700;
		salary[3] = 600;
		
		int totalsalary = 0;
		
		for(int i = 0;i<salary.length;i++) {
			totalsalary += salary[i];
		}
		System.out.println("totalsalry : " + totalsalary);
	}

}
