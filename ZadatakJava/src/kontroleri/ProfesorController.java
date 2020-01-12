package kontroleri;

import app.view.AddingDialogProfesor;
import app.view.MainFrame;
import modeli.Profesor;
import modeli.ProfesorBaza;

public class ProfesorController {

	private static ProfesorController instance = null;

	public static ProfesorController getInstance() {
		if (instance == null) {
			instance = new ProfesorController();
		}
		return instance;
	}

	private ProfesorController() {}

	public void dodajProfesora() {    //ODRADI OVE METODE
		// izmena modela
		ProfesorBaza.getInstance().dodajProfesora(AddingDialogProfesor.dodavanje().get(0),AddingDialogProfesor.dodavanje().get(1),AddingDialogProfesor.dodavanje().get(2),AddingDialogProfesor.dodavanje().get(3),AddingDialogProfesor.dodavanje().get(4),AddingDialogProfesor.dodavanje().get(5),AddingDialogProfesor.dodavanje().get(6),AddingDialogProfesor.dodavanje().get(7),AddingDialogProfesor.dodavanje().get(8),AddingDialogProfesor.dodavanje().get(9),AddingDialogProfesor.dodavanje().get(10));
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikazProfesora("DODAT", -1);
	}

	public void izbrisiProfesora(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		// izmena modela
		Profesor profesor = ProfesorBaza.getInstance().getRow(rowSelectedIndex);
		ProfesorBaza.getInstance().izbrisiProfesora(profesor.getBr_lkarte());
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("UKLONJEN", rowSelectedIndex);
	}

	public void izmeniProfesora(int rowSelectedIndex) {
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
