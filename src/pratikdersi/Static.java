package pratikdersi;

public class Static {

	 static int a  = 23;
	 int b = 30;
	 
	
	public static void main(String[] args) {
		/*
		uIki tane instance int variable olusturunuz ve biri static digeri non-static olsun
		usonra bu class tan iki farkli object olusturunuz
		uHer objectle instance variable lara rakam ekleyiniz
		u*/
		Static obj1 = new Static();
		Static obj2 = new Static();
		obj1.b += 3;
		obj1.a += 3;
		System.out.println(obj1.b);
		System.out.println(obj1.a);
		obj2.b += 3;
		obj2.a +=3;
		System.out.println(obj2.b);
		System.out.println(obj2.a);
	}

}
