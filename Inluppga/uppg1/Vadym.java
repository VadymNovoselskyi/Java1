package uppg1;

import java.util.Scanner;

public class Vadym {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //scanner-objekt

		int amount; //belopp som användaren själv mätter in
		int dice1; //vad visar den första tärningen
		int dice2; //vad visar den andra tärningen
		int totalAmount = 0; //total belopp som användaren satsade
		int totalWin = 0; //totalt belopp som användaren har vunnit

		boolean run = true; //boolean som kör do-while
		int choice; //val om man vill förtsätta att satsa, eller avsluta

		do {
			System.out.println("Enter amount of money you want to bet");
			amount = input.nextInt(); //inmatning av satsning
			totalAmount += amount; //lägger till sista satsningen till summan av alla satsningar
			dice1 = (int)(Math.random() * 6 + 1); //värde på den första tärningen 1-6
			dice2 = (int)(Math.random() * 6 + 1); //värde på den andra tärningen 1-6
			System.out.println("Dice 1: " +dice1 +"\n" +"Dice 2: " +dice2); //utmatning av värderna på tärningarna
			if(dice1 == 1 && dice2 == 6 || dice1 == 6 && dice2 == 1) { //om en av tärningarna är 1 och den andra är 6
				System.out.println("Double win! " +amount*3 +"kr");	
				totalWin += amount * 3;
			}
			else if(dice1 + dice2 == 7) { //om summan av värde på tärningarna är 7
				System.out.println("Win! " +amount*2 +"kr");
				totalWin += amount * 2;
			}
			else if(dice1 == dice2) { //om värde på tärningarna är lika
				System.out.println("Pair! " +amount +"kr");
				totalWin += amount;
			}
			else { //om inget av villkoren uppfylls förlorar användaren
				System.out.println("Loose ;(");
			}
			System.out.println("\nDo you want to continue? \n[1]Yes \n[2]No"); //vall att förtsätta
			choice = input.nextInt();
			if(choice == 2) { //om användaren väljer [2], då avbryts do-while 
				run = false;
			}

		} while(run);

		System.out.println("\nYou bet " +totalAmount +"kr totally, and won " +totalWin +"kr."); //utmatning av totall belopp och total vinst
		if(totalAmount > totalWin) { //hur mycket har man förlorat
			System.out.println("You've lost " +(totalAmount - totalWin) +"kr. Better luck next time, loser");
		}
		else if(totalAmount == totalWin) { //om användaren inte har vunnit eller förlorat något
			System.out.println("You didn't win nor lost anything!");
		}
		else { //hur mycket har man vunnit
			System.out.println("You've raised " +(totalWin - totalAmount) +"kr. Lucky day!");
		}
	}

}
