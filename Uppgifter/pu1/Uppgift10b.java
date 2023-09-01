package pu1;

import java.util.Scanner;

public class Uppgift10b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input amount of money you want to deposit");  //begäran om input av belopp
		
		int amountInput = input.nextInt(); //input av belopp
		
		int amountOutput = (int)((amountInput + 99) / 100) * 100;
		/*       		   Avrundning
								  lite matte för att avrunda uppåt*/
		
		int banknotes500 = amountOutput / 500; //antal 500kr sedlar
		
		int kr500 = banknotes500 * 500; //antal pengar i 500kr sedlar
		
		int banknotes100 = (amountOutput % 500) / 100; //antal 100kr sedlar
		
		int kr100 = banknotes100 * 100; //antal pengar i 100kr sedlar
		
		System.out.println("Deposit in 500kr banknotes: " +kr500 + "kr\nDeposit in 100kr banknotes: " +kr100 + "kr");
		
	}

}
