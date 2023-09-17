package extra;

import java.util.Scanner;

public class Uppgift04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int guessHigh = 100;
		int guess = 50;
		int guessLow = 0;

		int answer;
		int choise;
		boolean runInner = true;
		boolean runOuter = true;

		do { //do-while som kör hela programet om och om igen om användaren väljer att förtsätta vidare
			int count = 0; //variabel som räknar antal gissningar
			System.out.println("Think about a number 1-100");
			do {
				System.out.println("Did you think about " +guess +" ?");
				System.out.println("[1] Yes, this is the right number");
				System.out.println("[2] No, guess higher");
				System.out.println("[3] No, guess lower");
				answer = input.nextInt();

				count++;

				if(answer == 1) {
					runInner = false; //avbrytning av inner do-while
				}
				else if(answer == 2) {
					guessLow = guess;
					guess = (int)(guessHigh - ((guessHigh - guess) / 2)); //tilldela värde till guess mittemellan högre gränsen och nuvarnde värde
				}
				else {
					guessHigh = guess;
					guess = (int)(guess - ((guess - guessLow) / 2)); //tilldela värde till guess mittemellan nuvarnde värde och nedre gränsen
				}
			} while(runInner);
			System.out.println("The correct number is: " +guess +" and the number of guesses is: " +count);
			System.out.println("[1] Yes, continue");
			System.out.println("[2] No, stop");

			choise = input.nextInt();
			if(choise == 1) {
				runInner = true; //köra inner do-while igen
			}
			else {
				runOuter = false; //avbryta outer do-while dvs hela programmet
			}
		} while(runOuter);
	}

}
