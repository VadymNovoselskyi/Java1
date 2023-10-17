package extra;

import java.util.Scanner;

public class UppgiftNormalDistribution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the mean value");
		double meanValue = input.nextDouble(); //medelvärdet

		System.out.println("Enter standard deviation");
		double standardDeviation = input.nextDouble(); //standardavvikelse

		System.out.println("Enter lower bound");
		double lowerBound = input.nextDouble(); //nedre gränsen

		System.out.println("Enter upper bound");
		double upperBound = Math.abs(input.nextDouble()); //övre gränsen

		double probability = 0; //sannolikheten
		int border = 10000; //precision

		double step = (upperBound - lowerBound) / border; //rektanglarnas bas
		
		double currentX = lowerBound; //x-värde
		double currentValue; //y-värde, dvs höjden på rektangel

		for(int i = 0; i < border; i++) { //beräkning av sannolikheten genom att beräkna arean av +border rektanglar under kurvan
			//formel för täthetsfunktion
			currentValue = 	(1 / (standardDeviation * Math.sqrt(2 * Math.PI))) * Math.pow(Math.E, -(Math.pow((currentX - meanValue) / standardDeviation, 2) / 2));
			currentX += step; //flytta currentX en steg fram
			probability +=  currentValue * step; //sannolikheten är lika med sig själv plus arean av rektangel från currentX till currentX + step och basen step
		}

		System.out.println(probability * 100 +"%"); //sannolikheten i procentform

	}

}
