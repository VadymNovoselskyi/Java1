package pu3;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write height of the triangle");
		int height = input.nextInt();
		String row = "*"; //grunden för triangel
		
		for(int i = 0; i < height; i++) {
			System.out.println(row);
			row += "*"; 					//lägga till en '*' för varje ny rad
		}

	}

}
