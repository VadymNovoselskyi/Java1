package pu3;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[100]; //array för att spara alla tal
		
		int choice; //variabel för menu
		int count = 0; //antal tal använderen mätt in
		double sum = 0; //används för att beräkna medelväde
		double min = 0; //används för att beräkna variationsbredden
		double max = 0; //används för att beräkna variationsbredden
		boolean run = true; //används för do-while
		
		do {
			System.out.println("[1] Enter new number");
			System.out.println("[2] Calculate average of the numbers");
			System.out.println("[3] Calculate the variation width");
			System.out.println("[4] Finish");
			
			choice = input.nextInt();

			if(choice == 1) {
				System.out.println("Enter new number");
				number[count] = input.nextDouble();
				count++;
			}
			else if(choice == 2) {
				for(int i = 0; i <= count; i++) {
					sum += number[i];				//summa av alla värden i array
				}
				System.out.println("Averages of the numbers is " +sum/count);
			}
			else if(choice == 3) {
				for(int i = 0; i <= count; i++) {
					if(number[i] < min) { 			//kollar efter det minsta värde i array
						min = number[i];
					}
					else if(number[i] > max) {		//kollar efter det största värde i array
						max = number[i];
					}
				}
				System.out.println("Variation width is " +(max-min));
			}
			else if(choice == 4) {
				run = false;				//avbryta do-while
			}
			else {
				System.out.println("Wrong value");
			}
			
		} while(run);

	}

}
