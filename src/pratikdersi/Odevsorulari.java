package pratikdersi;

public class Odevsorulari {
	/*
	 * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program yazýnýz.
	 * Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný gösteren bir method yazýnýz.
	 * Ayrýca bakkalýn hangi günler ortalamanýn altýnda kazandýðýný gösteren bir method yazýnýz.
	 * 
	 * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler)
	 * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun. (gunlukKazanclar)
	 * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle.
	 * 4. Adým : getOrtalamaKazanc() adlý method ile ortlama kazancý alýn.
	 * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun. 
	 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * 			 ortalama kazançtan aþaðýysa o günleri return yap.	
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 * 			 1- Para Çek
		 * 			 2- Para Yükle
		 * 			 3- Toplam Paramý Gör	
		 * 			 3- Çýkýþ Yap	
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
		
		
		
		/*
		 * Kullanýcý tarafýndan girilen yazý ya da sayýnýn polindrom olup olmadýðýný bulan bir program yazýnýz.
		 * 
		 * 1. Adým : Kullanýcýdan veri alalým.
		 * 2. Adým : For döngüsü kullanarak aldýðýmýz ifadenin tersini bulalým.
		 * 3. Adým : Tersi ile normal ifadeyi karþýlaþtýralým.
		 * 
		 * 
		 * */
	}

}
