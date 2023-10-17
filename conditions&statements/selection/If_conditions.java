package selection;

import java.util.Scanner;

public class If_conditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// if-satser stuyrs av logiska uttryck så kallade "villkor" ett villkor kan
		// antigen vara sant eller falskt

		// variabler
		int intigerNumber = 2;
		double decimalNumber = 2.5;
		char character = 'v';
		boolean choice = true;

		// skriver ut en logisk utsaga
		System.out.println(intigerNumber == 2);
		System.out.println(intigerNumber == 3);

		// if-sats som styrs av en likhet
		if (intigerNumber == 2) {
			System.out.println("Integer's value equals to 2");
		}
		// om if-blocket ej köras så körs else-blocket
		else {
			System.out.println("Integer's value does not equals 2");
		}

		// decimaltal i ett interval: -2 < x < 3 flera villkor med "och"-&& eller
		// "eller"-|| (altGr + <)
		if (decimalNumber > -2 && decimalNumber < 3) {
			System.out.println("The decimal number's value is between -2 and 3");
		} else if (decimalNumber >= 3 && decimalNumber < 5) {
			System.out.println("The decimal number's value is between 3 and 5");
		} else {
			System.out.println("The decimal number's value is either more than 5, or less than -2");
		}

		// tecknet ska inte vara ett k
		if (character != 'k') {
			System.out.println("The character is not a 'k'");
		}

		// styra med boolskvariabel
		if (choice) {
			System.out.println("The choise is 'true'");
		}

		if (true) {
			// kodeblovket körs alltid
		}

		// styra if-satser med metoder/funktioner
		String username = "novoselskyi.vadim@gmail.com";
		String password = "password1234";

		// inloggning
		System.out.println("Enter username");
		String usernameInput = input.nextLine();

		System.out.println("Enter password");
		String passwordInput = input.nextLine();

		if (username.equalsIgnoreCase(usernameInput) && password.equalsIgnoreCase(passwordInput)) {
			System.out.println("Welcome " + usernameInput);
		} else {
			System.out.println("Password or username can not be found in the database");
		}

	}

}
