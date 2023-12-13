package puTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0; //antal platser i charArray som användare bästemmer

		boolean run = true; //boolean som kör ytre do while
		System.out.println("Enter an integer");
		do {
			try {			
				number = input.nextInt();
				run = false; //om input är rätt, slutar do-while
			} catch(Exception e) { //om användaren mäter inte en heltal
				System.out.println("Please enter an integer");
				run = true; //om input orsakar något fel, körs do-while en gång till så användaren får en chans till
				input.next(); //behövs för att kuna göra input på line 17
			}
		} while(run);
		
		char[] charArray = new char[number];
		
		int replaceIndex = 0; //index i charArray som ska ändras
		run = true; //boolean som kör do-while
		int choice;
		do {
			System.out.println("What place in array you want to fill in");
			replaceIndex = input.nextInt();
			System.out.println("What character you want to fill in");
			char replaceChar = input.next().charAt(0); //bokstav som ska ställas på index replaceIndex
			
			//metod som placerar char replaceChar på index replaceIndex i charArray
			changeCharArray(charArray, replaceIndex, replaceChar); 
			
			System.out.println("\nDo you want to continue? \n[1] Yes \n[2] No");
			choice = input.nextInt(); //val om man vill ändra fler bokstaver
			
			if(choice == 2) { //om man väljer att avlsluta programmet
				System.out.print(";(");
				run = false;
			}
		} while(run);

	}

	//metod som placerar char replaceChar på index replaceIndex i charArray
	public static void changeCharArray(char[] charArray, int replaceIndex, char replaceChar) {
		Scanner input = new Scanner(System.in); //input i fall man mätte in fel index
		
		boolean outOfBounds = false; //om index som man mätte in är out of bounds för charArray
		do {			
			try {			
				charArray[replaceIndex] = replaceChar; //prova att placera char replaceChar på index replaceIndex
				outOfBounds = false; //om try-catch catchar inte error, då index är in bounds
			} catch (ArrayIndexOutOfBoundsException e) { //om replaceIndex är mindre eller större än indexer som finns i charArray
				outOfBounds = true; //markera index som out of bounds
				System.out.println("Wrong index, try again");
				replaceIndex = input.nextInt(); //mäta in ny index
			}
		} while(outOfBounds);
		
		for(int i = 0; i < charArray.length; i++) { //printa ut charArray
			System.out.println("'" +charArray[i] +"'");
		}
	}
	
}
