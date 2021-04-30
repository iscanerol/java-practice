package arabaprojesi;
/*
Bir class olusturunuz adi Honda olsun
icerisinde 3 instance variable olsun 
protected String make = "Honda";
protected String model = "Accord";
protected int year = 2012;
Sonra 3 tane String return tipinden method olusturunuz
arabaMarkasi
arabaModeli
arabaYili
Son olarak bir oject olusturup method lari main method da print ediniz 
*/
public class Honda extends Car {

	protected String make = "Honda";
	protected String model = "Accord";
	protected int year = 2012;
	
	Honda(){
		
	}
    Honda(String make,int year){
    	this.make =make;
    	this.year =year;
    }
    public static void main(String[] args) {

    	Honda araba1 = new Honda();
    	System.out.println(araba1.make);
    	System.out.println(araba1.model);
    	System.out.println(araba1.year);
	 Honda araba2 = new Honda("civik",2014);
	 System.out.println(araba2.make);
	 System.out.println(araba2.year);
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
