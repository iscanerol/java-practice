package varmisinyokmusun;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Bilgiler {
	static List<String> isimler = new ArrayList<>();
	public static void main(String[] args) {
		isimler.add("Ramazan");
		isimler.add("�brahim");
		isimler.add("�skender");
		isimler.add("Ali");
		System.out.println(isimler.toString());
		// ArrayList'in i�erisindeki verileri rastgele olarak s�raya koyar.
		Collections.shuffle(isimler);
		System.out.println(isimler.toString());
		// ArrayList ile obje tutma.
		List<Kutu> kutular = new ArrayList<>();
		Kutu kutu = new Kutu();
		kutular.add(kutu);
		// Override i�lemi
		Child childNesnesi = new Child();
		System.out.println(childNesnesi.toString());
		childNesnesi.parentIsimYazdir();
	}
}