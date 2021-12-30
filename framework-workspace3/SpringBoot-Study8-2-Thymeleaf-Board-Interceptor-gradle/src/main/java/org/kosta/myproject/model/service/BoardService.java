package org.kosta.myproject.model.service;

import org.kosta.myproject.model.vo.ListVO;
import org.kosta.myproject.model.vo.PostVO;

public interface BoardService {

	ListVO getPostList();

	ListVO getPostList(String pageNo);

	void write(PostVO postVO);

	PostVO findDetailPostByNo(int no);

	void updateHits(int no);

	void deletePost(int no);

	void updatePost(PostVO pvo);

}





