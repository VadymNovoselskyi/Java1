package puTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0;

		boolean run = true;
		boolean errorFree = true;
		do {
			try {			
				System.out.println("Enter an integer");
				number = input.nextInt();
				errorFree = true;
			} catch(Exception e) {
				System.out.println("Please enter an integer");
				errorFree = false;
				input.next();
			}
			if(errorFree) {
				run = false;
			}
		} while(run);
		
		char[] charArray = new char[number];
		
		boolean run2 = true;
		int choice;
		do {			
			System.out.println("What place in array you want to fill in");
			int replaceIndex = input.nextInt();
			System.out.println("What character you want to fill in");
			char replaceChar = input.next().charAt(0);
			
			changeCharArray(charArray, replaceIndex, replaceChar);
			
			System.out.println("\nDo you want to continue? \n[1] Yes \n[2] No");
			choice = input.nextInt();
			
			if(choice == 2) {
				run2 = false;
			}
		} while(run2);

	}

	public static void changeCharArray(char[] charArray, int replaceIndex, char replaceChar) {
		charArray[replaceIndex] = replaceChar;
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.println("'" +charArray[i] +"'");
		}
	}
	
}
