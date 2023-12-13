package puTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift02 {

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

	}

}
