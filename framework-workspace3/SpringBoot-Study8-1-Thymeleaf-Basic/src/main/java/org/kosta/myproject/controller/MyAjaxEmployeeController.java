package org.kosta.myproject.controller;

import java.util.List;

import org.kosta.myproject.model.dto.EmployeeDTO;
import org.kosta.myproject.model.mapper.DepartmentMapper;
import org.kosta.myproject.model.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyAjaxEmployeeController {
	private DepartmentMapper departmentMapper;
	private EmployeeMapper employeeMapper;
	@Autowired
	public MyAjaxEmployeeController(DepartmentMapper departmentMapper,EmployeeMapper employeeMapper) {
		super();
		this.departmentMapper = departmentMapper;
		this.employeeMapper=employeeMapper;
	}
	@GetMapping("getTotalEmployeeCount1")
	@ResponseBody
	public int getTotalEmployeeCount1() {
		return employeeMapper.getTotalEmployeeCount();
	}
	@GetMapping("getTotalEmployeeCount2")
	//@ResponseBody // thymeleaf를 이용한 ajax 응답시에는 해당 어노테이션을 명시하지 않는다 
	// 필요한 데이터는 model 객체에 저장하고 리턴값은 html 파일명 :: #id명 형식으로 하면 
	// model에 저장한 데이터를 이용해 thymeleaf ViewResolver가 html code로 응답한다 
	public String getTotalEmployeeCount2(Model model) {
		model.addAttribute("empCount", employeeMapper.getTotalEmployeeCount()+"");
		return "step11-ajax ::#empCountView2";
	}
	@GetMapping("employeeAjaxTestView")
	public String employeeAjaxTestView(Model model) {
		model.addAttribute("deptList", departmentMapper.getDepartmentList());
		return "step12-ajax";
	}
	@RequestMapping("findEmployeeListByDeptNo")
	@ResponseBody // ajax 응답 
	public List<EmployeeDTO> findEmployeeListByDeptNo(int deptNo) {
		return employeeMapper.findEmployeeListByDeptNo(deptNo);
	}
	@RequestMapping("findEmployeeListDynamicSQL")
	//@ResponseBody // 타임리프를 이용한 ajax 응답시 다음과 같은 방법으로 할 수 있다
	//@ResponseBody를 명시하지 않고 응답할 정보를 Model 에 공유한 후 
	//반환값에 "/페이지명 :: #id" 이런식으로 응답할 페이지 뒤에 갱신해주고자 하는 영역의 id값을 명시하면 
	// thymeleaf viewResolver가 필요한 html 구문 문자열을 생성해서 응답한다 
	public String findEmployeeListDynamicSQL(Model model,EmployeeDTO employeeDTO){
		List<EmployeeDTO> list=employeeMapper.findEmployeeListDynamicSQL(employeeDTO);
		model.addAttribute("empList",list);	
		return "step12-ajax ::#empListTbody";
	}
}


















