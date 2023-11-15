package pu1;

import java.util.Scanner;

public class Uppgift03 {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 ages");
		
		//input av tre ålderna
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		
		double avgAge = (age1 + age2 + age3) / 3.0; //beräkning av medelåldern
		
		//Output av medelåldern
		System.out.println("The average age is " +avgAge);
		
	}

}
