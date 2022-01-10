package org.kosta.myapp;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myapp.model.repository.MemberRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootStudy91JpaApplicationTests {
	@Resource
	private MemberRepository memberRepository;

	@Test
	void contextLoads() {

		/*
		 * JPA에서 기본으로 제공하는 메서드 테스트
		 * https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/
		 * data/jpa/repository/JpaRepository.html
		 */

		///////////////////////////////////////////
		// CRUD : Create , Read, Update, Delete
		//////////////////////////////////////////
         		
		System.out.println(memberRepository.getClass().getName());//Proxy 구현체가 실행 
		// CREATE -> insert : save
		// System.out.println(memberRepository.save(new Member("rest", "a", "레스트", "캐나다")));
		// System.out.println(memberRepository.save(new Member("jpa","a","이택조","제주")));

		// 회원수
		// System.out.println("회원수:"+memberRepository.count());

		// pk 존재유무
		// System.out.println("id 존재유무:"+memberRepository.existsById("jpa"));

		// READ -> select : findAll() 전체리스트 조회

		/*
		 * List<Member> list = memberRepository.findAll(); for (Member m : list)
		 * System.out.println(m);
		 */

		// pk로 검색

		/*
		 * Optional<Member> m = memberRepository.findById("rest"); if (m.isPresent()) {
		 * System.out.println(m); Member mem = m.get(); System.out.println(mem); }
		 */

		// 객체의 속성값을 변경해서 save 호출하면 update가 된다

		/*
		 * Member um = memberRepository.findById("jpa").get();
		 * System.out.println("update전:" + um); um.setName("김영남"); um.setAddress("수지");
		 * memberRepository.save(um); System.out.println("update후:" +
		 * memberRepository.findById("jpa"));
		 */

		// delete
		// memberRepository.deleteById("jpa");
		// System.out.println(memberRepository.findById("jpa").isPresent());

		/*
		 * 직접 정의한 메서드 테스트
		 */
		// System.out.println(memberRepository.findByName("레스트"));
		// System.out.println(memberRepository.findByAddress("캐나다"));
		// Like Test
		// System.out.println(memberRepository.findByNameLike("%스%"));
		// System.out.println(memberRepository.findByNameLikeAndAddressLike("%트%","%다%"));
	}

}
