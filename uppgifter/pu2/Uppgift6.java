package pu2;

import java.util.Scanner;

public class Uppgift6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters"); //input v två karaktär
		
		char character1 = input.next().charAt(0);
		char character2 = input.next().charAt(0);
		
		if(character1 == 'a' && character2 != 'a') { //om bara character1 är 'a'
			System.out.println("Win");
		}
		else if(character1 != 'a' && character2 == 'a') {  //om bara character2 är 'a'
			System.out.println("Win");
		}
		else {
			System.out.println("Loss");
		}
		
	}

}
