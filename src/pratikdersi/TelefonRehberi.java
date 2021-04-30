package pratikdersi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonRehberi {
	/*
	 * Basit bir telefon rehberi uygulamas� yaz�n�z.
	 * 
	 * 1. Ad�m : �sim ve telefon numaralar�n� HashMap ile tutunuz.
	 * 2. Ad�m : Kullan�c�ya 1-Ki�i Ekle , 2-Ki�i ��kar, 3-Rehberi G�r, 4-��k�� se�enekleri sunal�m.
	 * 3. Ad�m : Bu i�lem i�in while d�ng�s� kullanal�m, 
	 * 			    kullan�c� 4- ��k��'a t�klayana kadar s�rekli g�sterelim.
	 * 
	 * �pucu : Numaray� long veri tipinde tutunuz.
	 * 
	 * 
	 * 	static Map<Long,String> rehber = new HashMap<>();
	 * 			   
	 * 			   0530 000 00 00 , Ay�e	
	 * */
	static Map<Long,String> rehber = new HashMap<>(); /// 0599 999 99 99  =  Ahmet
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean cikis = false;
		while(!cikis) { // cikis ==  false
			System.out.println("1-Ki�i Ekle , 2-Ki�i ��kar, 3-Rehberi G�r, 4-��k��");
			System.out.println("L�tfen se�im yap�n�z : ");
			int secim = scan.nextInt();
			switch(secim) {
				case 1:
					kisiEkle();
					break;
				case 2:
					kisiCikar();
					break;	
				case 3:
					rehberiGor();
					break;
				case 4:
					cikis = true;
					break;	
				default:
					System.out.println("Yanl�� Se�im Yapt�n�z");
					break;
			}
		}
		System.out.println("��k�� yap�ld� !");
	}
	private static void kisiCikar() {
		System.out.println("L�tfen silmek istedi�iniz numaray� giriniz : ");
		long numara = scan.nextLong();
		if(rehber.get(numara) == null) {
			System.out.println("B�yle bir numara yok");
			if(rehber.size() > 0 )
				kisiCikar();
		} else {
			rehber.remove(numara);
			System.out.println("Kullan�c� ba�ar�yla silindi.");
		}
	}
	private static void kisiEkle() {
		System.out.println("Ki�i ismini giriniz : ");
		String isim = scan.next();
		System.out.println("Telefon no giriniz : ");
		long numara = scan.nextLong();
		rehber.put(numara, isim);
	}
	private static void rehberiGor() {
		if(rehber.size() < 1) {
			System.out.println("Rehber Bo�");
			return; /// method sona erer.
		}
		for( Long numara : rehber.keySet() ) {
			System.out.println(rehber.get(numara) + " : " + numara);
		}
	}
}