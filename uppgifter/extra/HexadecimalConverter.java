package extra;

import java.util.Scanner;

public class HexadecimalConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer to convert it to hexadecimal");
		
		int integer = input.nextInt(); //heltal
		int lengthOfNumber = (int)(Math.log10(integer) / Math.log10(16)) + 1; //antal siffror som behövs för att skriva 'integer' i bas 16
		char[] hexadecimal = new char[lengthOfNumber]; //array för hexadecimal form av 'integer'

		int exponent; //lagrar störst exponent till potens med bas 16 som är lika med eller midre än 'integer'
		int multiple; //lagrar störst multipel till potens med bas 16 och exponent = 'exponent' så att produkten blir mindre eller lika med 'integer'
		
		int placeInHexadecimal = 0; //används för att sätta rätt hexadecimal sifra på rätt plats
		
		boolean run = true; //boolean som kör do-while
		
		do {
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			exponent = (int)(Math.log10(integer) / Math.log10(16)); //beräkna störts exponent till potens som är mindre eller lika med 'integer'
			multiple = (int)(integer / Math.pow(16, exponent)); //beräkna störst multipel till potens som är mindre eller lika med 'integer'
			
			if(multiple < 10) { //om multipel är en sifra (0 - 9)
				hexadecimal[placeInHexadecimal] = String.format("%d", multiple).charAt(0); //sätta in 'multiple' i en char arrray
			}
			else { //om multipel är en bokstav (A - G)
				hexadecimal[placeInHexadecimal] = (char)(multiple + 55); //omvnandla multipel till en stor bokstav
			}
			
			integer -= multiple * Math.pow(16, exponent);
			
			for(int i = 1; (int)Math.pow(16, exponent - i) > integer; i++) { //om ny 'integer' är mindre än 16^exponent så måste ställas noll på plats av det exponent
				placeInHexadecimal++;
				hexadecimal[placeInHexadecimal] = String.format("%d", 0).charAt(0); //sätta in 0 på plats
			}

			placeInHexadecimal++;

			if(integer == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till hexadecimal variant
				run = false;
			}
		} while(run);

		for(char a :hexadecimal) { //utmatning av 'integer' i hexadecimal form
			System.out.print(a);
		}
		
	}

}
