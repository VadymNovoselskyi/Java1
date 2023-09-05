package pu1;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		//scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		//input av namnet
		String name = input.nextLine();
		
		char firstInitial = name.charAt(0); //ta fram den först initialen
		
		int space = name.indexOf(" "); //index av mellanslag
		
		System.out.println(space);
		
		char secondInitial = name.charAt(space + 1); //ta fram den andra initialen
				
		System.out.println(firstInitial + " " + secondInitial);

	}

}
