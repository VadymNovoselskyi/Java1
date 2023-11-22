package extra;

public class ConverterToBase10 {

	public static void main(String[] args) {

		System.out.println(base10Convertor(11010, 2)); //test
		System.out.println(base10Convertor("634F", 16)); //test

	}
	public static int base10Convertor(int number, int base) { //function för bas < 10
		int numberLength = (int)Math.log10(number); //antal siffror i 'number'
		int base10Number = 0; //'number' i 10-bas

		for(int i = 0; i <= numberLength; i++) { //for-satsen som går genom alla siffror från höger till vänster 'number'
			base10Number += Math.pow(base, i) * (int)((number % Math.pow(10, i + 1) / Math.pow(10, i)));
			//				multiplicera i:te siffra med i-1 exponent
			//									får fram i:te siffra börja från höger
		}

		return base10Number;
	}

	public static int base10Convertor(String number, int base) { //function för bas > 10
		int base10Number = 0; //'number' i 10-bas

		for(int i = 0; i < number.length(); i++) { //for-satsen som går genom alla characters från vänster till höger 'number'
			if((int)number.charAt(i) <= 57 && (int)number.charAt(i) >= 48) { //om i:te character är en siffra 0-9
				base10Number += ((int)(number.charAt(i) - 48)) * ((int)Math.pow(base, number.length() - 1 - i));
				//				omvandla siffran från char till int
				//												 multiplicera i:te siffra med i-1 exponent
			}
			else if((int)number.charAt(i) >= 65) { //om i:te character är en bokstav
				base10Number += ((int)(number.charAt(i) - 55)) * ((int)Math.pow(base, number.length() - 1 - i));
				//				omvandla bokstav till dess värde i 'bas'-bas system
				//												 multiplicera i:te siffra med i-1 exponent
			}
			else { //om sifran har unicode värde mindre än '0'
				System.out.println("Please use symbols that have unicode value greater than 64");
			}	
		}

		return base10Number;
	}

}
