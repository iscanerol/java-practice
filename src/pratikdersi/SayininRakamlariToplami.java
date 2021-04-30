package pratikdersi;

import java.util.Scanner;

public class SayininRakamlariToplami {
	/* 
	 * Girilen sayýnýn rakamlarý toplamýný return eden bir method yazýnýz.
	 * 
	 * 59 geçe baþlayalým
	 * 
	 * getRakamlarToplami(int sayi)
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý giriniz : ");
		int sayi = scan.nextInt();
		int rakamlarToplami = getRakamlarToplami(sayi);
		System.out.println("Rakamlar toplamý : " + rakamlarToplami);
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
