package org.kosta.myproject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.kosta.myproject.model.service.BoardService;
import org.kosta.myproject.model.vo.ListVO;
import org.kosta.myproject.model.vo.MemberVO;
import org.kosta.myproject.model.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootThymeleafStudyBoardApplicationTests {
	@Autowired
	BoardService boardService;
	@Test
	void contextLoads() {
	}
	@Test
	void write() {
		MemberVO mvo1=new MemberVO("java",null,null,null);
		MemberVO mvo2=new MemberVO("spring",null,null,null);
		for(int i=0;i<23;i++) {			
			boardService.write(new PostVO("테스트","게시판공부",mvo1));
			boardService.write(new PostVO("테스트","게시판공부",mvo2));
		}
		System.out.println("게시글 등록 완료");
	}
	
	@Test
	void getPostList() {
		//paging test
				System.out.println("**1 page test**");
				ListVO lvo=boardService.getPostList();
				for(PostVO vo:lvo.getList()) {
					System.out.println(vo);
				}
				System.out.println("**2 page test**");
				ListVO lvo2=boardService.getPostList("2");
				List<PostVO> list= lvo2.getList();
				for(PostVO vo:list) {
					System.out.println(vo);
				}
	}
}
