package puMetoder;

public class Uppgift10 {

	public static void main(String[] args) {
		int test1 = 239;
		int test2 = 3489;
		int test3 = 636539;

		for(char a :hexadecimalConvertor(test1)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :hexadecimalConvertor(test2)) {
			System.out.print(a);
		}

		System.out.println();
		
		for(char a :hexadecimalConvertor(test3)) {
			System.out.print(a);
		}

	}
	public static char[] hexadecimalConvertor(int number) {

		int lengthOfNumber = (int)(Math.log10(number) / Math.log10(16));
		char[] hexadecimal = new char[lengthOfNumber + 1]; //array för hexadecimal form av 'integer'

		int exponent; //lagrar störst exponent till potens med bas 16 som är lika med eller midre än 'integer'
		int multiple; //lagrar störst multipel till potens med bas 16 och exponent = 'exponent' så att produkten blir mindre eller lika med 'integer'

		int placeInHexadecimal = 0; //används för att sätta rätt hexadecimal sifra på rätt plats

		boolean run = true; //boolean som kör do-while

		do {
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			exponent = (int)(Math.log10(number) / Math.log10(16)); //beräkna störts exponent till potens som är mindre eller lika med 'integer'
			multiple = (int)(number / Math.pow(16, exponent)); //beräkna störst multipel till potens som är mindre eller lika med 'integer'

			if(multiple < 10) {
				hexadecimal[placeInHexadecimal] = String.format("%d", multiple).charAt(0);
			}
			else {
				hexadecimal[placeInHexadecimal] = (char)(multiple + 55);
			}

			number -= multiple * Math.pow(16, exponent);

			for(int i = 1; (int)Math.pow(16, exponent - i) > number; i++) { //om ny 'integer' är mindre än 16^exponent så måste ställas noll på plats av det exponent(3)
				placeInHexadecimal++; //sätta 0 på plats 
			}

			placeInHexadecimal++;

			if(number == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till hexadecimal variant
				run = false;
			}
		} while(run);

		return hexadecimal;
	}
}
