package pu2;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age"); //input av åldern
		int age = input.nextInt();
		
		if(age > 17) { 						//om äldre än 17
			System.out.println("Adult");
		}
		else {								 //om inte äldre än 17
			System.out.println("Not adult");
		}

	}

}
