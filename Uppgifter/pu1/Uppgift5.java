package pu1;

import java.util.Scanner;

public class Uppgift5 {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input amoutn of money");
		
		//input av belopp
		int money = input.nextInt();
		
		int kr200 = money / 200; //antal sedlar med värde av 200kr
		int kr100 = (money % 200) / 100; //antal sedlar med värde av 100kr
		int kr50 = (money % 100) / 50; //antal sedlar med värde av 50kr
		int kr20 = (money % 50) / 20; //antal sedlar med värde av 20kr
		int kr5 = (money % 20) / 5; //antal sedlar med värde av 5kr
		int kr1 = (money % 5); //antal sedlar med värde av 1kr
		
		System.out.println("You've got " +kr200+ " banknote(s) of 200 kr, " +kr100 + " banknote(s) of 100 kr, " +kr50 + " banknote(s) of 50 kr, " +kr20 + " banknote(s) of 20 kr, " +kr5 + " banknote(s) of 5 kr and "  +kr1 + " banknote(s) of 1kr" );

	}

}
