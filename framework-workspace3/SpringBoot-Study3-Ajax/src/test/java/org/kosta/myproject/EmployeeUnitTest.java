package org.kosta.myproject;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.kosta.myproject.model.domain.DepartmentDTO;
import org.kosta.myproject.model.domain.EmployeeDTO;
import org.kosta.myproject.model.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeUnitTest {

	@Autowired
	EmployeeMapper employeeMapper;
	
	@Test
	void findEmployeeListByDeptNo() {
		System.out.println(employeeMapper.findEmployeeListByDeptNo(10));
	}
	
	@Test
	void findEmployeeListDynamicSQL() {
		/*
		 * MyBatis Dynamic SQL 활용
		 * 1. 부서번호와 사원명이 없을때는 전체 조회
		 * 2. 부서번호만 있으면 부서번호로 조회
		 * 3. 사원명만 있으면 사원명으로 조회
		 * 4. 부서번호와 사원명이 있으면 두 조건으로 조회
		 */
		
		// 1번 테스트
		//EmployeeDTO employeeDTO = new EmployeeDTO();
		
		// 2번 테스트
		/*
		EmployeeDTO employeeDTO = new EmployeeDTO();
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDeptNo(20);
		employeeDTO.setDepartmentDTO(departmentDTO);
		*/
		
		// 3번 테스트ㄷ
		/*
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEname("유");
		*/
		
		//4번 테스트
		EmployeeDTO employeeDTO = new EmployeeDTO();
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDeptNo(10);
		employeeDTO.setEname("유");
		employeeDTO.setDepartmentDTO(departmentDTO);
		
		List<EmployeeDTO>list = employeeMapper.findEmployeeListDynamicSQL(employeeDTO);
		for(EmployeeDTO dto:list) {
			System.out.println(dto);
		}
	}
	
}
