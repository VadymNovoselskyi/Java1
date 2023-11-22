package puMetoderExtra;

public class Uppgift02 {

	public static void main(String[] args) {
		System.out.println(getBigger("Hello bigger world"));
		System.out.println(getBigger("hello smaller world"));
		
	}
	public static String getBigger(String string) {
		if((int)string.charAt(0) <= 90 && (int) string.charAt(0) >= 65) {
			return string;
		}
		else {
			char biggerVersion = (char)(((int)string.charAt(0)) - 32);
			String biggerString = biggerVersion + string.substring(1);
			return biggerString;
		}
	}

}
