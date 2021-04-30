package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RastgeleIsimOlusturma {
	/*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
	 *  1. Adým : Kullanýcýdan ismini isteyelim
	 *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
	 *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
	 *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý,
	 *   kullanýcýnýn girdiði isim olsun.
	 *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim,
	 *   ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name = scan.nextLine().replace(" " , "");
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		if(veritabanindakiKullaniciListesi.contains(name)) {
			System.out.println("bu kullanici adi alinmis");
		}else {
			System.out.println("bu kullanici adi uygun!");
		}
		if(veritabanindakiKullaniciListesi.contains(name)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = name + rastgeleSayi;
			System.out.println("YENÝ KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YENÝ KULLANICI ADINIZ : " + name);
		}
		scan.close();
	}
}