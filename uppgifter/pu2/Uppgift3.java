package pu2;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers"); //input av två heltal
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number1 > number2) {
			System.out.println("Fist number is bigger than second");
		}
		else if(number1 == number2) {
			System.out.println("Fist number equals second");
		}
		else {
			System.out.println("Fist number is smaller than second");
		}
		
	}

}
