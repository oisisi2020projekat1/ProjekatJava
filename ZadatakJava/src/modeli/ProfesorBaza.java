package modeli;

import java.util.ArrayList;
import java.util.List;



public class ProfesorBaza {

	private static ProfesorBaza instance = null;

	public static ProfesorBaza getInstance() {
		if (instance == null) {
			instance = new ProfesorBaza();
		}
		return instance;
	}


	private List<Profesor> profesori;
	private List<String> kolone;



	private ProfesorBaza() {


		initStudente();

		this.kolone = new ArrayList<String>();
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("DATUM RODJENJA");
		this.kolone.add("ADRESA STANOVANJA");
		this.kolone.add("BROJ TELEFONA");
		this.kolone.add("EMAIL");
		this.kolone.add("KANCELARIJA");
		this.kolone.add("BROJ LICNE KARTE");
		this.kolone.add("TITULA");
		this.kolone.add("ZVANJE");
		this.kolone.add("PREDMETI");


	}


	private void initStudente() {   // DODAJ STUDENTE SA PARAMETRIMA
		this.profesori = new ArrayList<Profesor>();
		profesori.add(new Profesor("Aleksa","Petkovic","15.01.1965.","Temerinska 15, Novi Sad",	"021/334-990",	"aleksa.petkovic@mailinator.com","Dositeja Obradovica 6, Novi Sad, MI 105","007198721","Prof. dr",	"Redovni profesor",""));
		profesori.add(new Profesor("Jana","Lazarevic","25.02.1963.","Jovana Cvijica 26, Novi Sad","021/435-891","jana.lazarevic@mailinator.com","Dositeja Obradovica 6, Novi Sad, Nastavni blok 206",	"008431903","Prof. dr","Redovni profesor",""));
		profesori.add(new Profesor("Nadja","Aleksic","23.03.1973.","Gunduliceva 75, Novi Sad","021/730-172","nadja.aleksic@mailinator.com",	"Dositeja Obradovica 6, Novi Sad, NTP 307",	"005671007","Dr","Vanredni profesor",""));
		profesori.add(new Profesor("Djordje","Spasojevic","24.08.1978.","Sekspirova 44, Novi Sad","021/514-893","djordje.spasojevic@mailinator.com","Dositeja Obradovica 6, Novi Sad, MI 118",	"009999331","Dr","Vanredni profesor",""));
		profesori.add(new Profesor("Elena",	"Milenkovic","08.11.1985.","Tolstojeva 52, Novi Sad","021/834-901","elena.milenkovic@mailinator.com","Dositeja Obradovica 6, Novi Sad, Nastavni blok 217","003330976","Dr",	"Docent",""));
		profesori.add(new Profesor("Teodor","Mladenovic","14.12.1983.",	"Jovana Subotica 33, Novi Sad",	"021/441-007",	"teodor.mladenovic@mailinator.com",	"Dositeja Obradovica 6, Novi Sad, NTP M35",	"007441998","Dr","Docent",""));

	}







	//

	public List<Profesor> getProfesori() {
		return profesori;
	}

	public void setProfesori(List<Profesor> profesori) {
		this.profesori = profesori;
	}

	public int getColumnCount() {
		return 11;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Profesor profesor = this.profesori.get(row);
		switch (column) {
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2:
			return profesor.getDatum_rodjenja();
		case 3:
			return profesor.getAdresa();
		case 4:
			return profesor.getTelefon();
		case 5:
			return profesor.getEmail();
		case 6:
			return profesor.getAdresa_kancelarije();
		case 7:
			return profesor.getBr_lkarte();
		case 8:
			return profesor.getTitula();
		case 9:
			return profesor.getZvanje();
		case 10:
			return profesor.getPredmeti();
		default:
			return null;
		}
	}

	public void dodajProfesora(String ime, String prezime, String datum_rodjenja, String adresa, String telefon, String email, String adresa_kancelarije, String br_lkarte,
			String titula, String zvanje, String predmeti) {
		this.profesori.add(new Profesor(ime, prezime, datum_rodjenja, adresa, telefon, email, adresa_kancelarije,br_lkarte, titula, zvanje, predmeti));

	}

	public void izbrisiProfesora(String br_lkarte) {
		for (Profesor i : profesori) {
			if (i.getBr_lkarte() == br_lkarte) {
				profesori.remove(i);
				break;
			}
		}
	}

	public void izmeniProfesora(String ime, String prezime, String datum_rodjenja, String adresa, String telefon, String br_lkarte,
			String titula, String zvanje, String predmeti) {
		for (Profesor i : profesori) {
			if (i.getBr_lkarte() == br_lkarte) {
				i.setIme(ime);
				i.setPrezime(prezime);
				i.setDatum_rodjenja(datum_rodjenja);
				i.setAdresa(adresa);
				i.setTelefon(telefon);
				i.setBr_lkarte(br_lkarte);
				i.setTitula(titula);
				i.setZvanje(zvanje);
				i.setPredmeti(predmeti);

			}
		}
	}








}
