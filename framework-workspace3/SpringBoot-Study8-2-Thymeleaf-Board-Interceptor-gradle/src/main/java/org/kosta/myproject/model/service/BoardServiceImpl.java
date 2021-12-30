package org.kosta.myproject.model.service;

import javax.annotation.Resource;

import org.kosta.myproject.model.mapper.BoardMapper;
import org.kosta.myproject.model.vo.ListVO;
import org.kosta.myproject.model.vo.PostVO;
import org.springframework.stereotype.Service;
// 비즈니스 또는 서비스 계층 ( 트랜잭션 처리 )
@Service
public class BoardServiceImpl implements BoardService {
	@Resource
	private BoardMapper boardMapper;
	@Override
	public ListVO getPostList() {
		return getPostList("1");
	}
	@Override
	public ListVO getPostList(String pageNo) {
		int postTotalCount=boardMapper.getTotalPostCount();
		PagingBean pagingBean=null;
		if(pageNo==null)
			pagingBean=new PagingBean(postTotalCount);
		else	
			pagingBean=new PagingBean(postTotalCount,Integer.parseInt(pageNo));
		ListVO listVO=new ListVO(boardMapper.getPostList(pagingBean),pagingBean);
		return listVO;
	}
	@Override
	public void write(PostVO postVO) {
		boardMapper.write(postVO);
	}
	@Override
	public PostVO findDetailPostByNo(int no) {
		return boardMapper.getPostDetail(no);
	}
	@Override
	public void updateHits(int no) {
		boardMapper.updateHits(no);
	}
	@Override
	public void deletePost(int no) {
		boardMapper.deletePost(no);
	}
	@Override
	public void updatePost(PostVO pvo) {
		boardMapper.updatePost(pvo);
	}
}























