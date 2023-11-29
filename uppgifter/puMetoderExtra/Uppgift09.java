package puMetoderExtra;

public class Uppgift09 {

	public static void main(String[] args) {
		//System.out.println("CCBCC".replace("C", "CB"));
		randomMultation();
	}

	public static String makeMyMutation(String sourceGenome, String wantedGenome) {
		return "A";
	}
	
	public static void randomMultation() {
		int genomeLength = (int)(Math.random() * 3 + 3);
		int multationNumber = (int) (Math.random() * 3 + 1);
		
		String genome = "";
		
		String charReplacement = "";
		
		System.out.println("Im running. genome length is - " +genomeLength +" number of multations is - " +multationNumber);
		for(int i = 0; i < genomeLength; i++) {
			genome += (char) (int)(Math.random() * 3 + 65);
		}
		
		System.out.println(genome);
		
		for(int i = 0; i < multationNumber; i++) {
			String charToReplace = "";
			charReplacement = "";
			
			charToReplace += (char) (int)(Math.random() * 3 + 65);
			System.out.println("Char to replace is " +charToReplace +" " +i);
			
			
			int multationLength = (int)(Math.random() * 3 + 1);
			System.out.println("Multation length is " +multationLength +" " +i);
			
			for(int j = 0; j < multationLength; j++) {
				charReplacement += (char) (int)(Math.random() * 3 + 65);
				System.out.println("String replacement is - " +charReplacement);
			}
			
			genome = genome.replace(charToReplace, charReplacement);
			
			System.out.println(genome);
		}
	}
	
}
