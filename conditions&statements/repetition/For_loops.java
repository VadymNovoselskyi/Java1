package repetition;

public class For_loops {

	public static void main(String[] args) {
		//For-satser lämpar sig för ett visst antal repetitioner
		
		//for( start; slut; steg)
		
		for(int i = 0; i < 10; i++) {	//startar på 0 slutar på 9 och ökar ett steg var vända
			System.out.println(i);
		}
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)Math.pow(2, i);		//fyller array med binära tal
		}
		
		//skriver ut arrays:
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// söka ett värde i array
		
		int index = -1; 	//när vi söker index ger vi startvärde -1 för att se om värde ej funnits
		int value = 4;		//vi söker efter värde 4 i arrayn
		
		for(int i = array.length -1 ; i >= 0; i--) {	//bläddrar från sista till första index
			if(array[i] == value) {
				index = i;
				break;		//avbryter for-satsen
			}
		}
		System.out.println("Index for " +value +" is: " +index);
		
		
		//Chessboard
		
		String[][] chess = new String[8][8];
		
		//En forstast för rader, en för kolumner
		for(int k = 0; k < 8; k++) {
			for(int i = 0; i < 8 ; i++) {
				if( (i + k) % 2 == 0) {
					chess[i][k] = "[W]";
				}
				else {
					chess[i][k] = "[B]";
				}
			}
		}
		
		for(int k = 0; k < 8; k++) {
			for( int i = 0; i< 8; i++) {
				System.out.print(chess[i][k]);
			}
			System.out.println();
		}
		
	}
	

}
