package pratikdersi;

import java.util.Scanner;

public class ArraylaTersiniYazdirmak {
	/* Girilen ifadenin, Array kullanarak tersini alalım.
	 * Deneme  -  emeneD
	 * return yapsın
	 * getTersi(char[] array)
	 * 27 geçe başlayalım.
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade yazınız : ");
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