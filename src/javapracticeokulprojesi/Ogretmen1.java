package javapracticeokulprojesi;

public class Ogretmen1 {
	private String isim, brans, telefon;
	public Ogretmen1(String isim, String brans, String telefon) {
		this.isim = isim;
		this.brans = brans;
		this.telefon = telefon;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
}