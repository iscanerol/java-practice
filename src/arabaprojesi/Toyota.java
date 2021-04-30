package arabaprojesi;
/*
Bir class olusturunuz adi Toyota olsun
icerisinde 3 instance variable olsun 
protected String make = "Toyota";
protected String model = "Corolla";
protected int year = 2009;
Sonra 3 tane String return tipinden method olusturunuz
arabaMarkasi
arabaModeli
arabaYili
Son olarak bir oject olusturup method lari main method da print ediniz 
*/
public class Toyota extends Car{
	protected String make = "Toyota";
	protected String model = "Corolla";
	protected int year = 2009;
	 Toyota(){
		 
	 }
	 Toyota(String make,int year){
		 
	 }
	public static void main(String[] args) {
		Toyota arba = new Toyota();
		System.out.println(arba.arabaMarkasi());
		System.out.println(arba.arabaModelii());

		System.out.println(arba.make);
		System.out.println(arba.year);
	}
	public  String arabaMarkasi() {
		return make;
	}
	public String arabaModelii() {
		return model;
	}
	public  int arabaYili() {
		return year;
	}

}
