package javapracticeokulprojesi;

public class SabitBilgiler {
	/* Programda heryerden eriþmek istediðimiz ve deðiþtirilmesini istemediðimiz deðiþkenler için
	 * static final kelimelerini kullanýrýz. 
	 * 
	 * Adlandýrma yaparken, mümkünse tum karakterleri büyük harf yapar, kelimelerin arasýna da
	 * "_" (alt tire) ekleriz.
	 * 
	 * Bu deðiþkenlere herhangi bir nesne üretmeden ya da extend yapmadan direk eriþebiliyoruz.
	 * 
	 * */
	public static final String OKUL_ISIM = "Techproed";
	public static final String MUDUR = "Mesut Bey";
	public static final long TELEFON_NO = 03122222222l;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi Bey";
	public static final String ADRES = "Güneþ Doðacak Sokak, 2020  / 7";
	/* Eðer bir class'tan nesne üretilmesini istemiyorsak,
	 * constructor'ý private yaparýz (Singleton Class)
	 * */
	private SabitBilgiler() {
	}
}