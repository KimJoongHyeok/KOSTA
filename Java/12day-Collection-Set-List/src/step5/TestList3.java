package step5;
import java.util.ArrayList;

//DTO : Data Transfer Object , VO : Value Object , DAO : Data Access Object
//Generic을 적용한 List의 예
public class TestList3 {
	public static void main(String[] args) {
		ArrayList<FriendDTO> list = new ArrayList<FriendDTO>();
		list.add(new FriendDTO("아이유", 100));
		list.add(new FriendDTO("박보검", 200));
		list.add(new FriendDTO("강하늘", 50));
		// list.add("ㅎㅎㅎ"); //-> Generic에 명시된 타입이 아니므로 compile error
		//list요소중 index가 1인 요소의 name을 출력
		//Generic이 적용되었으므로 별도의 casting은 필요없다.
		System.out.println(list.get(1).getName());
		//for문을 이용해 요소의 getMoney()를 호출해 money 출력
		//별도의 캐스팅 작업 필요없음
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getMoney());
		}

	}
}
