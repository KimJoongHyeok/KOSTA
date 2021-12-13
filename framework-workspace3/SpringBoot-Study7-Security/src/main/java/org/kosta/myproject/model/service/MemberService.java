package org.kosta.myproject.model.service;

import java.util.List;

import org.kosta.myproject.model.domain.Authority;
import org.kosta.myproject.model.domain.MemberDTO;

public interface MemberService {
	
	MemberDTO findMemberById(String id);

	List<String> getAddressList();

	List<MemberDTO> findMemberListByAddress(String address);

	int getMemberCount();

	void updateMember(MemberDTO vo);

	void registerMember(MemberDTO vo);

	String idcheck(String id);
	
	List<Authority> findAuthorityByUsername(String username);
}
