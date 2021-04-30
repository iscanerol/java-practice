package javapracticeokulprojesi;

public class Ogrenci {
	private String isim;
	private int no;
	public Ogrenci() {
	}
	@Override
	public String toString() {
		return "Ýsim : " + isim + "\nNumara :" + no + "\n";
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}