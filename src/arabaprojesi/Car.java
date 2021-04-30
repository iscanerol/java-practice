package arabaprojesi;
/*
Bir class olusturunuz adi Car olsun
icerisinde 3 instance variable olsun 
protected String make ;
protected String model;
protected int year ;
Sonra 3 tane String return tipinden method olusturunuz
arabaMarkasi
arabaModeli
arabaYili
ve iki constructor olusturunuz 
1 parametreli
1 parametresiz
String model;
int year
Son olarak bir oject olusturup method lari main method da print ediniz 
*/

public class Car {

	protected String make;
	protected String model;
	protected int year;
	 Car(){
		
	 }
	 Car(String model, int year){
		 this.model = model;
		 this.year = year;
	 }
	
	public static void main(String[] args) {
		Car cr  = new Car();
		System.out.println(cr.arabaMarkasi());
		System.out.println(cr.arabaModelii());
		System.out.println(cr.arabaYili());

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
