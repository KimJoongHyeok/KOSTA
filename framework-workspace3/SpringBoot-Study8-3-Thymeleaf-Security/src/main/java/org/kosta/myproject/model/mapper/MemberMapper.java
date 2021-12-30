package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.vo.Authority;
import org.kosta.myproject.model.vo.MemberVO;
@Mapper
public interface MemberMapper {

	MemberVO findMemberById(String id);

	List<String> getAddressList();

	List<MemberVO> findMemberListByAddress(String address);	

	int getMemberCount();

	void updateMember(MemberVO vo);

	void registerMember(MemberVO vo);

	int idcheck(String id);

	List<Authority> findAuthorityByUsername(String username);

	void registerRole(Authority authority);

}