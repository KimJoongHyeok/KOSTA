package test;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestIN {
	public static void main(String[] args) {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			/*
			 * s_employee 테이블에 저장된 사원 정보의 평균월급 salary 보다
			 * 직종별 평균 월급이 낮은 직종에 해당하는 사원 정보를 조회해서 list로 반환받아 출력
			 */
			ArrayList<EmployeeVO>list = dao.findEmployeeList();
			for(EmployeeVO vo :list)
				System.out.println(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
