package org.kosta.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.model.vo.DirectorVO;
import org.kosta.model.vo.MovieVO;

//현 인터페이스를 구현하는 proxy 객체를 생성화기 위한 아래 어노테이션을 명시한다
@Mapper
public interface MovieMapper {
	
	public void registerDirector(DirectorVO directorVO);
	public List<DirectorVO>getAllDirectorList();
	public void registerMovie(MovieVO movieVO);
	public List<MovieVO> getAllMovieList();
	public MovieVO findMovieAndDirectorVOById(int i);
	
}