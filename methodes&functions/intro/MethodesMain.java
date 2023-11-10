package intro;

public class MethodesMain {

	public static void main(String[] args) {
		//metod test:
		int square = square(5);
		
		System.out.println(square);

		print("Hello world");
		
		System.out.println(character("Hello world", 3));
		
		//test av extern metod:
		
		char letter = character("Vadårå?", 3);
		
		if(ExternalMethodes.charTest(letter)) {
			print("Versal");
		}
		else {
			print("Gemen");
		}
		
	}
	//statisk funktion går att köra direkt
	//public/protected/private static 'returtyp' 'namn'('indata', 'indata')
	
	public static int square(int number) {
		int square = number * number;
		return square;
	}
	
	//metod som returnerar ett tecken
	public static char character(String text, int index) {
		char character = text.charAt(index);
		return character;
	}
	
	//metod utan retur
	//utskrift av text
	public static void print(String output) {
		System.out.println(output);
	}
	
}
