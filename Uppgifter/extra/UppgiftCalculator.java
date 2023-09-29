package extra;

import java.util.Scanner;

public class UppgiftCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean runOuter = true;
		boolean runInner = true;

		double[] number = new double[100]; //plats för tal som mäts in
		double total; //resultat
		int count = 0;

		int choiseContinueFrom = 1; //varifrån ska man börja, t.ex vill man mätta in fler tal, eller förtsätta med nuvarande

		int choiseAddNumber; //val om man vill eller vill inte mäta in fler tal
		int operation; //val vilken operation ska miniräknare genomföra

		do { 						//do-while som körs tills man avbryter den
			total = 0; //annulera resultat, eftersom vi börjar om

			switch(choiseContinueFrom) {
			case 1: 								//annulera alla tal som sparades från sedan
				for(int i = 0; i <= count; i++) {
					number[i] = 0;
				}
				count = 0;
			case 2:									//mäta in tal
				do {
					System.out.println("Enter a number");
					number[count] = input.nextDouble();
					count++;

					System.out.println("Do you want to add more? \n[1] Yes \n[2] No");
					choiseAddNumber = input.nextInt(); //val om man vill lägga mer tal
					if(choiseAddNumber == 2) {
						runInner = false;
					}
				} while(runInner);
			case 3: 								//välja operaion som ska gnomföras	
				System.out.println("Choose operation \n[1] Addition (+)\n[2] Substraction (-)\n[3] Multiplication (×)\n[4] Division (÷)");
				operation = input.nextInt();

				switch (operation) {
				case 1: //summa
					for(int i = 0; i < count; i++) {
						total += number[i];
					}
					System.out.println("The sum is " +total);
					break;
				case 2: //substraction
					total = number[0];
					for(int i = 1; i < count; i++) {
						total -= number[i];
					}
					System.out.println("The difference is " +total);
					break;
				case 3: //multiplikation
					total = number[0];
					for(int i = 1; i < count; i++) {
						total *= number[i];
					}
					System.out.println("The product is " +total);
					break;
				case 4: //division
					total = number[0];
					for(int i = 1; i < count; i++) {
						total /= number[i];
					}
					System.out.println("The product is " +total);
					break;
				default: //fallback
					System.out.println("Enter valid value");				
				}
				System.out.println("Do you want to: \n[1] Enter new numbers \n[2] Add more numbers to existing \n[3] Continue with existing numbers \n[4] Finish");
				choiseContinueFrom = input.nextInt(); //val att (1)mäta in nya tal(2)mäta in fler tal (3)välj annat operatorn (4) avsluta
				break;
			case 4: //avbrytning av yttersta do-while loopen
				runOuter = false;
			}

		} while(runOuter);
	}

}
