package pu2;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		if(number1 < number2 && number1 < number3) {					//om number1 är mindre än number2 och number3
			System.out.println("First number is the smallest " +number1);
		}
		else if(number1 > number2 && number2 < number3) {				//om number2 är mindre än number1 och number3
			System.out.println("Second number is the smallest " +number2);
		}
		else {
			System.out.println("Third number is the smallest " +number3);
		}
		
	}

}
