package variables;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
				
		//De fem räknesätten
		System.out.println("Write two numbers");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
	
		//addition
		int sum = number1 + number2;
		
		System.out.println("The sum is: " +sum);
		
		//alternativ
		System.out.println(number1 + number2);
		
		//substraktion
		int diff = number1 - number2;
		
		System.out.println("The difference is: " +diff);
		
		//multiplikation
		int product = number1 * number2;
		
		System.out.println("The product is: " +product);
		
		//division
		
		double quota = number1 * 1.0 / number2; //för att få en kvot med decimaler krävs en ingående del med decimaler
		
		System.out.println("The quota is: " +quota);
		
		//större uträkning
		double calc = (number1 + number2) *1.0 / (number1 - number2);
		
		System.out.println("The calculation is: " +calc);
		
		//resten vid division (moduloberäkningar)
		int rest = number1 % number2;
		
		System.out.println("The rest after division is: " +rest);
		
		//tidsomvandling algorithm
		int time = 276345;
		
		int hour = time / 3600;

		int min = (time % 3600) / 60;
		
		int sec = time % 60;
				
		System.out.println("The time is " +hour +" hours, " +min +" minutes and " +sec +" seconds");
		
		
	}

}
