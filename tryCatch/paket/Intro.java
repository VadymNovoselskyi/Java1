package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);

		try {			
			System.out.println("Input an integer");
			int number = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("It wasn't an integer");
			e.printStackTrace(); //skriver ut felet
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
