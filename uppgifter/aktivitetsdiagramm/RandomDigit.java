package aktivitetsdiagramm;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class RandomDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int digit = (int)(Math.random() * 10); //skapa random siffra
				
		System.out.println("Enter a single digit");
		int guess = input.nextInt(); //inmatning av gisning
		
		boolean run = true;
		
		do {			
			if(digit > guess) {
				System.out.println("Guess higher");
				guess = input.nextInt(); //inmatning av en gissning till
			}
			else if(digit < guess) {
				System.out.println("Guess lower");
				guess = input.nextInt(); //inmatning av en gissning till
			}
			else {
				System.out.println("Correct!");
				run = false; //avbrytning av do-while
			}
		} while(run);

	}

}
