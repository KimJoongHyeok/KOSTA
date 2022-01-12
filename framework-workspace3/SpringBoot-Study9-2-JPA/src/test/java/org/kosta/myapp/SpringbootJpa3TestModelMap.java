package org.kosta.myapp;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.kosta.myapp.dto.DepartmentDTO;
import org.kosta.myapp.dto.EmployeeDTO;
import org.kosta.myapp.entity.Department;
import org.kosta.myapp.entity.Employee;
import org.kosta.myapp.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootJpa3TestModelMap {
	/*
	 * Entity : DB 테이블과 대응되는 모델링 클래스 테이블에 없는 필드를 가져서는 안됨
	 * 
	 * 
	 * DTO : Data Transfer Object 계층간 데이터 전송 역할
	 * 
	 * Entity 와 DTO로 역할을 분리하는 것이 바람직
	 * 
	 * View <-> Controller : DTO(Data Transfer Object)로 데이터 교환 Service <-->
	 * Repository : Entity 를 이용
	 * 
	 * 
	 * Entity가 변하면 db에 반영되고 다른 로직에 영향을 미침 예를 들면 API 서버와 사용자 시스템 사이에는 약속된 구조화된 데이터가
	 * 전송됨 만약 컨트롤러에서 Entity로 서비스를 할 경우 DB 변경 - Entity 변경 -> API Response 또한 변경된다 즉
	 * Entity 변경이 되면 명세화된 약속이 변경되는 구조다. 또한 View와 연동하면서 데이터 변경이 필요한 경우가 있으므로 ( Entity
	 * 를 변경하면 DB가 바뀔 수 있기 때문에 ) DTO와 Entity로 분리하는 것이 바람직
	 * 
	 * ​ ModelMapper : Entity 와 DTO를 자동 Mapping 하는 역할을 함
	 */
	@Resource
	EmployeeRepository employeeRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Test
	public void testModelMapper() {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentId(1);
		departmentDTO.setDname("개발");
		departmentDTO.setLocation("오리");
		// DTO 를 Entity로 변환
		Department departmentEntity = modelMapper.map(departmentDTO, Department.class);
		System.out.println(departmentEntity);
	}

	@Test
	public void findAllConvertModelMapper() {
		// employeeRepository.findAll().forEach(e->System.out.println(e));
		 List<Employee> entityList=employeeRepository.findAll();
		// Entity List를 DTO List로 변환
		 List<EmployeeDTO> dtoList = Arrays.asList(modelMapper.map(entityList,EmployeeDTO[].class));
		// 아래와 같은 방식으로도 가능
		/*
		List<EmployeeDTO> dtoList = employeeRepository.findAll().stream()
				.map(emp -> modelMapper.map(emp, EmployeeDTO.class)).collect(Collectors.toList());
		*/
		dtoList.forEach(dto -> System.out.println(dto));
	}
}
