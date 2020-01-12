package modeli;

import java.util.ArrayList;
import java.util.List;




public class StudentBaza {

	private static StudentBaza instance = null;

	public static StudentBaza getInstance() {
		if (instance == null) {
			instance = new StudentBaza();
		}
		return instance;
	}


	private List<Student> studenti;
	private List<String> kolone;



	private StudentBaza() {


		initStudente();

		this.kolone = new ArrayList<String>();
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("DATUM RODJENJA");
		this.kolone.add("ADRESA STANOVANJA");
		this.kolone.add("BROJ TELEFONA");
		this.kolone.add("EMAIL");
		this.kolone.add("BROJ INDEXA");
		this.kolone.add("DATUM UPISA");
		this.kolone.add("TRENUTNA GODINA");
		this.kolone.add("STATUS");
		this.kolone.add("PROSECNA OCENA");
		this.kolone.add("PREDMETI");


	}


	private void initStudente() {
		this.studenti = new ArrayList<Student>();
		studenti.add(new Student("Luka","Jovanovic","01.01.2000.", "Karadjordjeva 83, Novi Sad","021/333-555"	,"luka.jovanovic@mailinator.com","RA 1/2019","01.07.2019.","1","B", "",""));
		studenti.add(new Student("Sofija","Petrovic","16.05.2000.",	"Milosa Pocerca 55, Sabac",	"015/343-356","sofija.petrovic@mailinator.com","RA 5/2019","11.07.2019.","1","B","",""));
		studenti.add(new Student("Stefan","Nikolic","18.03.2000.","Knez Mihajlova 16, Beograd","011/9234-857","stefan.nikolic@mailinator.com",	"RA 3/2019","03.07.2019.","1","B","",""));
		studenti.add(new Student("Dunja","Ilic","11.11.2000.","Petefi Sandora 15, Novi Sad","021/433-958","dunja.ilic@mailinator.com","RA 2/2019","01.07.2019.","1","S","",""));
		studenti.add(new Student("Lazar","Djordjevic","03.12.2000.","Josip Broz Tito 13, Subotica","024/333-559","lazar.djordjevic@mailinator.com","RA 4/2019","06.07.2019.","1","S","",""));
		studenti.add(new Student("Sara","Pavlovic","03.12.1999.","Vojvode Misica 23, Sabac","015/313-061","sara.pavlovic@mailinator.com","RA 3/2018","01.07.2018.",	"2","B","",""));
		studenti.add(new Student("Vuk",	"Markovic","03.12.1999.","Temerinska 133, Novi Sad","021/351-091","vuk.markovic@mailinator.com","RA 15/2018","11.07.2018.",	"2","B","",""));
		studenti.add(new Student("Teodora",	"Popovic","03.12.1998.","Surepova 15, Sabac","015/324-500",	"teodora.popovic@mailinator.com","RA 133/2017",	"03.07.2017.","2","S","",""));
		studenti.add(new Student("Filip","Stojanovic","03.12.1998.","Francuska 113, Beograd","011/2333-900","filip.stojanovic@mailinator.com","RA 122/2017","02.07.2017.",	"2","S","",""));
		studenti.add(new Student("Ana","Zivkovic","03.12.1998.","Kralja Petra 20, Novi Sad","021/231-114","ana.zivkovic@mailinator.com","RA 201/2017","04.07.2017.","2","S","",""));
		studenti.add(new Student("Viktor","Jankovic","03.12.1998.","Gogoljeva 3, Novi Sad","021/135-463","viktor.jankovic@mailinator.com","RA 1/2017","01.07.2017.","3","B","",""));
		studenti.add(new Student("Petra","Todorovic","03.12.1998.","Njegoseva 2, Novi Sad","021/903-463","petra.todorovic@mailinator.com","RA 5/2017","12.07.2017.","3","B","",""));
		studenti.add(new Student("Andrej","Stankovic","03.12.1998.","Radoja Domanovica 5, Novi Sad","021/731-067","andrej.stankovic@mailinator.com","RA 33/2017","19.07.2017.","3","B","",""));
		studenti.add(new Student("Mila","Ristic","03.12.1997.","Vojvode Stepe 183, Beograd","011/4333-800","mila.ristic@mailinator.com","RA 152/2016","15.07.2016.","3","S","",""));
		studenti.add(new Student("Pavle","Kostic","03.12.1997.","Crnotravska 13, Beograd","011/3130-007","pavle.kostic@mailinator.com","RA 104/2016","06.07.2016.","3","S","",""));
		studenti.add(new Student("Lena","Kovacevic","03.12.1997.","Bulevar Oslobodjenja 143, Novi Sad",	"021/5333-801","lena.kovacevic@mailinator.com","RA 1/2016",	"01.07.2016.","4","B","",""));
		studenti.add(new Student("Filip","Zivkovic","03.12.1997.","1300 Kaplara, Sabac","015/333-500","filip.zivkovic@mailinator.com","RA 5/2016","21.07.2016.","4","B","",""));
		studenti.add(new Student("Tara","Dmiitrijevic","03.12.1996.","Milovana Glisica, Valjevo","014/303-007","tara.dimitrijevic@mailinator.com","RA 33/2015","23.07.2015.","4","S","",""));
		studenti.add(new Student("Vasilije","Micic","03.12.1996.","Vuka Karadzica, Loznica","015/101-909","vasilije.micic@mailinator.com","RA 102/2015","04.07.2015.","4","S","",""));
		studenti.add(new Student("Lenka","Jovic","03.12.1997.",	"Bulevar Mihajla Pupina, Novi Sad","021/431-500","lenka.jovic@mailinator.com","RA 244/2016","07.07.2016.","4","S","",""));



	}







