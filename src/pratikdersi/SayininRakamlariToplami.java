package pratikdersi;

import java.util.Scanner;

public class SayininRakamlariToplami {
	/* 
	 * Girilen say�n�n rakamlar� toplam�n� return eden bir method yaz�n�z.
	 * 
	 * 59 ge�e ba�layal�m
	 * 
	 * getRakamlarToplami(int sayi)
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Say� giriniz : ");
		int sayi = scan.nextInt();
		int rakamlarToplami = getRakamlarToplami(sayi);
		System.out.println("Rakamlar toplam� : " + rakamlarToplami);
		/// 123  = > "123"
		//			 '1'  '2'  '3'
		//			 "1"  "2"  "3"
		//			Integer.parseInt("1") => 1
		//			Integer.parseInt("2") => 2
		//			Integer.parseInt("3") => 3 + 2 + 1
	}
	private static int getRakamlarToplami(int sayi) {  // 120
		int toplam = 0;
		int birlerBasamagi = 0;
		while(sayi > 0) {		// 12
			birlerBasamagi = sayi % 10;    // 0					2             1
			toplam += birlerBasamagi;      // toplam = 0 + 0 +  2		+     1  	
			sayi = sayi / 10;			   // sayi = 12		  sayi = 1		sayi = 0
		}
		return toplam;
	}
}
