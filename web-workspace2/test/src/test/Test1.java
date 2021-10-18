package test;

class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        int fight_count = weights.length;
        int[]win = new int[weights.length];
        for(int i = 0;i<fight_count;i++){
            int win_count = 0;
            for(int j = 0;j<fight_count;j++){
                if(head2head[i].charAt(j) == 'W')
                    win_count++;
            }
            win[i] = win_count;
            //System.out.println(win[i]);
        }
        for(int i = 0;i<fight_count;i++) {
        	
        }
        return answer;
    }
}

public class Test1 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] weights = {50,82,75,120};
		String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};
		s.solution(weights, head2head);
	}
}

