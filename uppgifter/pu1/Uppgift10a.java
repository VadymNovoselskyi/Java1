package pu1;

import java.util.Scanner;

public class Uppgift10a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of money you want to deposit");  //begäran om input av belopp
		
		int amountInput = input.nextInt(); //input av belopp
		
		int amountOutput = (int)((amountInput + 99) / 100) * 100;
		/*       		   Avrundning
								  lite matte för att avrunda uppåt*/
		
		System.out.println("Deposit: " +amountOutput + "kr");

	}

}
