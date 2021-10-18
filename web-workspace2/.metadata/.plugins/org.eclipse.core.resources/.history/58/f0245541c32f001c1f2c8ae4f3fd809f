package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;

/*
 * 컨트롤러 구현체 생성 전담 클래스
 *
 * 실제 컨트롤러 로직을 수행할 객체를 생성하는 클래스
 */
public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	/*//step4 version create 코드 
	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("findCustomerById"))
			controller = new FindCustomerByIdController();
		else if(command.equals("registerCustomer"))
			controller = new RegisterCustomerController();
		else if(command.equals("updateCustomer"))
			controller = new UpdateCustomerController();
		return controller;
	}*/
	
	public Controller create(String command) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//Controller controller = (Controller) Class.forName(this.getClass().getPackage().getName() + "." + command).newInstance();
		String classInfo = new StringBuilder(this.getClass().getPackage().getName()).append(".").append(command).toString();
		Controller controller = (Controller)Class.forName(classInfo).newInstance();
		return controller;
	}
	
}