	//

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return 12;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {  //objekat umesto stringa
		Student student = this.studenti.get(row);
		switch (column) {
		case 0:
			return student.getIme();
		case 1:
			return student.getPrezime();
		case 2:
			return student.getDatum_rodjenja();
		case 3:
			return student.getAdresa_stanovanja();
		case 4:
			return student.getTelefon();
		case 5:
			return student.getEmail();
		case 6:
			return student.getBr_indexa();
		case 7:
			return student.getDatum_upisa();
		case 8:
			return student.getTrenutna_godina();
		case 9:
			return student.getStatus();
		case 10:
			return student.getPr_ocena();
		case 11:
			return student.getPredmeti();
		default:
			return null;
		}
	}

	public void dodajStudenta(String ime, String prezime, String datum_rodjenja, String adresa_stanovanja, String telefon, String email, String br_indexa,
			String datum_upisa, String trenutna_godina, String status, String pr_ocena, String predmeti) {
		this.studenti.add(new Student(ime, prezime, datum_rodjenja, adresa_stanovanja, telefon, email, br_indexa, datum_upisa, trenutna_godina, status, pr_ocena, predmeti ));

	}

	public void izbrisiStudenta(String br_indexa) {
		for (Student i : studenti) {
			if (i.getBr_indexa() == br_indexa) {
				studenti.remove(i);
				break;
			}
		}
	}

	public void izmeniStudenta(String ime, String prezime, String datum_rodjenja, String adresa_stanovanja, String telefon, String email, String br_indexa,
			String datum_upisa, String trenutna_godina, String status, String pr_ocena, String predmeti) {
		for (Student i : studenti) {
			if (i.getBr_indexa() == br_indexa) {
				i.setIme(ime);
				i.setPrezime(prezime);
				i.setDatum_rodjenja(datum_rodjenja);
				i.setTelefon(telefon);
				i.setEmail(email);
				i.setBr_indexa(br_indexa);
				i.setDatum_upisa(datum_upisa);
				i.setTrenutna_godina(trenutna_godina);
				i.setStatus(status);
				i.setPr_ocena(pr_ocena);
				i.setPredmeti(predmeti);
			}
		}
	}








}
