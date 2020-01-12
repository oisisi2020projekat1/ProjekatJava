package modeli;

public class Predmet {
	private String sifra_predmeta;
	private String naziv_predmeta;
	private String semestar;
	private String godina_izvodjenja;
	private String pr_profesor;


	public Predmet(String sifra_predmeta, String naziv_predmeta, String semestar, String godina_izvodjenja,
			String pr_profesor) {
		super();
		this.sifra_predmeta = sifra_predmeta;
		this.naziv_predmeta = naziv_predmeta;
		this.semestar = semestar;
		this.godina_izvodjenja = godina_izvodjenja;
		this.pr_profesor = pr_profesor;

	}

	public String getSifra_predmeta() {
		return sifra_predmeta;
	}

	public void setSifra_predmeta(String sifra_predmeta) {
		this.sifra_predmeta = sifra_predmeta;
	}

	public String getNaziv_predmeta() {
		return naziv_predmeta;
	}

	public void setNaziv_predmeta(String naziv_predmeta) {
		this.naziv_predmeta = naziv_predmeta;
	}

	public String getSemestar() {
		return semestar;
	}

	public void setSemestar(String semestar) {
		this.semestar = semestar;
	}

	public String getGodina_izvodjenja() {
		return godina_izvodjenja;
	}

	public void setGodina_izvodjenja(String godina_izvodjenja) {
		this.godina_izvodjenja = godina_izvodjenja;
	}

	public String getPr_profesor() {
		return pr_profesor;
	}

	public void setPr_profesor(String pr_profesor) {
		this.pr_profesor = pr_profesor;
	}



}
