package pu2;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an age"); //input av åldern
		int age = input.nextInt();
		
		if(age <= 50 && age >= 35) { 		//om 35 <= age <= 50
			System.out.println("Middle aged");
		}
		else {								//annars
			System.out.println("Not middl eaged");
		}

	}

}
