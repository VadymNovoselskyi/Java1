package pu3;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[100];
		
		int choise;
		int i = 0;
		boolean run = true;
		
		do {
			System.out.println("[1] Enter new number");
			System.out.println("[2] Calculate average of the numbers");
			System.out.println("[3] Calculate the variation width");
			System.out.println("[4] Finish");
			
			choise = input.nextInt();

			if(choise == 1) {
				number[i] = input.nextDouble();
				i++;
			}
			else if(choise == 2) {
				
			}
			else if(choise == 3) {
				
			}
			else {
				
			}
			
			
			if (choise.equalsIgnoreCase("no")) {
				run = false;
			}
			
		} while(run);

	}

}
