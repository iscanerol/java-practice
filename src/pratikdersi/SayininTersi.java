package pratikdersi;

import java.util.Scanner;

public class SayininTersi {
	/*Girilen sayýnýn tersini bulan bir method yazýnýz.
	 * return edecek.
	 * 
	 * getSayininTersi(int sayi)
	 * 
	 * 40 geçe soru çözülecek.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayý giriniz : ");
		int sayi = scan.nextInt();
		int ters = sayininTersi(sayi);
		System.out.println("Sayýnýn Tersi " + ters);
	}
	public static int sayininTersi(int n) {  // 1654 - 456
											 //	4000
											 //	500
											 //	60
											 // 1
		int sonuc = 0;
		while(n>0) {
			int sayi = n % 10;  	//  4				5		   6
			n/=10;              	//  65				6		   0	
			sonuc = sonuc*10+sayi;	// 0*10 + 4 = 4;    45	      456
		}
		return sonuc;
	}
}
