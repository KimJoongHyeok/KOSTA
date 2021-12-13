package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.domain.Authority;
import org.kosta.myproject.model.domain.MemberDTO;
@Mapper
public interface MemberMapper {

	MemberDTO findMemberById(String id);

	List<String> getAddressList();

	List<MemberDTO> findMemberListByAddress(String address);	

	int getMemberCount();

	void updateMember(MemberDTO vo);

	void registerMember(MemberDTO vo);

	int idcheck(String id);

	List<Authority> findAuthorityByUsername(String username);

	void registerRole(Authority authority);

}