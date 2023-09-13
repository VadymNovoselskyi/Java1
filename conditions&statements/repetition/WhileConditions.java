package repetition;

import java.util.Scanner;

public class WhileConditions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Villkorsstyrda repetitioner t.ex hur många 5% höjningar motsvarar en dubblering
		
		double factor = 1;
		int count = 0;
		
		while(factor <= 2) {
			factor *= 1.05;
			count++;
		}
		System.out.println(factor + " " +count);

		//en del av programmet som körst tills vi avlutar
		
		boolean run = true; //variable som styr repetitionen
		char choise;
		
		do {		//do-while testar villkoret efter körning
			System.out.println("Do you want to stop? y/n");
			choise = input.next().charAt(0);
			if (choise == 'y') {
				run = false;
			}
			
		}while(run);
		
	}

}
