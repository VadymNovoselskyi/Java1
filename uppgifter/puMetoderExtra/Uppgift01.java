package puMetoderExtra;

public class Uppgift01 {

	public static void main(String[] args) {
		System.out.println(addComma("vgifja."));
		System.out.println(addComma("fkjla"));
		System.out.println(addComma("v...gifja"));

	}
	static public String addComma(String string) {
		int stringLength = string.length();
		if(string.charAt(stringLength - 1) == '.') {
			return string;
		}
		else {
			string += '.';
			return string;
		}
	}

}
