package org.kosta.myproject.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.model.dto.DepartmentDTO;

@Mapper
public interface DepartmentMapper {

	int getTotalDepartmentCount();

	List<DepartmentDTO> getDepartmentList();

}
