package model;

import java.io.FileNotFoundException;
import java.io.IOException;

import view.ConsoleUI;

public class TestConsoleUI {
	public static void main(String[] args) {
		ConsoleUI UI = new ConsoleUI();
		try {
			UI.execute();
		} catch (DuplicateTelException e) {
			e.printStackTrace();
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}	
