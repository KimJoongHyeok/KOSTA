package test;

import java.util.List;
import java.util.Map;

import org.kosta.model.HumanResourceMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatisMapper {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
		HumanResourceMapper rm = (HumanResourceMapper) ctx.getBean("humanResourceMapper");
		//1. 부서정보를 map 으로 반환받는 테스트
		/*
		List<Map<String,Object>>list = rm.getAllDepartmentList();
		System.out.println(list);
		*/
		//2. inner join 연습
		/*
		int empno = 1;
		Map<String,String>map = rm.findEmployeeAndDeptByeEmpNO(empno);
		if(map == null) {
			System.out.println(empno + " 사원번호에 해당하는 사원이 없습니다.");
		}else {
			System.out.println(map.get("ENAME")+" "+map.get("DNAME")+" "+map.get("LOC"));
		}
		*/
		//3. 전체 사원리스트를 조회 ( 사원이 속한 부서정보도 포함, 사원이 없는 부서정보도 조회 )
		//Map의 value 값이 Object 인 이유 : db값이 varchar2도 있고 number도 있기 때문
		/*
		List<Map<String,Object>>list = rm.findEmployeeAndDeptListOuterJoin();
		for(Map<String,Object>map:list)
			System.out.println(map.get("EMPNO")+" "+map.get("ENAME")+" "+map.get("DEPTNO")+" "+map.get("DNAME"));
		*/
		//4. group by,inline view ,join를 이용 
		/*
		List<Map<String,Object>>list = rm.getEmpGroupByDeptno();
		for(Map<String,Object>m :list)
			System.out.println(m.get("DEPTNO")+"번 부서 "+m.get("DNAME")+" 사원 수 "+m.get("EMP_COUNT"));
		*/
		/*
		 * 실행결과는 아래와 같다
		 * 20번 부서 해양수산 사원수 1명
		 * 10번 부서 전략기획 사원수 2명 
		 */
		//5.group by,inline view,outer join 을 이용
		List<Map<String,Object>>list = rm.getEmpGroupByDeptnoVer2();
		for(Map<String,Object>m :list)
			System.out.println(m.get("DEPTNO")+"번 부서 "+m.get("DNAME")+" 사원 수 "+m.get("EMP_COUNT"));
		
		ctx.close();
	}
	public static void printInfo(List<Map<String,Object>> list) {
		for(Map<String,Object> m:list) {
			System.out.println(m);
		}
	}
}
