package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasWhileDongusu {
	/*	While d�ng�s� kullanarak ta� ka��t makas oyununu yaz�n�z. 
	 * 
	 * 1. Ad�m : TA� = 0, MAKAS = 1, KA�IT = 2
	 * 2. Ad�m : 3 kere kazanan ��kana kadar while d�ng�s�n� devam ettir.
	 * 3. Ad�m : While d�ng�s� i�erisinde, bilgisayar�n tahminini rastgele olu�tur.
	 * 4. Ad�m : While d�ng�s� i�erisinde, her seferinde kullan�c�dan say� girmesini 
	 * 			 iste.
	 * 5. Ad�m : Her tahmin sonunda kazanan� yazd�r, ve kazanan�n kazanma say�s�n� 
	 * 			 1 art�r.
	 * 
	 * K - > TA� ve B - > MAKAS   ||| TA� KAZANIYOR
	 * K - > TA� ve B - > KA�IT   ||| KA�IT KAZANIYOR
	 * K - > MAKAS ve B - > KA�IT ||| MAKAS KAZANIYOR
	 * 
	 * 
	 * */
	/// 10 GE�E BA�LAYACA�IZ
	public static void main(String[] args) {
		int kazanmaSayiKullanici = 0;
		int kazanmaSayiBilgisayar =  0;
		int bitis = 3;
		Scanner scan = new Scanner(System.in);
		List<String> liste = new ArrayList<>(); /// collections - list
		liste.add("TA� ");
		liste.add("MAKAS ");
		liste.add("KA�IT ");
		System.out.println("TA� = 0 , MAKAS = 1, KA�IT = 2");
		//	  3				 		 3					1					  3
		while(kazanmaSayiBilgisayar < bitis && kazanmaSayiKullanici < bitis) {
			  // false						&&   true
			int bilgisayarinTahmini = new Random().nextInt(3); //     2 
			System.out.println("L�tfen tahmininizi yaz�n�z : ");
			int kullanicininTahmini = scan.nextInt();		  //      0
			System.out.println("Bilgisayar : " + liste.get(bilgisayarinTahmini)); // KA�IT
			System.out.println("Kullan�c� : " + liste.get(kullanicininTahmini));  // TA�
			if(bilgisayarinTahmini == kullanicininTahmini) {
				System.out.println("BERABERL�K !");
			}else if(   (kullanicininTahmini == 0 && bilgisayarinTahmini == 1)   ||  (kullanicininTahmini == 1 && bilgisayarinTahmini == 2) || (kullanicininTahmini == 2 && bilgisayarinTahmini == 0 ) ) {
				System.out.println("KULLANICI KAZANDI");
				kazanmaSayiKullanici ++;
			}else {
				System.out.println("B�LG�SAYAR KAZANDI");
				kazanmaSayiBilgisayar ++;
			}
			System.out.println("B�LG�SAYAR : " + kazanmaSayiBilgisayar +"\nKULLANICI : "+kazanmaSayiKullanici);
		}
	}
}
