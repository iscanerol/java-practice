package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RastgeleIsimOlusturma {
	/*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
	 *  1. Ad�m : Kullan�c�dan ismini isteyelim
	 *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
	 *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
	 *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�,
	 *   kullan�c�n�n girdi�i isim olsun.
	 *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim,
	 *   ve g�sterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name = scan.nextLine().replace(" " , "");
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		if(veritabanindakiKullaniciListesi.contains(name)) {
			System.out.println("bu kullanici adi alinmis");
		}else {
			System.out.println("bu kullanici adi uygun!");
		}
		if(veritabanindakiKullaniciListesi.contains(name)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = name + rastgeleSayi;
			System.out.println("YEN� KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YEN� KULLANICI ADINIZ : " + name);
		}
		scan.close();
	}
}