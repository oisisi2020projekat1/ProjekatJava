package modeli;

import java.util.ArrayList;
import java.util.List;



public class PredmetBaza {

	private static PredmetBaza instance = null;

	public static PredmetBaza getInstance() {
		if (instance == null) {
			instance = new PredmetBaza();
		}
		return instance;
	}


	private List<Predmet> predmeti;
	private List<String> kolone;



	private PredmetBaza() {


		initPredmete();

		this.kolone = new ArrayList<String>();
		this.kolone.add("SIFRA");
		this.kolone.add("NAZIV PREDMETA");
		this.kolone.add("SEMESTAR");
		this.kolone.add("GODINA IZVODJENJA");
		this.kolone.add("PREDMETNI PROFESOR");

	}


	private void initPredmete() {   // DODAJ STUDENTE SA PARAMETRIMA
		this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("OP301","Osnove programiranja","1","1","007198721, Aleksa Petkovic"));
		predmeti.add(new Predmet("DM881","Diskretna matematika","3","2","008431903, Jana Lazarevic"));
		predmeti.add(new Predmet("PP007","Paralelno programiranje","5","3",	"005671007, Nadja Aleksic"));
		predmeti.add(new Predmet("RVP33","Racunarstvo visokih performansi","7","4",	"009999331, Djordje Spasojevic"));
		predmeti.add(new Predmet("JSD91","Jezici specificni za domen","8","4",""));
	}







	//

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

	public int getColumnCount() {
		return 5;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Predmet predmet = this.predmeti.get(row);
		switch (column) {
		case 0:
			return predmet.getSifra_predmeta();
		case 1:
			return predmet.getNaziv_predmeta();
		case 2:
			return predmet.getSemestar();
		case 3:
			return predmet.getGodina_izvodjenja();
		case 4:
			return predmet.getPr_profesor();
		default:
			return null;
		}
	}

	public void dodajPredmet(String sifra_predmeta, String naziv_predmeta, String semestar, String godina_izvodjenja, String pr_profesor) {
		this.predmeti.add(new Predmet(sifra_predmeta, naziv_predmeta, semestar, godina_izvodjenja, pr_profesor));

	}

	public void izbrisiPredmet(String sifra_predmeta) {
		for (Predmet i : predmeti) {
			if (i.getSifra_predmeta() == sifra_predmeta) {
				predmeti.remove(i);
				break;
			}
		}
	}

	public void izmeniProfesora(String sifra_predmeta, String naziv_predmeta, String semestar, String godina_izvodjenja, String pr_profesor) {
		for (Predmet i : predmeti) {
			if (i.getSifra_predmeta() == sifra_predmeta) {
				i.setSifra_predmeta(sifra_predmeta);
				i.setNaziv_predmeta(naziv_predmeta);
				i.setSemestar(semestar);
				i.setGodina_izvodjenja(godina_izvodjenja);
				i.setPr_profesor(pr_profesor);

			}
		}
	}








}
