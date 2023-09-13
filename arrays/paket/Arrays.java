package paket;

public class Arrays {

	public static void main(String[] args) {
		// Arrays, listor, talfält
		int[] number = new int[10];
		
		System.out.println(number);	//en array behöver skrivas ut element för element
		
		System.out.println(number[0]);	//index 0 är första position i fältet
		
		System.out.println(number[number.length - 1]);	//.length returnerar antal element i fältet
		
		number[3] = 5;		//tal nr fyra i fältet får värde 5
		
		double[] decArray = new double[100];
		
		String[] textList = new String[23];
		
		// tvådimensionell array:
		
		char[][] twoDimField = new char[3][4]; //ett tvådim tecken fält eller matris med 3 rad och 4 kollumner
		
		System.out.println(twoDimField);

	}

}
