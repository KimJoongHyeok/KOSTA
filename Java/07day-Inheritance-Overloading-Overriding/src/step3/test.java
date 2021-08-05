package step3;
import java.util.*;

public class test {
	public static void main(String[] args) {
		int [] numbers = {1,2,1,3,4};
		int sum = 0;
		Arrays.sort(numbers);
		
		//11234
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i = 0;i<numbers.length-1;i++) {
			if(numbers[i] != numbers[i+1]) {
				list.add(numbers[i+1]);
			}
		}
		
		
		
		for(int i = 0;i<numbers.length;i++) {
			for(int j = i+1;j<numbers.length;j++) {
				sum = numbers[i] + numbers[j];
				list.add(sum);
			}
		}
		
		
		
	}
}

