package pratikdersi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonRehberi {
	/*
	 * Basit bir telefon rehberi uygulamasý yazýnýz.
	 * 
	 * 1. Adým : Ýsim ve telefon numaralarýný HashMap ile tutunuz.
	 * 2. Adým : Kullanýcýya 1-Kiþi Ekle , 2-Kiþi Çýkar, 3-Rehberi Gör, 4-Çýkýþ seçenekleri sunalým.
	 * 3. Adým : Bu iþlem için while döngüsü kullanalým, 
	 * 			    kullanýcý 4- Çýkýþ'a týklayana kadar sürekli gösterelim.
	 * 
	 * Ýpucu : Numarayý long veri tipinde tutunuz.
	 * 
	 * 
	 * 	static Map<Long,String> rehber = new HashMap<>();
	 * 			   
	 * 			   0530 000 00 00 , Ayþe	
	 * */
	static Map<Long,String> rehber = new HashMap<>(); /// 0599 999 99 99  =  Ahmet
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean cikis = false;
		while(!cikis) { // cikis ==  false
			System.out.println("1-Kiþi Ekle , 2-Kiþi Çýkar, 3-Rehberi Gör, 4-Çýkýþ");
			System.out.println("Lütfen seçim yapýnýz : ");
			int secim = scan.nextInt();
			switch(secim) {
				case 1:
					kisiEkle();
					break;
				case 2:
					kisiCikar();
					break;	
				case 3:
					rehberiGor();
					break;
				case 4:
					cikis = true;
					break;	
				default:
					System.out.println("Yanlýþ Seçim Yaptýnýz");
					break;
			}
		}
		System.out.println("Çýkýþ yapýldý !");
	}
	private static void kisiCikar() {
		System.out.println("Lütfen silmek istediðiniz numarayý giriniz : ");
		long numara = scan.nextLong();
		if(rehber.get(numara) == null) {
			System.out.println("Böyle bir numara yok");
			if(rehber.size() > 0 )
				kisiCikar();
		} else {
			rehber.remove(numara);
			System.out.println("Kullanýcý baþarýyla silindi.");
		}
	}
	private static void kisiEkle() {
		System.out.println("Kiþi ismini giriniz : ");
		String isim = scan.next();
		System.out.println("Telefon no giriniz : ");
		long numara = scan.nextLong();
		rehber.put(numara, isim);
	}
	private static void rehberiGor() {
		if(rehber.size() < 1) {
			System.out.println("Rehber Boþ");
			return; /// method sona erer.
		}
		for( Long numara : rehber.keySet() ) {
			System.out.println(rehber.get(numara) + " : " + numara);
		}
	}
}