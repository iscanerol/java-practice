package pratikdersi;

import java.util.Scanner;

public class PolindromSayisi {

		/*
		 * Kullan�c� taraf�ndan girilen yaz� ya da say�n�n polindrom olup 
		 * olmad���n� bulan bir program yaz�n�z.
		 * 
		 * 1. Ad�m : Kullan�c�dan veri alal�m.
		 * 2. Ad�m : For d�ng�s� kullanarak ald���m�z ifadenin tersini bulal�m.
		 * 3. Ad�m : Tersi ile normal ifadeyi kar��la�t�ral�m.
		 * 
		 *      12321 = 12321
		 *      
		 *      baab = baad
		 *      
		 *      ey edip adanada pide ye
		 * 
		 * */
		public static void main(String[] args) {
			String normalHali = "";
			String tersHali = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen tersini g�rmek istedi�iniz ifadeyi yaz�n�z : ");
			normalHali = scan.nextLine();
			for(int i = normalHali.length()-1 ; i >= 0 ; i--) {
				//System.out.print(normalHali.charAt(i));
				tersHali = tersHali + normalHali.charAt(i);
			}
			if(tersHali.equals(normalHali)) {
				System.out.println("POL�NDROM");
			}else {
				System.out.println("POL�NDROM DE��L");
			}
			scan.close();
		}
	}