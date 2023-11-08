package variables;

public class Casting {

	public static void main(String[] args) {
		//variableomvandling

		int number = 2;

		double decNumber = number; //int ryms i double direkt

		number = (int)decNumber; //castar med önskad typ inom parantes före

		//avrundning
		decNumber = 2.9;
		int roundning = (int)(decNumber + 0.5); //adderar 0,5 och castar för att avrunda korrekt

		//cast char som heltal
		int lowercaseLetter = (int)'a';

		System.out.println(lowercaseLetter);

		int capitalLetter = (int)'A';
		System.out.println(capitalLetter);

		//testa fler bosktäver
		System.out.println((int)'k' - (int)'K');

		//textredegering
		String text = "Hello, I have worked today. Cool!";
		char characterNew;
		char characterOld;


		for(int i = 0; i < text.length(); i++) {
			characterOld = text.charAt(i);
			if((int)characterOld >= 65 && (int)characterOld <= 90) {
				characterNew = (char)((int)characterOld + 32);
				System.out.println(characterOld + "" +characterNew);
				text.replace(characterOld, characterNew);
			}
		}
		System.out.println(text);
		

	}

}
