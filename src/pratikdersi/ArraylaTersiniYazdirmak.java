package pratikdersi;

import java.util.Scanner;

public class ArraylaTersiniYazdirmak {
	/* Girilen ifadenin, Array kullanarak tersini alal�m.
	 * Deneme  -  emeneD
	 * return yaps�n
	 * getTersi(char[] array)
	 * 27 ge�e ba�layal�m.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir ifade yaz�n�z : ");
		String ifade = scan.nextLine();
		char[] array = ifade.toCharArray();
		String ters = getTersi(array);
		System.out.println("Tersi : " + ters);
	}
	private static String getTersi(char[] array) {
		String ters = "";
		for(int i = array.length - 1 ; i >= 0; i--) {
			ters += array[i];
		}
		return ters;
	}
}