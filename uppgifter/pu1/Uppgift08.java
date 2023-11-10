package pu1;

import java.util.Scanner;

public class Uppgift08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a noun in a singular form");  //begäran om input av en substantiv
		
		String nounSingular = input.nextLine(); //input av en substantiv
		
		System.out.println("Enter it's ending in plural"); //begäran om input av en pluraländelse
		
		String nounEnding = input.nextLine(); //input av en pluraländelse
		
		String nounPlural = nounSingular + nounEnding; //konstruering av ålural formen
		
		System.out.println("A (an) " + nounSingular +", several " + nounPlural);
		
	}

}
