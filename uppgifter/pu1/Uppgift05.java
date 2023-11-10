package pu1;

import java.util.Scanner;

public class Uppgift05 {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amoutn of money");
		
		//input av belopp
		int money = input.nextInt();
		
		int kr200 = money / 200; //antal sedlar med värde av 200kr
		
		int rest = money % 200; //den som återstår efter man drar ut alla 200 kr banknoter
		
		int kr100 = rest / 100; //antal sedlar med värde av 100kr
		
		rest = rest % 100; //den som återstår efter man drar ut alla 100 kr banknoter
		
		int kr50 = rest / 50; //antal sedlar med värde av 50kr
		
		rest = rest % 50; //den som återstår efter man drar ut alla 50 kr banknoter
		
		int kr20 = rest / 20; //antal sedlar med värde av 20kr
		
		rest = rest % 20; //den som återstår efter man drar ut alla 20 kr banknoter
		
		int kr5 = rest / 5; //antal sedlar med värde av 5kr
		
		rest = rest % 5; //den som återstår efter man drar ut alla 5 kr banknoter
		
		int kr1 = (rest % 5); //antal sedlar med värde av 1kr
		
		System.out.println("You've got " +kr200+ " banknote(s) of 200 kr, " +kr100 + " banknote(s) of 100 kr, " +kr50 + " banknote(s) of 50 kr, " +kr20 + " banknote(s) of 20 kr, " +kr5 + " banknote(s) of 5 kr and "  +kr1 + " banknote(s) of 1kr" );
		
	}

}
