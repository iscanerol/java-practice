package pratikdersi;

public class ArraydaEnBuyukSayi {
	/* Elimizdeki Array'in en büyük sayýsýný bulup, return yapan bir method yazýnýz.
	 * 
	 * getEnBuyukSayi(int[] array)
	 * 
	 * 14 geçe baþlayalým
	 * */
	public static void main(String[] args) {
		int[] array = {12,56,788,4,1,0,999,4};
		int enBuyukSayi = getEnBuyukSayi(array);
		System.out.println("En büyük sayý :" + enBuyukSayi);
	}
	private static int getEnBuyukSayi(int[] array) {
		int max = 0;
		for(int i = 0 ; i < array.length ; i++) {  
			if(array[i] > max) {   //  12 > 0       56 > 12      788 > 56    4 > 788   1 > 788    0 > 788    999 > 788   4 > 999                   
				max = array[i];	   //  max = 12     max = 56    max  = 788   -------   -------    -------    max = 999   -------
			}
		}
		return max;
	}
}





