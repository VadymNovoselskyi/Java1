package paket;

public class Grade {

	public static void main(String[] args) {
		//Sammanställning av betyg
		//betygen kommer i en array; 0-5
		
		int[] grade = {1, 2, 4, 6, 3, 0, 5, 3, 4, 2, 2, 4, 2};
		int error = 0;
		//frekvens array
		int[] frequency = new int[6];
		
		for(int i = 0; i < grade.length; i++) {
			try {				
				frequency[grade[i]]++;
			} catch(ArrayIndexOutOfBoundsException e) {
				error++;
			}
		}
		
		for(int i = 0; i < frequency.length; i++) {
			System.out.println("Grade " +i +" occurs " +frequency[i] +" time(s)");
			if(i == frequency.length - 1) {
				System.out.println("With " +error +" error(s)");
			}
		}
		
		
	}

}
