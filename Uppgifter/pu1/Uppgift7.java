package pu1;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word in Swedish"); //begäran om ett svensk ord
		
		String sweWord = input.next(); //input av svenska ordet
		
		System.out.println("Enter the same word in English"); //begäran om samma ors fast på engelska
		
		String engWord = input.next(); //input av samma ord på engelska
		
		System.out.println(sweWord + " is called " + "\"" + engWord + "\" " + "in English"); //output av frasen
		
	}

}
