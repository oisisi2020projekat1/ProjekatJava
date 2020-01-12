package main;

import modeli.StudentBaza;
import app.view.MainFrame;
import kontroleri.StudentController;
import modeli.ProfesorBaza;
import kontroleri.ProfesorController;

public class MainApp {

	public static void main(String[] args) {
		StudentBaza.getInstance();
		StudentController.getInstance();

		ProfesorBaza.getInstance();
		ProfesorController.getInstance();

		MainFrame.getInstance();


	}

}
