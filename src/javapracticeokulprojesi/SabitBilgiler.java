package javapracticeokulprojesi;

public class SabitBilgiler {
	/* Programda heryerden eri�mek istedi�imiz ve de�i�tirilmesini istemedi�imiz de�i�kenler i�in
	 * static final kelimelerini kullan�r�z. 
	 * 
	 * Adland�rma yaparken, m�mk�nse tum karakterleri b�y�k harf yapar, kelimelerin aras�na da
	 * "_" (alt tire) ekleriz.
	 * 
	 * Bu de�i�kenlere herhangi bir nesne �retmeden ya da extend yapmadan direk eri�ebiliyoruz.
	 * 
	 * */
	public static final String OKUL_ISIM = "Techproed";
	public static final String MUDUR = "Mesut Bey";
	public static final long TELEFON_NO = 03122222222l;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi Bey";
	public static final String ADRES = "G�ne� Do�acak Sokak, 2020  / 7";
	/* E�er bir class'tan nesne �retilmesini istemiyorsak,
	 * constructor'� private yapar�z (Singleton Class)
	 * */
	private SabitBilgiler() {
	}
}