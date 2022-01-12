package org.kosta.myapp.repository;

import java.util.List;

import org.kosta.myapp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	List<Department> findAllByOrderByDepartmentIdDesc();
	
}
