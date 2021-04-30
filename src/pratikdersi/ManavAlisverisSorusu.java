package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavAlisverisSorusu {
	/*
	 * Basit bir manav alışveriş programı yazınız.
	 *
	 * 1. Adým : Ürün listesinden ürün seçtir ve kaç kilo olduðunu sor.
	 * 2. Adým : Baþka bir ürün almak isteyip istemediğini sor.
	 * 			 İstemiyorsa toplam miktarı göster, istiyorsa tekrar ürün seçtir.
	 * 			 Bu iþlemi alıþveriþi bitirmek isteyene kadar tekrarla.
	 * 3. Adým : Müşteri her ürün seçtiğinde, aldığı ürünün fıyatını toplam fiyata ekle.
	 * 4. Adým : Alışveriş bitince toplam ödemesi gereken tutarı göster.
	 *
	 *
	 *	urunListesi.add("Domates - Urun Kodu : 0");
		urunListesi.add("Biber - Urun Kodu : 1");
		urunListesi.add("Erik - Urun Kodu : 2");
		urunListesi.add("Karpuz - Urun Kodu : 3");
		urunListesi.add("Havuç - Urun Kodu : 4");
		
		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(10.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);
	 *
	 * */
	static float toplamOdenecekTutar = 0;
	static List<String> urunListesi = new ArrayList<>();
	static List<Float> urunFiyatlari = new ArrayList<>();
	public static void main(String[] args) {
		 urunListesi.add("Domates - Urun Kodu : 0");
		 urunListesi.add("Biber - Urun Kodu : 1");
		 urunListesi.add("Erik - Urun Kodu : 2");
		 urunListesi.add("Karpuz - Urun Kodu : 3");
		 urunListesi.add("Havuç - Urun Kodu : 4");
		 urunFiyatlari.add(2.0f); /// 2.5 * 2 = 5
		 urunFiyatlari.add(3.0f);
		 urunFiyatlari.add(10.0f);
		 urunFiyatlari.add(5.0f);
		 urunFiyatlari.add(3.0f);
		 System.out.println(urunListesi.toString());
		 musteriyeNeSecmekIstedigiSor();
		 
	}
	private static void musteriyeNeSecmekIstedigiSor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi ürünü seçmek istersiniz : ");
		int secim = scan.nextInt(); // 2 - ERİK
		System.out.println("Kaç kilo almak istersiniz : ");
		float kilo = scan.nextFloat(); // 3 kilo
		float toplamUrunFiyati = urunFiyatlari.get(secim) * kilo; /// 3.0 * 3 = 9.0
		toplamOdenecekTutar += toplamUrunFiyati;  // 15.0
		System.out.println("Alışverişe devam etmek ister misiniz ? (0 = EVET     1 = HAYIR)");
		int devam = scan.nextInt();
		if(devam == 0) {
			musteriyeNeSecmekIstedigiSor();
		}else {
			kasayaGit();
		}
	}
	private static void kasayaGit() {
		System.out.println("Toplam Ödenecek Tutar : " + toplamOdenecekTutar);
	}
	
}