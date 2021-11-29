package test;

import org.kosta.model.mapper.MovieMapper;
import org.kosta.model.vo.DirectorVO;
import org.kosta.model.vo.MovieVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//movie table에 영화정보를 등록하는 예제(영화 정보등록시 감독아이디도 함꼐 등록)
//MovieVO has a DirectorVO를 MyBatis로 처리하는 예제
public class TestSpringMyBatis2 {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		
		MovieMapper mapper = (MovieMapper)ctx.getBean("movieMapper");
		//영화 정보를 등록
//		DirectorVO directorVO = new DirectorVO();
//		directorVO.setDirectorId(1); //감독아이디를 할당
//		MovieVO movieVO = new MovieVO();
//		movieVO.setTitle("기생충");
//		movieVO.setGenre("코미디");
//		movieVO.setAttendance(1000);
//		movieVO.setDirectorVO(directorVO);
		DirectorVO directorVO = new DirectorVO();
		directorVO.setDirectorId(2); //감독아이디를 할당
		MovieVO movieVO = new MovieVO();
		movieVO.setTitle("다른영화");
		movieVO.setGenre("다른장르");
		movieVO.setAttendance(2000);
		movieVO.setDirectorVO(directorVO);
		mapper.registerMovie(movieVO);
		System.out.println(movieVO + "등록완료");
		
		ctx.close();
	}
}
