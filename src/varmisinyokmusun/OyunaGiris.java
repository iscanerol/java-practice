package varmisinyokmusun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * "Var M�s�n Yok Musun ?" oyunu olu�tural�m.
 * 
 * Oyunun mant��� : 10 tane kutu vard�r, ve her kutunun i�inde para miktar�n� g�steren bir say� vard�r.
 * Oyunu oynayan ki�inin sahip oldu�u bir kutu vard�r.
 * Kalan 9 kutuyu s�ras�yla a�t�r�r ve her 3 kutu a�t���nda, yar��man�n sahibi taraf�ndan teklifte bulunulur.
 * Oyuncu isterse teklifi kabul eder, isterse de oyuna devam edip kendi kutusundaki miktar� kazanabilir.
 * 
 * �rnek : 10 kutunun i�inde rastgele olarak dizilmi� �u �ekilde miktarlar olsun.
 * 
 * 1. Kutu : 1 TL
 * 2. Kutu : 10 TL
 * 3. Kutu : 500 TL
 * 4. Kutu : 1000 TL
 * 5. Kutu : 5000 TL
 * 6. Kutu : 10000 TL
 * 7. Kutu : 50000 TL
 * 8. Kutu : 100000 TL
 * 9. Kutu : 250000 TL
 * 10. Kutu : 500000 TL
 * 
 * 
 * Bizim kutumuz 8. kutu olsun.
 * 
 * Biz her seferinde kalan 9 kutudan birisini se�ip a�t�raca��z, her �� kutu a�t�ktan sonra 
 * yap�mc�dan teklif alaca��z. Diyelim ki ilk 3 kutu a��ld�ktan sonra yap�mc� bize 10.000 TL teklif etti,
 * istersek bunu kabul edece�iz, istemezsek devam edece�iz.
 * 
 * Son kutu kalana kadar devam edebiliyoruz.
 * 
 * 
 * 1. Ad�m : �nce 10 farkl� para miktar�n� tutmak i�in List<Integer> paraListesi  
 * 			ad�nda ArrayList olu�tural�m ve miktarlar� ekleyelim.
 * 				
 * 2. Ad�m : 10 Tane kutu olu�tural�m ve her kutunun i�ine rastgele bir miktar atayal�m.
 * 			 Bu miktarlar� paraListesi adl� arrayList'imizden alal�m.
 * 			 Bunun i�in Kutu isimli bir class olu�tural�m.
 * 			 i�erisine kutuNumarasi ve paraMiktari diye iki tane integer olu�tural�m.
 * 			 
 *
 * 			 ayr�ca paraMiktar�n� ve kutuNumarasini almak i�in 
 * 			 "getter" methodlar�m�z� olu�tural�m.
 * 
 * 			 constructor ile de ayr�ca bu iki de�i�kenin verilerini, obje olu�tururken ekleyebilelim.
 * 
 * 3. Ad�m : Kutular� ekleyebilmek, ve kutular �zerinde i�lemler yapabilmek i�in Kutular class� olu�turul�m
 * 			 Olu�turdu�umuz t�m Kutu nesnelerini Kutular a ekleyelim.
 * 			 Bunun i�in Kutular class'� i�erisinde �e�itli methodlar olu�tural�m.
 * 			 Ayr�ca yap�mcinin teklifini de bu class i�erisinden alal�m.
 * 
 * 			 public void kutuEkle(Kutu kutu)
 * 			 kalanKutuSayisiniAl() 
 * 			 kutulardakiToplamParaMiktari()
 * 			 secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
 * 			 public String acilmamisKutulariGoster()
 * 			 public void kutuActir(int kutuNumarasi)
 * 			 public int yapimcininTeklifAl(Kutular kutular , int kendiParaMiktarim)
 * 	
 * 5. Ad�m : Oyunu ba�latal�m, kullan�c�dan se�mek istedi�i kutu numaras�n� alal�m.
 * 
 * 6. Ad�m : Yapimci ad�nda bir tane class class olu�tural�m.
 * 			 Yap�mc� class�ndan bir tane nesne �retelim ve her 3 kutu a��ld��nda
 * 			 kendisinin i�erisindeki teklifVer() methodu ile teklif alal�m.
 * 
 */


public class OyunaGiris {
	static List<Integer> paraListesi = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kutuNumaram , kutumdakiParaMiktari;
	static Kutular kutular = new Kutular();
	
	public static void main(String[]args) {
		paraListesi.add(1);
		paraListesi.add(10);
		paraListesi.add(500);
		paraListesi.add(1000);
		paraListesi.add(5000);
		paraListesi.add(10000);
		paraListesi.add(50000);
		paraListesi.add(100000);
		paraListesi.add(250000);
		paraListesi.add(500000);
		Collections.shuffle(paraListesi);
		System.out.println(paraListesi.toString());
		kutulariOlustur();
		
	}
	private static void kutulariOlustur() {
		for(int i = 0 ; i < 10 ; i++) {
			Kutu kutu = new Kutu();
			kutu.setKutuNumarasi(i + 1); /// 1 2 3 4 5 6 7 8 9 10
			kutu.setKutudakiParaMiktari(paraListesi.get(i));
			System.out.println("Kutu No : " + ( i + 1 ) + " Para Miktar� : " + paraListesi.get(i));
		}
		
	}

}
