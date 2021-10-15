package org.kosta.webstudy21.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	
	public Controller create(String command) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Controller controller = (Controller) Class.forName(this.getClass().getPackage().getName() + "." + command).newInstance();
		//String classInfo = new StringBuilder(this.getClass().getPackage().getName().append(".").append(command).toString);
		//return (Controller) Class.forName(classInfo).newInstance();
		return controller;
	}
}
