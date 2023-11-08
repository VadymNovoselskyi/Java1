package puMetoder;

public class Uppgift11 {

	public static void main(String[] args) {
		int test1 = 69;
		int test2 = 459;
		int test3 = 5339;

		for(char a :baseConvertor(test1, 3)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test1, 8)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test1, 28)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test2, 5)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test2, 14)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test2, 26)) {
			System.out.print(a);
		}
		
		System.out.println();

		for(char a :baseConvertor(test3, 8)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test3, 18)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(test3, 34)) {
			System.out.print(a);
		}
	}
	public static char[] baseConvertor(int number, int base) {

		int lengthOfNumber = (int)(Math.log10(number) / Math.log10(base));
		char[] newBase = new char[lengthOfNumber + 1]; //array för hexadecimal form av 'integer'

		int exponent; //lagrar störst exponent till potens med bas 16 som är lika med eller midre än 'integer'
		int multiple; //lagrar störst multipel till potens med bas 16 och exponent = 'exponent' så att produkten blir mindre eller lika med 'integer'

		int placeInNewBase = 0; //används för att sätta rätt hexadecimal sifra på rätt plats

		boolean run = true; //boolean som kör do-while

		do {
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			exponent = (int)(Math.log10(number) / Math.log10(base)); //beräkna störts exponent till potens som är mindre eller lika med 'integer'
			multiple = (int)(number / Math.pow(base, exponent)); //beräkna störst multipel till potens som är mindre eller lika med 'integer'

			if(multiple < 10) {
				newBase[placeInNewBase] = String.format("%d", multiple).charAt(0);
			}
			else {
				newBase[placeInNewBase] = (char)(multiple + 55);
			}

			number -= multiple * Math.pow(base, exponent);

			for(int i = 1; (int)Math.pow(base, exponent - i) > number; i++) { //om ny 'integer' är mindre än 16^exponent så måste ställas noll på plats av det exponent(3)
				placeInNewBase++; //sätta 0 på plats 
			}

			placeInNewBase++;

			if(number == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till hexadecimal variant
				run = false;
			}
		} while(run);

		return newBase;
	}
}
