package pratikdersi;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
		int num2 =scan.nextInt();
		String result = num1>num2 ? (num1 + " buyuk sayi /") + (num2 + " kucuk sayi") :
			(num2 + " buyuk sayi / ") + ( num1 + " kucuk sayi");
		System.out.println(result);
	}

}
