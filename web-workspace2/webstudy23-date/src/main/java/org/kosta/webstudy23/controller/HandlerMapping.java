package org.kosta.webstudy23.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}
	/*
	 * Reflection API : 런타임시에 객체를 제어하기 위한 API
	 * Reflection API를 이용해 동적으로 컨트롤러 객체를 생성
	 */
	public Controller create(String command)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String packageInfo = this.getClass().getPackage().getName();
		//Controller controller = (Controller) Class.forName(packageInfo + "." + command).newInstance();
		String classInfo = new StringBuilder(packageInfo).append(".").append(command).toString();
		Controller controller = (Controller) Class.forName(classInfo).newInstance();
		return controller;
		//return (Controller) Class.forName(classInfo).newInstance();
	}
}
