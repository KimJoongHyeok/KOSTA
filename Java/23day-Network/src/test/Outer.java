package test;

import java.util.ArrayList;

public class Outer {
	private int money = 100;
	private ArrayList<Inner>list = new ArrayList<Inner>();
	public void writeTest() {
		list.add(new Inner());
		list.add(new Inner());
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).writer);
			//Inner의 private member에 직접 접근해 사용
		}
	}
	public class Inner{
		private String writer = "출력";
		public void test() {
			//Nested (Inner) class 는 Outer class의 private member 에 직접 접근 가능
			System.out.println(money);
		}
	}
}
