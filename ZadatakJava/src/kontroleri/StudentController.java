package kontroleri;

import app.view.AddingDialog;
import app.view.MainFrame;
import modeli.Student;
import modeli.StudentBaza;

public class StudentController{

	private static StudentController instance = null;

	public static StudentController getInstance() {
		if (instance == null) {
			instance = new StudentController();
		}
		return instance;
	}

	private StudentController() {}

	public void dodajStudenta() {    //ODRADI OVE METODE
		// izmena modela
		StudentBaza.getInstance().dodajStudenta(AddingDialog.dodavanje().get(0),AddingDialog.dodavanje().get(1),AddingDialog.dodavanje().get(2),AddingDialog.dodavanje().get(3),AddingDialog.dodavanje().get(4),AddingDialog.dodavanje().get(5),AddingDialog.dodavanje().get(6),AddingDialog.dodavanje().get(7),AddingDialog.dodavanje().get(8),AddingDialog.dodavanje().get(9),AddingDialog.dodavanje().get(10),AddingDialog.dodavanje().get(11));
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("DODAT", -1);
	}

	public void izbrisiStudenta(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		// izmena modela
		Student student = StudentBaza.getInstance().getRow(rowSelectedIndex);
		StudentBaza.getInstance().izbrisiStudenta(student.getBr_indexa());
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("UKLONJEN", rowSelectedIndex);
	}

	public void izmeniStudenta(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		// izmena modela
		//Student student = StudentBaza.getInstance().getRow(rowSelectedIndex);
		//StudentBaza.getInstance().izmeniStudenta();
		// TODO: izmena dodatnih polja modela tabele

		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz(null, -1);
	}




}
