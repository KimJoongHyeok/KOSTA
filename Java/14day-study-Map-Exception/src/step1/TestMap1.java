package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		//map은 key와 value 쌍으로 저장
		
		map.put("a", "아이유");
		map.put("b", "박보검");
		System.out.println(map.size());
		System.out.println(map);
		//key를 이용한 value 검색
		System.out.println(map.get("b"));
		//기존에 존재하는 key로 map에 추가 
		map.put("a", "이효리"); //key는 유일해야 하므로 value가 업데이트
		System.out.println(map.size()); //2
		System.out.println(map);
		System.out.println(map.get("a"));
		map.put("c", "박보검");
		System.out.println(map);
		//key의 존재 유무를 확인해본다
		System.out.println(map.containsKey("a")); //존재하면 true, 존재하지 안흐면 false
		System.out.println(map.containsKey("f")); //존재하면 true, 존재하지 안흐면 false
		//key를 이용해 삭제, 삭제한 대상 정보가 반환
		System.out.println(map.remove("b"));
		System.out.println(map.remove("r")); //삭제요소가 없으면 null 반환
		
		map.put("k", "손흥민");
		map.put("t", "이강인");
		//map에 존재하는 key들을 반환
		System.out.println("**map에서 key들만 출력**");
		Set<String> set = map.keySet();
		//Iterator interface : java.util.Collection 하위의 모든 구현체 요소를 반복, 열거할 수 있는 방법을 제공
		Iterator<String>it = set.iterator();
		while(it.hasNext()) { //요소가 존재할떄 까지 true반환
			System.out.println(it.next()); //요소를 반환
		}
		System.out.println("**map에서 value들만 출력**");
		Collection<String> col = map.values();
		Iterator<String>it2 = col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
	}
}
