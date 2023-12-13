package inlupp2;

public class Vadym22 {

	public static void main(String[] args) {
		char[] test1 = makeCharArray(1000); //test char array
		
		for(char a :test1) { //skriver ut test1
			System.out.print(a +", ");
		}
		System.out.println("\n" +aProportion(test1)); //antal 'a' och 'A' i test1
	}

	static public char[] makeCharArray(int numberOfPositions) {
		char[] myCharArray = new char[numberOfPositions]; //char-array som innehåller exakt antal platser användaren mäter in

		for(int i = 0; i < numberOfPositions; i++) { //körs exakt antal gånger användaren mätte in
			if(Math.random() < 0.5) { //if satsen som körs 50% av tiden				
				myCharArray[i] = (char) ((int)(Math.random() * 26 + 97)); //lägger till slumpmässigt gemen'a' till 'z' i char array
			}
			else {
				myCharArray[i] = (char) ((int)(Math.random() * 26 + 65)); //lägger till slumpmässigt versal 'A' till 'Z' i char array
			}
		}

		return myCharArray;

	}


	static public double aProportion(char[] charArray) {
		int aQuantity = 0; //variabel som håller koll på hu många 'a' som for-satsen stötade på
		double aProportion; //variabel som har värde av andel 'a' och 'A' i char-arrayen
		for(char a :charArray) { //bläddra genom alla tecken i char-array
			if(a == 'a') { //om tecken är 'a'
				aQuantity++; //räknaren ökar med ett om tecken är 'a'
			}
			else if(a == 'A') {//om tecken är 'A'
				aQuantity++; //räknaren ökar med ett om tecken är 'A'
			}
		}
		//andel 'a' och 'A' är alla förekommelse av 'a' och 'A' dviderad med längden på charArray
		aProportion = (double)aQuantity / charArray.length;
		return aProportion;	
	}
}
