package pratikdersi;

import java.util.Scanner;

public class PolindromSayisi {

		/*
		 * Kullanýcý tarafýndan girilen yazý ya da sayýnýn polindrom olup 
		 * olmadýðýný bulan bir program yazýnýz.
		 * 
		 * 1. Adým : Kullanýcýdan veri alalým.
		 * 2. Adým : For döngüsü kullanarak aldýðýmýz ifadenin tersini bulalým.
		 * 3. Adým : Tersi ile normal ifadeyi karþýlaþtýralým.
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
			System.out.println("Lütfen tersini görmek istediðiniz ifadeyi yazýnýz : ");
			normalHali = scan.nextLine();
			for(int i = normalHali.length()-1 ; i >= 0 ; i--) {
				//System.out.print(normalHali.charAt(i));
				tersHali = tersHali + normalHali.charAt(i);
			}
			if(tersHali.equals(normalHali)) {
				System.out.println("POLÝNDROM");
			}else {
				System.out.println("POLÝNDROM DEÐÝL");
			}
			scan.close();
		}
	}