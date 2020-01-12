package kontroleri;

import app.view.AddingDialogPredmet;
import app.view.MainFrame;
import modeli.Predmet;
import modeli.PredmetBaza;

public class PredmetController {

	private static PredmetController instance = null;

	public static PredmetController getInstance() {
		if (instance == null) {
			instance = new PredmetController();
		}
		return instance;
	}

	private PredmetController() {}

	public void dodajPredmet() {    //ODRADI OVE METODE
		// izmena modela
		PredmetBaza.getInstance().dodajPredmet(AddingDialogPredmet.dodavanje().get(0),AddingDialogPredmet.dodavanje().get(1),AddingDialogPredmet.dodavanje().get(2),AddingDialogPredmet.dodavanje().get(3),AddingDialogPredmet.dodavanje().get(4));
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikazPredmeta("DODAT", -1);
	}

	public void izbrisiPredmet(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		// izmena modela
		Predmet predmet = PredmetBaza.getInstance().getRow(rowSelectedIndex);
		PredmetBaza.getInstance().izbrisiPredmet(predmet.getSifra_predmeta());
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("UKLONJEN", rowSelectedIndex);
	}

	public void izmeniPredmet(int rowSelectedIndex) {
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
