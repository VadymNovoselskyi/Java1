package selection;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("[1] Alternative one\n[2] Alternative two\n[3] Alternative three\n[4] Help");

		int choise = input.nextInt();

		switch(choise) {
		case 1:
			System.out.println("You chose alternative one");
			break;
		case 2:
			System.out.println("You chose alternative two");
			break;
		case 3:
			System.out.println("You chose alternative three");
			break;
		case 4:
			System.out.println("You chose alternative four");
			break;
		default:
			System.out.println("Incorrect choise");
		}
		
		//en switch-case där alternativen styrs av text
		System.out.println("What day is it today?");
		
		String trash = input.nextLine();
		String day = input.nextLine();
		
		switch(day.toLowerCase()) {
		case "monday":
			System.out.println("Tuesday");
		case "tuesday":
			System.out.println("Wednesday");
		case "wednesday":
			System.out.println("Thursday");
		case "thursday":
			System.out.println("Friday");
		case "friday":
			System.out.println("Saturday");
		case "saturday":
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Incorrect input, check your spelling");
		}

	}

}
