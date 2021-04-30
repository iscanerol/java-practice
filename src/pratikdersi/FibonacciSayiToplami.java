package pratikdersi;

import java.util.Scanner;

public class FibonacciSayiToplami {

	/* Kullanýcýdan sayý alýn ve o sayý kadar ard arda gelen fibonacci sayý 
	 * dizisini ekrana yazdýrýn
	 * örnek : Kullanýcý 10 sayýsýný girdi, 10 tane sayýyý ekrana yazdýracaðýz.
	 * 		   0 1 1  2  3  5 8 13 21 34	
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý giriniz : ");
		int sayi = scan.nextInt();
		int sayi1 = 0;
		int sayi2 = 1;
		int ilkIkiSayininToplami = 0;
		System.out.print(sayi1+" "+sayi2);
		for(int i = 2; i < sayi ; ++i ) {
			ilkIkiSayininToplami = sayi1 + sayi2;     // 0 + 1			1 + 1        1  + 2     2   +  3                                         
			sayi1 = sayi2 ;							  // sayi1 = 1;		sayi1 = 1    2          3
			sayi2 = ilkIkiSayininToplami;			  // sayi2 = 1;     sayi2 = 2    3          5
			System.out.print(" " + ilkIkiSayininToplami);
		}
	}
}
	
