package inlupp12;

import java.util.Scanner;

public class Vadym12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner-objekt

		int amount; //belopp som användaren själv mätter in
		int dice1; //vad visar den första tärningen
		int dice2; //vad visar den andra tärningen
		int totalAmount = 0; //total belopp som användaren satsade
		int totalWin = 0; //totalt belopp som användaren har vunnit

		boolean run = true; //boolean som kör do-while
		int choiceRun; //val om man vill förtsätta att satsa, eller avsluta
		int choiseChoHan; //val om man satsar på uddda eller jämnt summa

		do {
			System.out.println("Enter amount of money you want to bet");
			amount = input.nextInt(); //inmatning av satsning
			totalAmount += amount; //lägger till sista satsningen till summan av alla satsningar
			
			System.out.println("\nWhat do you choose? \n[1]Cho (the sum will be even) \n[2]Han (the sum will be odd) \n"); //menu val att satsa på jämnt eller udda summa
			choiseChoHan = input.nextInt();
			
			dice1 = (int)(Math.random() * 6 + 1); //värde på den första tärningen 1-6
			dice2 = (int)(Math.random() * 6 + 1); //värde på den andra tärningen 1-6
			
			if((dice1 + dice2) % 2 == 0 && choiseChoHan == 1) { //om summan är jämnt och man har satsat på det
				totalWin += amount * 2; //man vinner dubbelt så mycket man satsade
				System.out.println("\nDice 1: " +dice1 +"\n" +"Dice 2: " +dice2 +". And the sum is even: " +(dice1 + dice2) +", you won!"); //utmatning av värderna på tärningarna och deras summa
			}
			else if((dice1 + dice2) % 2 != 0 && choiseChoHan == 2) { //om summan är udda och man har satsat på det
				totalWin += amount * 2; //man vinner dubbelt så mycket man satsade
				System.out.println("\nDice 1: " +dice1 +"\n" +"Dice 2: " +dice2 +". And the sum is odd: " +(dice1 + dice2) +", you won!"); //utmatning av värderna på tärningarna och deras summa
			}
			else { //om man satsade på jämnt och summa är udda, eller man satsade påp udda och summan är jämnt
				System.out.println("\nDice 1: " +dice1 +"\n" +"Dice 2: " +dice2 +". And the sum is: " +(dice1 + dice2) +", you lost ;("); //utmatning av värderna på tärningarna och deras summa
			}
			
			System.out.println("\nDo you want to continue? \n[1]Yes \n[2]No \n"); //val att förtsätta
			choiceRun = input.nextInt();
			
			if(choiceRun == 2) { //om användaren väljer [2], då avbryts do-while 
				run = false;
			}
			
		} while(run);

		System.out.println("\nYou bet " +totalAmount +"kr totally, and won " +totalWin +"kr."); //utmatning av totall belopp och totall vinst
		if(totalAmount > totalWin) { //hur mycket man har förlorat
			System.out.println("You've lost " +(totalAmount - totalWin) +"kr. Better luck next time");
		}
		else if(totalAmount == totalWin) { //om användaren inte har vunnit eller förlorat något
			System.out.println("You didn't win nor lost anything!");
		}
		else { //hur mycket man har vunnit
			System.out.println("You've raised " +(totalWin - totalAmount) +"kr. Lucky day!");
		}
	}

}
