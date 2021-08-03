package step3;

public class TestForLoop2 {
	public static void main(String[] args) {
		System.out.println("æ∆");
		System.out.println("¿Ã");
		System.out.println("\t∆“");
		int row = 3;
		int col = 5;
		
		for(int i = 0;i<row;i++) {
			for(int j = 1;j<=col;j++) {
				System.out.print(" " + j);
			}
			System.out.println("");
		}
	}
}
