package hastaneprojesi;

public class HastaneRunner  {
	/*Main metodumuzun hazir oldugundan emin olalim
	Main method da iki variable olusturunuz
	String hastaDurumu
	String unvan
	Ve asagidaki custom methodlari olusturunuz
	public static String doktorUnvan(String aktuelDurum) { }
	Sonra sirasiyla asagidaki adimlari takip ediniz
	If aktuelDurum  Allerji return Allergist
	If aktuelDurum  Bas agrisi return Norolog
	If aktuelDurum  Diabet return Genel cerrah
	If aktuelDurum  Soguk alginligi return Cocuk doktoru
	If aktuelDurum  Migren return Dahiliye
	If aktuelDurum  Kalp hastaliklari return Kardiolog
	else return yanlis unvan
	Sonra bu methodunuzu unvan variable iniza atayiniz*/

	static Hastane hastane = new Hastane();
	
	public static void main(String[] args) {

		String hastaDurumu= "Allerji";
		String unvan = doktorUnvan(hastaDurumu);
	}
	public static String doktorUnvan(String actuelDurum) {
		if(actuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		}else if(actuelDurum.equals("bas agrisi")) {
			return hastane.unvanlar[1];
		}else if(actuelDurum.equals("Diabet")) {
			return hastane.unvanlar[2];
		}else if(actuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}else if(actuelDurum.equals("migren")) {
			return hastane.unvanlar[4];
		}else if(actuelDurum.equals("Klap hastaliklari")) {
			return hastane.unvanlar[5];
		}else {
			return "yanlis unvan";
		}
	}
	public static Doktor doktorBul(String unvan) {
		Doktor doktor = new Doktor();
		for(int i= 0 ;i<hastane.unvanlar.length;i++) {
			if(unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(unvan);
			}
			
		}
		
		return doktor;
	}

}
