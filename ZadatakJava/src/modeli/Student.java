package modeli;

public class Student {
	private String ime;
	private String prezime;
	private String datum_rodjenja;
	private String adresa_stanovanja;
	private String telefon;
	private String email;
	private String br_indexa;
	private String datum_upisa;
	private String trenutna_godina;
	private String status;
	private String pr_ocena;
	private String predmeti;

	public Student() {}

	public Student(String ime, String prezime, String datum_rodjenja, String adresa_stanovanja, String telefon, String email, String br_indexa,
			String datum_upisa, String trenutna_godina, String status, String pr_ocena, String predmeti) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datum_rodjenja = datum_rodjenja;
		this.adresa_stanovanja = adresa_stanovanja;
		this.telefon = telefon;
		this.email = email;
		this.br_indexa = br_indexa;
		this.datum_upisa = datum_upisa;
		this.trenutna_godina = trenutna_godina;
		this.status = status;
		this.pr_ocena = pr_ocena;
		this.predmeti = predmeti;
	}

	public String getAdresa_stanovanja() {
		return adresa_stanovanja;
	}

	public void setAdresa_stanovanja(String adresa_stanovanja) {
		this.adresa_stanovanja = adresa_stanovanja;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}
	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBr_indexa() {
		return br_indexa;
	}
	public void setBr_indexa(String br_indexa) {
		this.br_indexa = br_indexa;
	}
	public String getDatum_upisa() {
		return datum_upisa;
	}
	public void setDatum_upisa(String datum_upisa) {
		this.datum_upisa = datum_upisa;
	}
	public String getTrenutna_godina() {
		return trenutna_godina;
	}
	public void setTrenutna_godina(String trenutna_godina) {
		this.trenutna_godina = trenutna_godina;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPr_ocena() {
		return pr_ocena;
	}
	public void setPr_ocena(String pr_ocena) {
		this.pr_ocena = pr_ocena;
	}
	public String getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(String predmeti) {
		this.predmeti = predmeti;
	}
}
