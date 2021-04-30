package javapracticeokulprojesi;

public class OkulSistemiGiris {
	/*
	 * Öðretmen, öðrenci ve okul genel bilgilerinden oluþan JAVA programý yazýnýz.
	 * 
	 * 1. Adým : Okulun sabit bilgilerini içerisine ekleyeceðimiz SabitBilgiler adlý bir class oluþturalým
	 * 			 Buradaki verileri public static final olarak tutalým.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adým : Ogretmen adlý bir class oluþturalým.
	 * 			 Bu classta öðretmenin adý, branþý ve telefon numaralarýný tutalým.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman öðretmenlerin bilgilerini yazdýralým
	 * 
	 * 3. Adým : Ogrenci adlý bir class oluþturalým.
	 * 			 Bu classta pgrencinin adý, okulnumarasý bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman ogrencilerin bilgilerini yazdýralým
	 * 
	 * 4. Adým : Ogretmenler adlý class oluþturalým.
	 * 			 Bu classta tüm öðretmenleri tutualým.
	 * 			 Ýçerisine List<Ogretmen> ogrentmenListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	 * 		     Bu class'ýn içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öðretmen ekleyebilelim.
	 * 
	 * 5. Adým : Ogrenciler adlý class oluþturalým.
	 * 			 Bu classta tüm öðrenciler tutualým.
	 * 			 Ýçerisine List<Ogrenci> ogrenciListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	 * 		     Bu class'ýn içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öðrenci ekleyebilelim.
	 * 	 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("****OKUL SÝSTEMÝNE HOÞGELDÝNÝZ****");
		/* Eðer nesne üreterek baþka bir class'tan  bilgi almak istiyorsak ya da methodlara, deðiþkenlere
		 * eriþmek istiyorsak, verilerimizi private yapabilir, onlara public methodlardan eriþebiliriz.
		 * buna Encapsolution deniliyor. (getter ve setter methodlarý)
		 * */
		System.out.println("\nOkul Ýsmi : " + SabitBilgiler.OKUL_ISIM);
		System.out.println("Müdür Bey : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Website : " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek :" + SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : " + SabitBilgiler.ADRES);
		System.out.println("\n      ÖÐRETMEN OLUÞTURALIM     ");
		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Süleyman Alptekin");
		ogretmenSuleymanBey.setBrans("JAVA");
		ogretmenSuleymanBey.setTelefon("0539999999");
		System.out.println("\nÝsim : " + ogretmenSuleymanBey.getIsim());
		System.out.println("Branþ : " + ogretmenSuleymanBey.getBrans());
		System.out.println("Tel : " + ogretmenSuleymanBey.getTelefon());
	//	System.out.println("Süleyman Alptekin " + ogretmenSuleymanBey.toString());
		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yýlmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("0536666666");
		System.out.println("\nÝsim : " + ogretmenHamza.getIsim());
		System.out.println("Branþ : " + ogretmenHamza.getBrans());
		System.out.println("Tel : " + ogretmenHamza.getTelefon());
	//	System.out.println("Hamza " + ogretmenHamza.toString());
		System.out.println("\n      ÖÐRENCÝ OLUÞTURALIM     \n");
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setIsim("Adil Yesilmen");
		ogrenci1.setNo(1);
		System.out.println(ogrenci1.toString());
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setIsim("Ahmet Yanýk");
		ogrenci2.setNo(2);
		System.out.println(ogrenci2.toString());
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.setIsim("Ersin Kara");
		ogrenci3.setNo(3);
		System.out.println(ogrenci3.toString());
		System.out.println("\n     OGRETMENLER CLASS     \n");
		Ogretmenler ogretmenler = new Ogretmenler();
		ogretmenler.ogretmenEkle(ogretmenSuleymanBey);
		ogretmenler.ogretmenEkle(ogretmenHamza);
		System.out.println("Öðretmen Sayýsý : " +ogretmenler.ogretmenSayisi());
		System.out.println(ogretmenler.toString());
	}
}