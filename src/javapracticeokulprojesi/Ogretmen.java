package javapracticeokulprojesi;

public class Ogretmen {
	private String isim, brans, telefon;
	// Arrays.toString();
	public Ogretmen() {
	}	
	@Override
	public String toString() {
		return "Ogretmen isim=" + isim + ", brans=" + brans + ", telefon=" + telefon;
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