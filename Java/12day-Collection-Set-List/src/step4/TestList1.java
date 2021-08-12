package step4;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("김밥");
		list.add("햄버거");
		list.add("짬뽕");
		list.add("김밥");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.remove(1)); //index 1의 요소를 삭제
		System.out.println(list);
		System.out.println("****************");
		//for 문으로 모든 요소를 출력 size()와 get()이용
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("수정 : " + list.set(2, "피자")); //출력되는 값은 수정 전 데이터,index 2에 해당하는 요소를 수정
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}
