package step1;

public class TestPolymorphismEx {
	public static void main(String[] args) {
		//CompanyService 는 자신의 instance variable을 
		//10개의 length를 가진 배열로 선언하고 생성자에서 초기화한다  
		CompanyService service = new CompanyService(3);
		service.add(new Manager("12","아이유",500,"연구개발"));
		service.add(new Engineer("23","박보검",700,"java"));
		service.add(new Employee("35","강하늘",300));
		service.printAll();
		/*
		 	empNo:12 name:아이유 salary:500 department:연구개발 
		 	empNo:23 name:박보검 salary:700 skill:java
		 	empNo:35 name:강하늘 salary:300 
		 */
		//개발순서 : Employee , Manager, Engineer , CompanyService
		System.out.println("********add 완료***********");
		
		String empNo="23";
		Employee emp=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp);
		//empNo:23 name:박보검 salary:700 skill:java
		empNo="35";
		Employee emp2=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp2);
		//empNo:35 name:강하늘 salary:300
		empNo="99";
		Employee emp3=service.findEmployeeByEmpNo(empNo);
		System.out.println(emp3);
		//null 
		System.out.println("********find 완료***********");
		
		empNo = "88";
		int position = service.findPositionByEmpNo(empNo);
		System.out.println(position); //-1 존재하지않으면 -1반환
		
		empNo = "35";
		position = service.findPositionByEmpNo(empNo);
		System.out.println(position); //존재하면 사원번호가 일치하는 배열의 위치가 반환
		
		empNo = "99";
		service.deleteEmployeeByEmpNo(empNo);
		//존재하지않으면  사원번호에 해당하는 사원이 없어 삭제 불가
		empNo = "35";
		service.deleteEmployeeByEmpNo(empNo);
		service.printAll();
		System.out.println("**deleteEmployee 완료**");


		/*
		 * empNo:23 name:박보검 salary:700 skill:java
		   empNo:35 name:강하늘 salary:30
		 * */
		
	}
}













