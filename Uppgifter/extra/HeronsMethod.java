package extra;

import java.util.Scanner;

public class HeronsMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number you want to calculate square root of");

		double number = input.nextDouble(); //talet röten av vilket ska beräknas
		double sqrtNew = 1; //gissning
		double sqrtOld = 0; // gammla gissning

		System.out.println("Enter how many decimals of precision you want to get");
		int decimals = input.nextInt(); //precision, dvs antal decimal i svaret

		while((sqrtNew % (1 / (Math.pow(10, decimals))) != (sqrtOld % (1 / (Math.pow(10, decimals)))))) { 	//jämför den gamlare och den nyare gissningars värde från den sista decimal och uppåt
			sqrtOld = sqrtNew;
			sqrtNew = ((number / sqrtNew) + sqrtNew) / 2; //herons metod
		}

		String format = "%." + decimals + "f"; //antal decimaler i output
		System.out.println("Square root of " +number +" is " +String.format(format, sqrtNew));

	}

}
