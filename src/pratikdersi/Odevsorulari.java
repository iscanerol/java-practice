package pratikdersi;

public class Odevsorulari {
	/*
	 * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program yaz�n�z.
	 * Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n� g�steren bir method yaz�n�z.
	 * Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda kazand���n� g�steren bir method yaz�n�z.
	 * 
	 * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler)
	 * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun. (gunlukKazanclar)
	 * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle.
	 * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortlama kazanc� al�n.
	 * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun. 
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan y�ksekse o g�nleri return yap.
	 * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun. 
	 * 			 for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * 			 ortalama kazan�tan a�a��ysa o g�nleri return yap.	
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 * 			 1- Para �ek
		 * 			 2- Para Y�kle
		 * 			 3- Toplam Param� G�r	
		 * 			 3- ��k�� Yap	
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
		
		
		
		/*
		 * Kullan�c� taraf�ndan girilen yaz� ya da say�n�n polindrom olup olmad���n� bulan bir program yaz�n�z.
		 * 
		 * 1. Ad�m : Kullan�c�dan veri alal�m.
		 * 2. Ad�m : For d�ng�s� kullanarak ald���m�z ifadenin tersini bulal�m.
		 * 3. Ad�m : Tersi ile normal ifadeyi kar��la�t�ral�m.
		 * 
		 * 
		 * */
	}

}
