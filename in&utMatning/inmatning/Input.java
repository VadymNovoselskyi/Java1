package inmatning;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//skapa ett scannerObjekt
		Scanner input = new Scanner(System.in); //Klassnamn egetNamn = new Klassnamn(indata);
		
		System.out.println("Write a number");
		
		int number = input.nextInt(); //inmatning för heltal
		
		System.out.println("You wrote: " +number);
		
		System.out.println("Write a decimal number");
		
		double floatNumber = input.nextDouble();
		
		System.out.println("You wrote: " +floatNumber);
		
		System.out.println("Write a character");
		
		char character = input.next().charAt(0); //char har ingen nextChar utan får en omständigare
		
	}

}
