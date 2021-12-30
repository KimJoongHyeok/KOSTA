package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.dto.EmployeeDTO;

@Mapper
public interface EmployeeMapper {
	public List<EmployeeDTO> findEmployeeListByDeptNo(int deptNo);

	public List<EmployeeDTO> findEmployeeListDynamicSQL(EmployeeDTO employeeDTO);

	public int getTotalEmployeeCount();
}
