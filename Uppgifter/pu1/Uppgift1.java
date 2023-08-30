package pu1;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input your values of length and width");
		
		//input av längden and bredden

		double length = input.nextDouble();
		double width = input.nextDouble();

		//output av arean
		System.out.println("The area is " +length * width);
	}

}
