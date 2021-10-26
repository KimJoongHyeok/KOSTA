package org.kosta.webstudy28.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}

	public Controller create(String command)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String packageInfo = this.getClass().getPackage().getName();
		String classInfo = new StringBuilder(packageInfo).append(".").append(command).toString(); //org.kosta.webstudy27.controller.find
		Controller controller = (Controller) Class.forName(classInfo).newInstance();
		return controller;
	}
}
