package arabaprojesi;

public class Runner {

	public static void main(String[] args) {

		String str = "ali";
		String orta = str.substring(1, str.length()-1);
	 String	str1 =str.charAt(str.length()-1) + orta + str.charAt(0);
		System.out.println(str1);
	}
}
