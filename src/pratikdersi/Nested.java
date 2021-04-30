package pratikdersi;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("uc sayi giriniz");
		int num1 =scan.nextInt();
		int num2 =scan.nextInt();
		int num3 =scan.nextInt();

		if (num1>num2 && num1> num2) {
			System.out.println("en buyuk sayi" + num1);
		}else if(num2>num1 && num2>num3 ) {
			System.out.println("en buyuk sayi" + num2);
		}else
			System.out.println("en buyuk sayi "+ num3);
	}

}
