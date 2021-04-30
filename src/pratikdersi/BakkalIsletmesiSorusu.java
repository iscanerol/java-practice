package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalIsletmesiSorusu {
	/*
	 * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
	 * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
	 * 
	 * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)
	 * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
	 * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker 
	 * alýp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adým : getOrtalamaKazanc() adlý method ile ortlama kazancý alýn.
	 * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan aþaðýysa o günleri return yap.	
	 * */
	static List<String> gunler = new ArrayList<>();
	static List<Float> gunlukKazanclar = new ArrayList<>();
	static float toplamKazanc = 0;
	public static void main(String[] args) {
		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.add("Salý");
		gunler.add("Çarþamba");
		gunler.add("Perþembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		int gun = 0;
		Scanner scan = new Scanner(System.in);
		while(gun < 7) {
			System.out.println("Lütfen "+ gunler.get(gun) +" gününün kazancýný giriniz : ");
			float gunlukKazanc = scan.nextFloat();
			gunlukKazanclar.add(gunlukKazanc);
			toplamKazanc += gunlukKazanc;
			gun++; // 0 1 2 3 4 5 6
		}
		System.out.println("Günlük Kazançlar : " + gunlukKazanclar.toString());
		System.out.println("Toplam Kazanç : " +toplamKazanc);
		System.out.println("Ortalama Kazanç : " + ortalamaKazanc());
		System.out.println("Ortalamanýn Üstünde : " + ortalamaninUstundeKazanilanGunler());
		System.out.println("Ortalamanýn Altýnda : " + ortalamaninAltindaKazanilanGunler());
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