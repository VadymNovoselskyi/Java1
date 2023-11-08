package puMetoder;

public class Uppgift06 {

	public static void main(String[] args) {
		System.out.println(isItANumber('a'));
		System.out.println(isItANumber('X'));
		System.out.println(isItANumber(' '));
		System.out.println(isItANumber('5'));
		
	}
	public static boolean isItANumber(char character) {
		if(character <= 57 && character >= 48) {
			return true;
		}
		else {
			return false;
		}
	}
}
