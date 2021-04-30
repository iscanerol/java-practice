package pratikdersi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasWhileDongusu {
	/*	While döngüsü kullanarak taþ kaðýt makas oyununu yazýnýz. 
	 * 
	 * 1. Adým : TAÞ = 0, MAKAS = 1, KAÐIT = 2
	 * 2. Adým : 3 kere kazanan çýkana kadar while döngüsünü devam ettir.
	 * 3. Adým : While döngüsü içerisinde, bilgisayarýn tahminini rastgele oluþtur.
	 * 4. Adým : While döngüsü içerisinde, her seferinde kullanýcýdan sayý girmesini 
	 * 			 iste.
	 * 5. Adým : Her tahmin sonunda kazananý yazdýr, ve kazananýn kazanma sayýsýný 
	 * 			 1 artýr.
	 * 
	 * K - > TAÞ ve B - > MAKAS   ||| TAÞ KAZANIYOR
	 * K - > TAÞ ve B - > KAÐIT   ||| KAÐIT KAZANIYOR
	 * K - > MAKAS ve B - > KAÐIT ||| MAKAS KAZANIYOR
	 * 
	 * 
	 * */
	/// 10 GEÇE BAÞLAYACAÐIZ
	public static void main(String[] args) {
		int kazanmaSayiKullanici = 0;
		int kazanmaSayiBilgisayar =  0;
		int bitis = 3;
		Scanner scan = new Scanner(System.in);
		List<String> liste = new ArrayList<>(); /// collections - list
		liste.add("TAÞ ");
		liste.add("MAKAS ");
		liste.add("KAÐIT ");
		System.out.println("TAÞ = 0 , MAKAS = 1, KAÐIT = 2");
		//	  3				 		 3					1					  3
		while(kazanmaSayiBilgisayar < bitis && kazanmaSayiKullanici < bitis) {
			  // false						&&   true
			int bilgisayarinTahmini = new Random().nextInt(3); //     2 
			System.out.println("Lütfen tahmininizi yazýnýz : ");
			int kullanicininTahmini = scan.nextInt();		  //      0
			System.out.println("Bilgisayar : " + liste.get(bilgisayarinTahmini)); // KAÐIT
			System.out.println("Kullanýcý : " + liste.get(kullanicininTahmini));  // TAÞ
			if(bilgisayarinTahmini == kullanicininTahmini) {
				System.out.println("BERABERLÝK !");
			}else if(   (kullanicininTahmini == 0 && bilgisayarinTahmini == 1)   ||  (kullanicininTahmini == 1 && bilgisayarinTahmini == 2) || (kullanicininTahmini == 2 && bilgisayarinTahmini == 0 ) ) {
				System.out.println("KULLANICI KAZANDI");
				kazanmaSayiKullanici ++;
			}else {
				System.out.println("BÝLGÝSAYAR KAZANDI");
				kazanmaSayiBilgisayar ++;
			}
			System.out.println("BÝLGÝSAYAR : " + kazanmaSayiBilgisayar +"\nKULLANICI : "+kazanmaSayiKullanici);
		}
	}
}
