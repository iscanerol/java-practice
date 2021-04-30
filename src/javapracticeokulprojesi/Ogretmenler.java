package javapracticeokulprojesi;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {
	
	private List<Ogretmen> ogretmenler = new ArrayList<>();
	public Ogretmenler() {
	}
	public void ogretmenEkle(Ogretmen ogretmen) {
		ogretmenler.add(ogretmen);
	}
	public int ogretmenSayisi() {
		return ogretmenler.size();
	}
	@Override
	public String toString() {
		return "Ogretmenler [ogretmenler=" + ogretmenler + "]";
	}
}






