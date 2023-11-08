package pu1;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter value of base");
		
		//input av basen och höjden
		int base = input.nextInt();
		
		System.out.println("Enter value of height");
		
		int height = input.nextInt();
		
		System.out.println("The area is: " + (base * height) / 2);

	}

}
