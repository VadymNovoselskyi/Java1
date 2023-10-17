package extra;

import java.util.Scanner;

public class hexadecimalConvertor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer to convert it to binary code");
		
		int integer = input.nextInt(); //heltal
		char[] hexadecimal = new char[50]; //array för hexadecimal form av 'integer'

		int exponent; //lagrar störst exponent till potens med bas 16 som är lika med eller midre än 'integer'
		int multiple; //lagrar störst multipel till potens med bas 16 och exponent = 'exponent' så att produkten blir mindre eller lika med 'integer'
		
		int placeInHexadecimal = 0; //används för att sätta rätt hexadecimal sifra på rätt plats
		
		boolean run = true; //boolean som kör do-while
		
		do {
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			exponent = (int)(Math.log10(integer) / Math.log10(16)); //beräkna exponent till en potens som är mindre eller lika med 'integer' (1)
			multiple = (int)(integer / Math.pow(16, exponent));
			
			if(multiple < 10) {
				hexadecimal[placeInHexadecimal] = String.format("%d", multiple).charAt(0);
			}
			else {
				hexadecimal[placeInHexadecimal] = (char)(multiple + 55);
			}
			
			integer -= multiple * Math.pow(16, exponent);
			
			for(int i = 1; (int)Math.pow(16, exponent - i) > integer; i++) { //om ny 'integer' är mindre än 16^exponent så måste ställas noll på plats av det exponent(3)
				placeInHexadecimal++; //sätta 0 på plats 
			}

			placeInHexadecimal++;

			if(integer == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till hexadecimal variant
				run = false;
			}
		} while(run);

		for(int i = 0; i < placeInHexadecimal; i++) { //utmatning av binar form
			System.out.print(hexadecimal[i]);
		}
		
	}

}
