package extra;

public class ConverterToBase10 {

	public static void main(String[] args) {

		System.out.println(base10Convertor(11010, 2));
		System.out.println(base10Convertor("2FC46", 20));

	}
	public static int base10Convertor(int number, int base) {
		int numberLength = (int)Math.log10(number);
		int base10Number = 0;

		for(int i = 0; i <= numberLength; i++) {
			base10Number += Math.pow(base, i) * (int)((number % Math.pow(10, i + 1) / Math.pow(10, i)));
		}

		return base10Number;
	}

	public static int base10Convertor(String number, int base) {
		int base10Number = 0;

		for(int i = 0; i < number.length(); i++) {
			if((int)number.charAt(i) <= 57 && (int)number.charAt(i) >= 48) {
				base10Number += ((int)(number.charAt(i) - 48)) * ((int)Math.pow(base, number.length() - 1 - i));
			}
			else if((int)number.charAt(i) >= 65) {
				base10Number += ((int)(number.charAt(i) - 55)) * ((int)Math.pow(base, number.length() - 1 - i));
			}
			else {
				System.out.println("Please use symbols that have unicode value greater than 64");
			}	
		}

		return base10Number;
	}

}
