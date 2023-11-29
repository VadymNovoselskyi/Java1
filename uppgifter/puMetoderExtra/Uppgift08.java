package puMetoderExtra;

public class Uppgift08 {

	public static void main(String[] args) {
		String text1 = "ABCDEFGHIJKLMNOPQRST"; //test case
		
		System.out.println(encryptMessage(6, 13, text1)); //kryptera test med n = 6; m = 13
		System.out.println(decryptMessage(6, 13, (encryptMessage(6, 13, text1)))); //kryptera test med n = 6; m = 13 och sedan dekryptera det
	}

	public static String encryptMessage(int rowsNumber, int columnsNumber, String message) { //metod som krypterar 'message'
		String encryptedMessage = ""; //string som ska innehåla krypterande 'message'
		int messageLength = message.length(); //längden på 'message'

		char[][] gridField = new char[columnsNumber][rowsNumber]; //2D array som ska lagra och kryptera 'message'

		int xCoordinate = 0; //variabel som har koll på x-koordinat
		int bounceX = 0; //variable som har koll på hur många gånger meddelande "studsade" i topp eller botten gränsen

		int yCoordinate = 0; //variabel som har koll på y-koordinat
		int bounceY = 0; //variable som har koll på hur många gånger meddelande "studsade" i vänster eller höger gränsen

		for(int i = 0; i < messageLength; i++) { //for satsen som går genom alla bokstaver i 'message'
			if(gridField[xCoordinate][yCoordinate] == '\0') { //om platsen som motsvarar aktuella x oxh y koordinarer
				gridField[xCoordinate][yCoordinate] = message.charAt(i);
			}
			else {
				if(bounceX % 2 == 0) {
					yCoordinate++;
				}
				else {
					yCoordinate--;
				}
				if(bounceY % 2 == 0) {
					xCoordinate++;
				}
				else {
					xCoordinate--;
				}
				gridField[xCoordinate][yCoordinate] = message.charAt(i);
			}


			if(bounceX % 2 == 0) {
				yCoordinate++;
			}
			else {
				yCoordinate--;
			}
			if(bounceY % 2 == 0) {

				xCoordinate++;
			}
			else {
				xCoordinate--;
			}


			if(xCoordinate == columnsNumber - 1 || xCoordinate == 0) {
				bounceY++;
			}
			if(yCoordinate == rowsNumber - 1 || yCoordinate == 0) {
				bounceX++;
			}
		}

		for(int i = 0; i < rowsNumber; i++) {
			for(int j = 0; j < columnsNumber; j++) {
				if(gridField[j][i] != '\0') {
					encryptedMessage += gridField[j][i];
				}
			}
		}


		return encryptedMessage;
	}

	public static String decryptMessage(int rowsNumber, int columnsNumber, String encryptedMessage) {
		char[] decryptedCharArray = new char[encryptedMessage.length()];
		String decryptedMessage = "";
		String indexNumbers = "";

		int indexInDecryptedMessage = 0;

		for(int i = 0; i < encryptedMessage.length(); i++) {
			if(i < 10) {				
				indexNumbers += i;
			}
			else {
				indexNumbers += (char)(i + 55);
			}
		}

		String encryptedIndexNumber = encryptMessage(rowsNumber, columnsNumber, indexNumbers);

		for(int i = 0; i < encryptedMessage.length(); i++) {
			if((int)encryptedIndexNumber.charAt(i) <= 57) {
				indexInDecryptedMessage = (int)encryptedIndexNumber.charAt(i) - 48;
				decryptedCharArray[indexInDecryptedMessage] = encryptedMessage.charAt(i);
			}
			else {
				indexInDecryptedMessage = (int)encryptedIndexNumber.charAt(i) - 55;
				decryptedCharArray[indexInDecryptedMessage] = encryptedMessage.charAt(i);
			}
		}

		for(int i = 0; i < decryptedCharArray.length; i++) {
			decryptedMessage += decryptedCharArray[i];
		}

		return decryptedMessage;
	}

}
