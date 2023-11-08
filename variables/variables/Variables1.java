package variables;

public class Variables1 {

	public static void main(String[] args) {
		//Primitiva datatyper
		
		//heltal
		int integer; //skapar minnesallokering döpt till heltal
		
		integer = 7; //tilldelar heltal värdet 7
		integer = 2302; //tilldelar ett nytt värdet 2302
		
		System.out.println(integer);

		long bigNumber = 892433425; //för stora tal finns mer minne i 'long'
		short littleNumber = 34; //för små tal finns mindre minne i  'short'
		
		//decimaltal
		double decNumber = 4.543;
		float decNumber2 = 8.543f; //float har något mindre minne, avslutar värdet med 'f'
		
		//tecken
		char character = '@'; //"värdet" omslutas av '...'
		
		//boolsk variabel
		boolean  val = true; //kan vara 'true' eller 'false'
		
		//Text
		String text1 = "This is text number one.";
		
		System.out.println(text1);
		
		String text2 = "This is text number two";
		
		//lägga ihop texterna till en
		String totalText = text1 + " " + text2;
		
		System.out.println(totalText);
		
		//plocka up tecken
		char letter = text1.charAt(0);
		
		System.out.println(letter);
		
		//antal tecken
		int amountCharacter = text1.length();
		
		System.out.println(amountCharacter);
		
		//plocka upp sista tecket i texten 
		char lastCharacter = text1.charAt(amountCharacter - 1); //sista index är antal tecken -1
		
		System.out.println(lastCharacter);
		
		//dela upp mening i ord
		int space = text2.indexOf(" ");
		
		String firstWord = text2.substring(0, space); //plockar up del av textsträng från 0 till blanksteg
		
		System.out.println(firstWord);
		
	}

}
