package javapracticeokulprojesi;

public class OkulSistemiGiris {
	/*
	 * ��retmen, ��renci ve okul genel bilgilerinden olu�an JAVA program� yaz�n�z.
	 * 
	 * 1. Ad�m : Okulun sabit bilgilerini i�erisine ekleyece�imiz SabitBilgiler adl� bir class olu�tural�m
	 * 			 Buradaki verileri public static final olarak tutal�m.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Ad�m : Ogretmen adl� bir class olu�tural�m.
	 * 			 Bu classta ��retmenin ad�, bran�� ve telefon numaralar�n� tutal�m.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ��retmenlerin bilgilerini yazd�ral�m
	 * 
	 * 3. Ad�m : Ogrenci adl� bir class olu�tural�m.
	 * 			 Bu classta pgrencinin ad�, okulnumaras� bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ogrencilerin bilgilerini yazd�ral�m
	 * 
	 * 4. Ad�m : Ogretmenler adl� class olu�tural�m.
	 * 			 Bu classta t�m ��retmenleri tutual�m.
	 * 			 ��erisine List<Ogretmen> ogrentmenListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	 * 		     Bu class'�n i�ine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni ��retmen ekleyebilelim.
	 * 
	 * 5. Ad�m : Ogrenciler adl� class olu�tural�m.
	 * 			 Bu classta t�m ��renciler tutual�m.
	 * 			 ��erisine List<Ogrenci> ogrenciListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	 * 		     Bu class'�n i�ine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni ��renci ekleyebilelim.
	 * 	 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println("****OKUL S�STEM�NE HO�GELD�N�Z****");
		/* E�er nesne �reterek ba�ka bir class'tan  bilgi almak istiyorsak ya da methodlara, de�i�kenlere
		 * eri�mek istiyorsak, verilerimizi private yapabilir, onlara public methodlardan eri�ebiliriz.
		 * buna Encapsolution deniliyor. (getter ve setter methodlar�)
		 * */
		System.out.println("\nOkul �smi : " + SabitBilgiler.OKUL_ISIM);
		System.out.println("M�d�r Bey : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Website : " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek :" + SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : " + SabitBilgiler.ADRES);
		System.out.println("\n      ��RETMEN OLU�TURALIM     ");
		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("S�leyman Alptekin");
		ogretmenSuleymanBey.setBrans("JAVA");
		ogretmenSuleymanBey.setTelefon("0539999999");
		System.out.println("\n�sim : " + ogretmenSuleymanBey.getIsim());
		System.out.println("Bran� : " + ogretmenSuleymanBey.getBrans());
		System.out.println("Tel : " + ogretmenSuleymanBey.getTelefon());
	//	System.out.println("S�leyman Alptekin " + ogretmenSuleymanBey.toString());
		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Y�lmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("0536666666");
		System.out.println("\n�sim : " + ogretmenHamza.getIsim());
		System.out.println("Bran� : " + ogretmenHamza.getBrans());
		System.out.println("Tel : " + ogretmenHamza.getTelefon());
	//	System.out.println("Hamza " + ogretmenHamza.toString());
		System.out.println("\n      ��RENC� OLU�TURALIM     \n");
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setIsim("Adil Yesilmen");
		ogrenci1.setNo(1);
		System.out.println(ogrenci1.toString());
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setIsim("Ahmet Yan�k");
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
		System.out.println("��retmen Say�s� : " +ogretmenler.ogretmenSayisi());
		System.out.println(ogretmenler.toString());
	}
}