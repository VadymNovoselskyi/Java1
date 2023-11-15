package extra;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer to convert it to binary code");

		
		int integer = input.nextInt(); //heltal
		int[] binary = new int[50];  //array för binära tal

		int exponent; //lagrar störst exponent till potens med bas 2 som är lika med eller midre än 'integer'
		int placeInBinary = 0; //används för att sätta ettor på rätta platser

		boolean run = true; //boolean som kör do-while

		do { //detta loop fungerar på följande sätt:
			//först bestämms det största potens av 2 som är mindre eller lika med 'integer' (1)
			//då ställs ettan på ställe av det potens och substraheras värde av det potens från 'integer' (2)
			//efter det kontrolleras om följande potens (1 mindre) är större än 'integer'
			//om det är så, så ställs 0 på platts av det potens (3)
			
			exponent = 0; //återställa exponent, eftersom 'integer' minskas varje gång do-while körs
			
			exponent = (int)(Math.log10(integer) / Math.log10(2)); //beräkna exponent till en potens som är mindre eller lika med 'integer' (1)

			binary[placeInBinary] = 1; //sätter ettan på rätt platts (2)
			integer -= Math.pow(2, exponent); //substrahera värde av ettan som precis ställdes på rätt plats (2)

			for(int i = 1; (int)Math.pow(2, exponent - i) > integer; i++) { //om ny 'integer' är mindre än 2^exponent så måste ställas noll på plats av det exponent(3)
				placeInBinary++; //sätta 0 på plats 
			}

			placeInBinary++;

			if(integer == 0) { //avbryta do-while om 'integer' är noll, då har integer konverterats till binär tal
				run = false;
			}

		} while(run);

		System.out.println();

		for(int i = 0; i < placeInBinary; i++) { //utmatning av binar form
			System.out.print(binary[i]);
		}
		
	}

}
