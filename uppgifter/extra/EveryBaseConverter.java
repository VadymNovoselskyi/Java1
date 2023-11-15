package extra;

public class EveryBaseConverter {

	public static void main(String[] args) {

		for(char a :baseConvertor(12646, 16)) {
			System.out.print(a);
		}
		
		System.out.println();
		
		for(char a :baseConvertor(1244, 20)) {
			System.out.print(a);
		}
		
		
	}

	public static char[] baseConvertor(int number, int base) {

		int lengthOfNumber = (int)(Math.log10(number) / Math.log10(base)) + 1;
		char[] newBase = new char[lengthOfNumber]; //array för hexadecimal form av 'integer'

		int exponent; //lagrar störst exponent till potens med bas 'base' som är lika med eller midre än 'integer'
		int multiple; //lagrar störst multipel till potens med bas 'base' och exponent = 'exponent' så att produkten blir mindre eller lika med 'integer'

		int placeInNewBase = 0; //används för att sätta rätt hexadecimal sifra på rätt plats

		boolean run = true; //boolean som kör do-while

		do {
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			exponent = (int)(Math.log10(number) / Math.log10(base)); //beräkna störts exponent till potens som är mindre eller lika med 'integer'
			multiple = (int)(number / Math.pow(base, exponent)); //beräkna störst multipel till potens som är mindre eller lika med 'integer'

			if(multiple < 10) { //om multipel är en sifra (0 - 9)
				newBase[placeInNewBase] = String.format("%d", multiple).charAt(0); //sätta in 'multiple' i en char arrray
			}
			else { //om multipel är en bokstav (A - G)
				newBase[placeInNewBase] = (char)(multiple + 55); //omvnandla multipel till en stor bokstav
			}

			number -= multiple * Math.pow(base, exponent);

			for(int i = 1; (int)Math.pow(base, exponent - i) > number; i++) { //om ny 'integer' är mindre än 16^exponent så måste ställas noll på plats av det exponent
				placeInNewBase++;
				newBase[placeInNewBase] = String.format("%d", 0).charAt(0); //sätta in 0 på plats
			}

			placeInNewBase++;

			if(number == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till hexadecimal variant
				run = false;
			}
		} while(run);

		return newBase;
	}
}
