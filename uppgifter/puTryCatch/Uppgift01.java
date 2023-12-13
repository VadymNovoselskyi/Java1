package puTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uppgift01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {			
			System.out.println("Enter an integer");
			int number = input.nextInt();
		} catch(Exception e) {
			System.out.println("Please enter an integer");
		}

	}

}
