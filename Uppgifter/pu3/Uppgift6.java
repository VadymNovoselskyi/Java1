package pu3;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[100];
		
		int choise;
		int count = 0;
		double sum = 0;
		double min = 0;
		double max = 0;
		boolean run = true;
		
		do {
			System.out.println("[1] Enter new number");
			System.out.println("[2] Calculate average of the numbers");
			System.out.println("[3] Calculate the variation width");
			System.out.println("[4] Finish");
			
			choise = input.nextInt();

			if(choise == 1) {
				System.out.println("Enter new number");
				number[count] = input.nextDouble();
				count++;
			}
			else if(choise == 2) {
				for(int i = 0; i <= count; i++) {
					sum += number[i];
				}
				System.out.println("Averages of the numbers is " +sum/count);
			}
			else if(choise == 3) {
				for(int i = 0; i <= count; i++) {
					if(number[i] < min) {
						min = number[i];
					}
					else if(number[i] > max) {
						max = number[i];
					}
				}
				System.out.println("Variation width is " +(max-min));
			}
			else if(choise == 4) {
				run = false;
			}
			else {
				System.out.println("Wrong value");
			}
			
		} while(run);

	}

}
