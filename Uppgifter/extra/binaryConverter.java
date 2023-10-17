package extra;

import java.util.Scanner;

public class binaryConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer to convert it to binary code");

		int integer = input.nextInt(); //heltal
		int[] binary = new int[50];  //array för binära tal

		int count; //det första potens av 2 som är större än 'integer'
		int placeInBinary = 0; //används för att sätta ettor på rätta platser

		boolean run = true; //boolean som kör do-while

		do { //detta loop fungerar på följande sätt:
			//först bestämmer man det första potens av 2 som är större än 'integer' (1)
			//sedan lägs till en ettan på plats av potens som är ett mindre än 'count'
			//dvs det största potens som är mindre eller lika med 'integer' och substraheras värde av det ettan från 'integer' (2)
			//efter det kontrolleras om följande potens (1 mindre) är större än 'integer'
			//om det är så, så ställs 0 på platts av det potens (3)
			count = 0; //återställning av count

			for(int i = 0; Math.pow(2, i) <= integer; i++) { //bestämma det första potens av 2 som är större än 'integer' (1)
				count++;
			}

			binary[placeInBinary] = 1; //sätter ettan på rätt platts (2)
			integer -= Math.pow(2, count - 1); //substrahera värde av ettan som precis ställdes på rätt plats (2)

			for(int i = 2; (int)Math.pow(2, count - i) > integer; i++) { //kontroll om potens är större än 'integer' (3)
				placeInBinary++; //sätta 0 på plats 
			}

			placeInBinary++;

			if(integer == 0) {
				run = false;
			}

		} while(run);

		System.out.println();

		for(int i = 0; i < placeInBinary; i++) {
			System.out.print(binary[i]);
		}

	}

}
