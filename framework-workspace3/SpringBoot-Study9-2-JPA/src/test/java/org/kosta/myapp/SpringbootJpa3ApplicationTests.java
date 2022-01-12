package org.kosta.myapp;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myapp.repository.DepartmentRepository;
import org.kosta.myapp.repository.EmployeeRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJpa3ApplicationTests {
	@Resource
	EmployeeRepository employeeRepository;
	@Resource
	DepartmentRepository departmentRepository;
	@Test
	void contextLoads() {
		
		
		//부서등록 : 부서아이디 ( sequence ) 는 자동생성되는 지 확인
		//사원 등록 -> 사원 
		/*
		System.out.println("부서등록:"+departmentRepository.save(new Department("연구개발", "오리")));
	    System.out.println("부서등록:"+departmentRepository.save(new Department("기술영업", "강남")));
			
		System.out.println(employeeRepository.save(new Employee("아이유",new Department(1))));
		System.out.println(employeeRepository.save(new Employee("이택조",new Department(1))));	
		*/
		
		//사원수 조회 
	//    System.out.println("사원수:"+employeeRepository.count());
	    //부서수 조회
	//    System.out.println("부서수:"+departmentRepository.count());
	     
	     //부서리스트 
		//System.out.println(departmentRepository.findAll());
		//사원리스트
		//System.out.println(employeeRepository.findAll());	
		
		//개별 사원 조회 : join 결과를 확인해본다( Employee has a Department )
		//System.out.println(employeeRepository.findById(2));
		
		// JPQL : 플랫폼 독립적인 객체지향 쿼리 언어
		// JPA에서 사용할 수 있는 쿼리 언어, 엔티티 클래스를 이용해 작성 
		//System.out.println(employeeRepository.findEmployeeOuterJoin());
		/*
		List<Object[]> list=employeeRepository.findEmployeeOuterJoin();
		for(Object[] obj:list) {
			System.out.println(obj[0]+" "+obj[1]);
		}
		*/
		/*
		employeeRepository.findEmployeeOuterJoin().forEach((obj)->{			
			System.out.println(obj[0]+" "+obj[1]);
		});
		*/		
	}
	
}










