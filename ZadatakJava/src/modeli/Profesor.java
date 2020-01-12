package modeli;

public class Profesor {

	private String ime;
	private String prezime;
	private String datum_rodjenja;
	private String adresa;
	private String telefon;
	private String br_lkarte;
	private String titula;
	private String zvanje;
	private String predmeti;
	private String email;
	private String adresa_kancelarije;

	public Profesor(String ime, String prezime, String datum_rodjenja, String adresa, String telefon,String email, String adresa_kancelarije, String br_lkarte,
			String titula, String zvanje, String predmeti) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datum_rodjenja = datum_rodjenja;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.adresa_kancelarije = adresa_kancelarije;
		this.br_lkarte = br_lkarte;
		this.titula = titula;
		this.zvanje = zvanje;
		this.predmeti = predmeti;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresa_kancelarije() {
		return adresa_kancelarije;
	}

	public void setAdresa_kancelarije(String adresa_kancelarije) {
		this.adresa_kancelarije = adresa_kancelarije;
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getBr_lkarte() {
		return br_lkarte;
	}

	public void setBr_lkarte(String br_lkarte) {
		this.br_lkarte = br_lkarte;
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public String getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(String predmeti) {
		this.predmeti = predmeti;
	}



}
