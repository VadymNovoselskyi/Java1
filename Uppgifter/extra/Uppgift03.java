package extra;

import java.util.Scanner;

public class Uppgift03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);



		int choice;
		boolean runInner = true;
		boolean runOuter = true;

		do { //do-while som kör hela programet om och om igen om användaren väljer att förtsätta vidare
			int answer = (int)(Math.random() * 100) + 1;	//random tal
			int count = 0; //variabel som räknar antal gissningar
			System.out.println("Enter a number 1-100");
			int guess = input.nextInt(); //inmatning av gisning
			do {
				count++;
				if(answer > guess) {
					System.out.println("Guess higher");
					guess = input.nextInt(); //inmatning av en ny gissning
				}
				else if(answer < guess) {
					System.out.println("Guess lower");
					guess = input.nextInt(); //inmatning av en ny gissning
				}
				else {
					System.out.println("Correct!, number of guesses: " +count);
					runInner = false; //avbrytning av inner do-while
				}
			} while(runInner);
			System.out.println("[1] Yes, continue");
			System.out.println("[2] No, stop");

			choice = input.nextInt();
			if(choice == 1) {
				runInner = true; //köra inner do-while igen
			}
			else {
				runOuter = false; //avbryta outer do-while dvs hela programmet
			}
		} while(runOuter);
	}

}
