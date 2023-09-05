package pu2;

import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an age"); //input av åldern
		
		int age = input.nextInt();
		
		if(age < 30) {						//om yngre än 30
			System.out.println("Young");
		}
		else if(age >= 30 && age < 40) { 	//om 35 <= age < 40
			System.out.println("Middle aged");
		}
		else if(age >= 40 && age < 65) {	//om 40 <= age < 65
			System.out.println("Over middle aged");
		}
		else {
			System.out.println("Old");
		}
		
	}

}
