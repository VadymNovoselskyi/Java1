package puMetoderExtra;

public class Uppgift03 {

	public static void main(String[] args) {
		System.out.println(fixTheString("im a strange little string"));
		System.out.println(fixTheString("im a normal little string"));

	}

	static public String fixTheString(String string) {
		return Uppgift02.getBigger(Uppgift01.addComma(string));
	}
	
}
