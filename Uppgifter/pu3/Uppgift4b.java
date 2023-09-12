package pu3;

import java.util.Scanner;

public class Uppgift4b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[100];
		
		String choise;
		String trash;
		int count = 0;
		boolean run = true;
		
		do {
			System.out.println("Write a decimal number");
			number[count] = input.nextDouble();
			count++;
			
			System.out.println("Do you want to add another one? yes/no");
			trash = input.nextLine();
			choise = input.nextLine();
			
			if (choise.equalsIgnoreCase("no")) {
				run = false;
			}
			
		} while(run);
		
		for(int i = number.length - 1; i >= 0; i--)
			if(number[i] != 0) {				
				System.out.println(number[i]);
			}
	}

}
