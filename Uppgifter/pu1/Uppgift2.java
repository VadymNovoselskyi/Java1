package pu1;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input you value of temperature in F");
		
		//input av temperaturen
		
		double tempF = input.nextDouble();
		double tempC = (tempF - 32) * 0.56; //formel för att omvandla F till C
		
		System.out.println("The temperature in C is: " +tempC); //output av temperaturen i Celsius

	}

}
