package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalIsletmesiSorusu {
	/*
	 * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program yaz�n�z.
	 * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
	 * 
	 * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)
	 * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
	 * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker 
	 * al�p gunlukKazanclar ArrayList'e ekle.
	 * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortlama kazanc� al�n.
	 * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun. 
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
	 * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun. 
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.	
	 * */
	static List<String> gunler = new ArrayList<>();
	static List<Float> gunlukKazanclar = new ArrayList<>();
	static float toplamKazanc = 0;
	public static void main(String[] args) {
		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.add("Sal�");
		gunler.add("�ar�amba");
		gunler.add("Per�embe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		int gun = 0;
		Scanner scan = new Scanner(System.in);
		while(gun < 7) {
			System.out.println("L�tfen "+ gunler.get(gun) +" g�n�n�n kazanc�n� giriniz : ");
			float gunlukKazanc = scan.nextFloat();
			gunlukKazanclar.add(gunlukKazanc);
			toplamKazanc += gunlukKazanc;
			gun++; // 0 1 2 3 4 5 6
		}
		System.out.println("G�nl�k Kazan�lar : " + gunlukKazanclar.toString());
		System.out.println("Toplam Kazan� : " +toplamKazanc);
		System.out.println("Ortalama Kazan� : " + ortalamaKazanc());
		System.out.println("Ortalaman�n �st�nde : " + ortalamaninUstundeKazanilanGunler());
		System.out.println("Ortalaman�n Alt�nda : " + ortalamaninAltindaKazanilanGunler());
	}
	private static float ortalamaKazanc() {
		return toplamKazanc / 7;
	}
	private static String ortalamaninUstundeKazanilanGunler() {
		String gun = "";
		for(int i = 0; i < gunlukKazanclar.size() ; i++) {
			if(gunlukKazanclar.get(i)  > ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}
		}
		return gun;
	}
	private static String ortalamaninAltindaKazanilanGunler() {
		String gun = "";
		for(int i = 0; i < gunlukKazanclar.size() ; i++) {
			if(gunlukKazanclar.get(i)  < ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}
		}
		return gun;
	}
}