package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.service.PagingBean;
import org.kosta.myproject.model.vo.PostVO;
@Mapper
public interface BoardMapper {

	List<PostVO> getPostList(PagingBean pagingBean);

	int getTotalPostCount();

	void write(PostVO postVO);

	PostVO getPostDetail(int no);	
	
	void updateHits(int no);

	void updatePost(PostVO pvo);

	void deletePost(int no);
}


























