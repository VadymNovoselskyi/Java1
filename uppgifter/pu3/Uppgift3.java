package pu3;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[100];
		
		String choice;
		String trash;
		int i = 0;
		boolean run = true;
		
		do {
			System.out.println("Write a decimal number");
			number[i] = input.nextDouble();
			i++;
			
			System.out.println("Do you want to add another one? yes/no");
			trash = input.nextLine();
			choice = input.nextLine();
			
			if (choice.equalsIgnoreCase("no")) {
				run = false;
			}
			
		} while(run);

	}

}
