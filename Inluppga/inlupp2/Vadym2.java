package inlupp2;

public class Vadym2 {

	public static void main(String[] args) {
		char[] test1 = makeCharArray(260); //test char array
		
		for(char a :test1) { //skriver ut test1
			System.out.print(a +", ");
		}
		
		
		System.out.println("\n" +howManyA(test1)); //antal 'a' i test1

	}

	static public char[] makeCharArray(int numberOfPositions) {
		char[] myCharArray = new char[numberOfPositions]; //char-array som innehåller exakt antal platser användaren mäter in

		for(int i = 0; i < numberOfPositions; i++) { //körs exakt antal gånger användaren mätte in
			myCharArray[i] = (char) ((int)(Math.random() * 26 + 97)); //lägger till slumpmässigt gemen'a' till 'z' i char array
		}

		return myCharArray;

	}
	
	static public int howManyA(char[] charArray) {
		int aQuantity = 0; //variabel som håller koll på hu många 'a' som for-satsen stötade på
		for(char a :charArray) { //bläddra genom alla tecken i char-array
			if(a == 'a') { //om tecken är 's'
				aQuantity++; //räknaren ökar med ett om tecken är 'a'
			}
		}
		
		return aQuantity;	
	}

}
