package org.kosta.myproject;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myproject.model.domain.DepartmentDTO;
import org.kosta.myproject.model.mapper.DepartmentMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DepartmentUnitTest {
	@Resource
	DepartmentMapper departmentMapper;

	@Test
	void contextLoads() {
		System.out.println(departmentMapper);
	}
	
	@Test
	void getDepartmentList() {
		List<DepartmentDTO>list = departmentMapper.getDepartmentList();
		for(DepartmentDTO dto:list) {
			System.out.println(dto);
		}
	}
	
	

}
