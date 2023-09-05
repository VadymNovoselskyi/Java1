package pu1;

import java.util.Scanner;

public class Uppgift9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal number"); //begäran om input av en decimal tal
		
		double floatNumber = input.nextDouble(); //input av en decimal tal
		
		floatNumber += 0.5; //lägga till 0.5 för att sedan avrunda
		
		int integerNumber = (int)floatNumber; //omvandling till heltal
		
		System.out.println(integerNumber);
	
		

	}

}
