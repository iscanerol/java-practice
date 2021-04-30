package pratikdersi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmUygulamasiSorusu {
	/*
	 * ATM uygulamasý yapýnýz.
	 * 
	 * 1. Adým : Bankamýzdaki müþterilerin musteriNumarasi ve 4 haneli þifresini tutan bir HashMap oluþturalým.
	 * 		     Ve þu müþterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Müþteri No  -- Þifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adým : Bankamýzdaki müþterilerin hesaplarýndaki para miktarini tutan bir tane HashMap oluþturalým.
	 * 		     Ve þu miktarlarý müþteri numarasýyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Müþteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adým : Giriþ ekraný oluþturalým. Müþteri buradan giriþ yapsýn.
	 * 			 Kullanýcý adý ve þifre isteyelim, doðru ise giriþ yapsýn.
	 * 
	 * 4. Adým : Doðru müþteri numarasý ve þifre kontrol eden methodlar yazalým.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, doðru müþteri numarasýdýr.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki þifre ile uyuþuyorsa doðru þifredir.
	 * 
	 * 5. Adým : Girþ yaptýktan sonra karþýsýna 3 tane seçenek çýksýn : 
	 * 			 Bunlarý da menuGoster() methodu ile yapalým.
	 * 			 1- Para Çek			// 300
	 * 			 2- Para Yükle			// 500 + 100
	 * 			 3- Toplam Paramý Gör	// 200
	 * 			 4- Çýkýþ Yap	
	 * 
	 * 6. Adým : Çýkýþ methodu oluþturalým.
	 * 			 Giriþ yapan müþteri çýkýþ yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sýfýrlayalým.
	 * 			 Tekrar giriþ ekranýna yöndendirelim.	
	 * 
	 * 6. Adým : Toplam parami gor methodu oluþturalým. toplamParamiGor()
	 * 			
	 * 7. Adým : 1- Para Çekme Methodu Oluþturalým
	 * 			 Hesaba giriþ yapan müþteriye hesabýndaki toplam parayý gösterelim.
	 * 			 Kullanýcýdan çekmek istediði tutarý öðrenelim.	
	 * 			 Hesabýnda yeterli para varsa, para çeksin yoksa uyarý verelim.
	 * 			 Çektiði tutarý, toplam parasýndan düþelim ve kaydedelim.		
	 *			 Baþka iþlem yapmak isteyip istemediðini soralým, isterse yaptýralým, yoksa çýkýþ iþlemi gerçekleþtirelim.
	 * 		  
	 * 8. Adým : 1- Para Yükleme Methodu Oluþturalým
	 * 			 Hesaba giriþ yapan müþteriye hesabýndaki toplam parayý gösterelim.
	 * 			 Kullanýcýdan yüklemek istediði tutarý öðrenelim.	
	 * 			 Yüklediði tutarý, toplam parasýna ekleyelim ve gösterelim.
	 * 			 Baþka iþlem yapmak isteyip istemediðini soralým, isterse yaptýralým, yoksa çýkýþ iþlemi gerçekleþtirelim.
	 * 
	 * */
	//Müþteri No ve Þifreyi tutmak için HashMap oluþturduk.
	static Map<Integer,Integer> musteriBilgileri = new HashMap<>();
	//Müþteri No ve Hesaptaki parasýný tutmak için HashMap oluþturduk.
	static Map<Integer,Float> toplamParaMiktarlari = new HashMap<>();
	//Kullanýcýdan veri almak için oluþturduk.
	static Scanner scan = new Scanner(System.in);
	//Kullanýcý giriþ yaptýktan sonra, kullanýcýn bilgilerini bu iki deðiþkene atayalým.
	//Ve iþlemlerimizi bu iki deðiþkeni kullanarak yapalým.
	static int girisYapanKullanicinMusteriNumarasi = 0;
	static float girisYapanKullanicinHesabindakiPara = 0;
	public static void main(String[] args) {
				//			 KEY	   VALUE
		musteriBilgileri.put(12345678, 1876);
		musteriBilgileri.put(22222222, 1234);
		musteriBilgileri.put(98765432, 1453);
		musteriBilgileri.put(55554444, 2020);
		toplamParaMiktarlari.put(12345678, 120.0f);
		toplamParaMiktarlari.put(22222222, 1000.0f);
		toplamParaMiktarlari.put(98765432, 5.0f);
		toplamParaMiktarlari.put(55554444, 255.0f);
		girisEkrani();	
	}
	private static void girisEkrani() {
		System.out.println("Müþteri numaranýzý giriniz : ");
		int musteriNo = scan.nextInt();
		if(musteriBilgileri.get(musteriNo) == null) {
			System.out.println("Böyle bir müþteri yok.");
			girisEkrani();
			return;
		}else {
			System.out.println("Müþteri numaranýz : " + musteriNo);
			System.out.println("Lütfen þifrenizi giriniz : ");
			int sifre = scan.nextInt();
			/// 12345678
			/// musteriBilgileri.get(12345678)
			if(musteriBilgileri.get(musteriNo) == sifre) {
				System.out.println("HOÞGELDÝNÝZ");
				girisYapanKullanicinMusteriNumarasi = musteriNo;
				girisYapanKullanicinHesabindakiPara = toplamParaMiktarlari.get(musteriNo);				
				menuGoster();
			}else {
				System.out.println("ÞÝFRENÝZ YANLIÞ.");
				girisEkrani();
				return;
			}
		}
	}
	private static void menuGoster() {	
		//System.out.println("SEÇÝM YAPINIZ : \n1-PARA ÇEK\n2-PARA YÜKLE\n3-TOPLAM PARAMI GÖR\n4-ÇIKIÞ YAP");
		System.out.println("SEÇÝM YAPINIZ : \n");
		System.out.println("1-PARA ÇEK");
		System.out.println("2-PARA YÜKLE");
		System.out.println("3-TOPLAM PARAMI GÖR");
		System.out.println("4-ÇIKIÞ YAP");
		int secim = scan.nextInt();
		switch (secim) {
			case 1:
				paraCek();
				break;
			case 2:
				System.out.println("Ne kadar para yatýrmak istersiniz ? ");
				float miktar = scan.nextFloat();
				girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara + miktar;
				//üstteki satýrla ayný iþlemi yapar : girisYapanKullanicinHesabindakiPara += miktar;
				System.out.println("Para hesaba yatýrýldý.");
				System.out.println("Toplam paranýz : " + girisYapanKullanicinHesabindakiPara);
				toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 3:
				System.out.println("Hesabýnýzdaki Toplam Para :" + girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 4:
				System.out.println("Çýkýþ yapýldý.");
				girisEkrani();
				break;				
			default:
				System.out.println("YANLIÞ SEÇÝM.");
				menuGoster();
				break;
		}
	}
	private static void paraCek() {
		System.out.println("Hesabýnýzdan ne kadar para çekmek istiyorsunuz : ");
		float miktar = scan.nextFloat();
		if(miktar > girisYapanKullanicinHesabindakiPara) {
			System.out.println("Hesabýnýzda sadece " + girisYapanKullanicinHesabindakiPara + " lira var");
			paraCek();
		}else {
			girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara - miktar;
			toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
			System.out.println("Para Çekildi");
			System.out.println("Kalan Tutar : " + girisYapanKullanicinHesabindakiPara);
			menuGoster();
		}
	}
}