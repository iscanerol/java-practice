package pratikdersi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmUygulamasiSorusu {
	/*
	 * ATM uygulamas� yap�n�z.
	 * 
	 * 1. Ad�m : Bankam�zdaki m��terilerin musteriNumarasi ve 4 haneli �ifresini tutan bir HashMap olu�tural�m.
	 * 		     Ve �u m��terileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			M��teri No  -- �ifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Ad�m : Bankam�zdaki m��terilerin hesaplar�ndaki para miktarini tutan bir tane HashMap olu�tural�m.
	 * 		     Ve �u miktarlar� m��teri numaras�yla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			M��teri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Ad�m : Giri� ekran� olu�tural�m. M��teri buradan giri� yaps�n.
	 * 			 Kullan�c� ad� ve �ifre isteyelim, do�ru ise giri� yaps�n.
	 * 
	 * 4. Ad�m : Do�ru m��teri numaras� ve �ifre kontrol eden methodlar yazal�m.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, do�ru m��teri numaras�d�r.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki �ifre ile uyu�uyorsa do�ru �ifredir.
	 * 
	 * 5. Ad�m : Gir� yapt�ktan sonra kar��s�na 3 tane se�enek ��ks�n : 
	 * 			 Bunlar� da menuGoster() methodu ile yapal�m.
	 * 			 1- Para �ek			// 300
	 * 			 2- Para Y�kle			// 500 + 100
	 * 			 3- Toplam Param� G�r	// 200
	 * 			 4- ��k�� Yap	
	 * 
	 * 6. Ad�m : ��k�� methodu olu�tural�m.
	 * 			 Giri� yapan m��teri ��k�� yapmak isterse, toplamPara ve girisYapanMusteriNo'yu s�f�rlayal�m.
	 * 			 Tekrar giri� ekran�na y�ndendirelim.	
	 * 
	 * 6. Ad�m : Toplam parami gor methodu olu�tural�m. toplamParamiGor()
	 * 			
	 * 7. Ad�m : 1- Para �ekme Methodu Olu�tural�m
	 * 			 Hesaba giri� yapan m��teriye hesab�ndaki toplam paray� g�sterelim.
	 * 			 Kullan�c�dan �ekmek istedi�i tutar� ��renelim.	
	 * 			 Hesab�nda yeterli para varsa, para �eksin yoksa uyar� verelim.
	 * 			 �ekti�i tutar�, toplam paras�ndan d��elim ve kaydedelim.		
	 *			 Ba�ka i�lem yapmak isteyip istemedi�ini soral�m, isterse yapt�ral�m, yoksa ��k�� i�lemi ger�ekle�tirelim.
	 * 		  
	 * 8. Ad�m : 1- Para Y�kleme Methodu Olu�tural�m
	 * 			 Hesaba giri� yapan m��teriye hesab�ndaki toplam paray� g�sterelim.
	 * 			 Kullan�c�dan y�klemek istedi�i tutar� ��renelim.	
	 * 			 Y�kledi�i tutar�, toplam paras�na ekleyelim ve g�sterelim.
	 * 			 Ba�ka i�lem yapmak isteyip istemedi�ini soral�m, isterse yapt�ral�m, yoksa ��k�� i�lemi ger�ekle�tirelim.
	 * 
	 * */
	//M��teri No ve �ifreyi tutmak i�in HashMap olu�turduk.
	static Map<Integer,Integer> musteriBilgileri = new HashMap<>();
	//M��teri No ve Hesaptaki paras�n� tutmak i�in HashMap olu�turduk.
	static Map<Integer,Float> toplamParaMiktarlari = new HashMap<>();
	//Kullan�c�dan veri almak i�in olu�turduk.
	static Scanner scan = new Scanner(System.in);
	//Kullan�c� giri� yapt�ktan sonra, kullan�c�n bilgilerini bu iki de�i�kene atayal�m.
	//Ve i�lemlerimizi bu iki de�i�keni kullanarak yapal�m.
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
		System.out.println("M��teri numaran�z� giriniz : ");
		int musteriNo = scan.nextInt();
		if(musteriBilgileri.get(musteriNo) == null) {
			System.out.println("B�yle bir m��teri yok.");
			girisEkrani();
			return;
		}else {
			System.out.println("M��teri numaran�z : " + musteriNo);
			System.out.println("L�tfen �ifrenizi giriniz : ");
			int sifre = scan.nextInt();
			/// 12345678
			/// musteriBilgileri.get(12345678)
			if(musteriBilgileri.get(musteriNo) == sifre) {
				System.out.println("HO�GELD�N�Z");
				girisYapanKullanicinMusteriNumarasi = musteriNo;
				girisYapanKullanicinHesabindakiPara = toplamParaMiktarlari.get(musteriNo);				
				menuGoster();
			}else {
				System.out.println("��FREN�Z YANLI�.");
				girisEkrani();
				return;
			}
		}
	}
	private static void menuGoster() {	
		//System.out.println("SE��M YAPINIZ : \n1-PARA �EK\n2-PARA Y�KLE\n3-TOPLAM PARAMI G�R\n4-�IKI� YAP");
		System.out.println("SE��M YAPINIZ : \n");
		System.out.println("1-PARA �EK");
		System.out.println("2-PARA Y�KLE");
		System.out.println("3-TOPLAM PARAMI G�R");
		System.out.println("4-�IKI� YAP");
		int secim = scan.nextInt();
		switch (secim) {
			case 1:
				paraCek();
				break;
			case 2:
				System.out.println("Ne kadar para yat�rmak istersiniz ? ");
				float miktar = scan.nextFloat();
				girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara + miktar;
				//�stteki sat�rla ayn� i�lemi yapar : girisYapanKullanicinHesabindakiPara += miktar;
				System.out.println("Para hesaba yat�r�ld�.");
				System.out.println("Toplam paran�z : " + girisYapanKullanicinHesabindakiPara);
				toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 3:
				System.out.println("Hesab�n�zdaki Toplam Para :" + girisYapanKullanicinHesabindakiPara);
				menuGoster();
				break;
			case 4:
				System.out.println("��k�� yap�ld�.");
				girisEkrani();
				break;				
			default:
				System.out.println("YANLI� SE��M.");
				menuGoster();
				break;
		}
	}
	private static void paraCek() {
		System.out.println("Hesab�n�zdan ne kadar para �ekmek istiyorsunuz : ");
		float miktar = scan.nextFloat();
		if(miktar > girisYapanKullanicinHesabindakiPara) {
			System.out.println("Hesab�n�zda sadece " + girisYapanKullanicinHesabindakiPara + " lira var");
			paraCek();
		}else {
			girisYapanKullanicinHesabindakiPara = girisYapanKullanicinHesabindakiPara - miktar;
			toplamParaMiktarlari.put(girisYapanKullanicinMusteriNumarasi, girisYapanKullanicinHesabindakiPara);
			System.out.println("Para �ekildi");
			System.out.println("Kalan Tutar : " + girisYapanKullanicinHesabindakiPara);
			menuGoster();
		}
	}
}