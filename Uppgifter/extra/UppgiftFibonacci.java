package extra;

import java.util.Scanner;

public class UppgiftFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number in Fibonacci series you want to use to calculate the golden ratio (it's index)");
		int border = input.nextInt(); //nummer av fibonaccital som ska beräknas

		long[] fibonacciNumber = new long[border + 1]; //array för att spara alla Fibonaccital
		fibonacciNumber[0] = 0; //första fibonaccital
		fibonacciNumber[1] = 1; //andra fibinaccital


		for(int i = 2; i <= border; i++) {
			fibonacciNumber[i] = fibonacciNumber[i - 1] + fibonacciNumber[i - 2]; //beräkning av i:te fibonaccital
		}

		double goldenRatio = ((double)fibonacciNumber[border] / (double)fibonacciNumber[border - 1]); //beräkning av gylenne snittet

		System.out.println("Enter number of decimals");
		String format = "%." + input.nextInt() + "f"; //antal decimaler i gylenne snittet

		System.out.println("The golder ratio is: " + String.format(format, goldenRatio)); 

	}

}
