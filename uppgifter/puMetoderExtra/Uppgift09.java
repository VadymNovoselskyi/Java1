package puMetoderExtra;

public class Uppgift09 {

	public static void main(String[] args) {
		//System.out.println("AaB".indexOf(' '));

		//randomMultation();

		makeMyMutation("ABBA", "CABCCCAB");
		
	}

	public static String makeMyMutation(String sourceGenome, String wantedGenome) {
		int srcGenomeLength = sourceGenome.length();
		int wantedGenomeLength = wantedGenome.length();

		String[] possibleMultationsLengthOld = new String[wantedGenomeLength]; 
		int possibleMultationCount = 0;

		int aOccurences = 0;
		int bOccurences = 0;
		int cOccurences = 0;

		/*
		if(wantedGenomeLength / srcGenomeLength <= 3) {

		}
		 */

		for(int i = 0; i < srcGenomeLength; i++) { //antal förekommelse av A, B och C
			if(sourceGenome.charAt(i) == 'A') {
				aOccurences++;
			}
			else if(sourceGenome.charAt(i) == 'B') {
				bOccurences++;
			}
			else if(sourceGenome.charAt(i) == 'C') {
				cOccurences++;
			}
			else {
				System.out.println("Wrong input, only 'A', 'B' and 'C' are allowed");
				return "Error";
			}
		}

		//System.out.println("A occurences " +aOccurences +"; B occurences " +bOccurences +"; C occurences " +cOccurences +"\n");

		int aLength;
		int bLength;
		int cLength;

		//alla sätt att ändra (eller inte) på längder av A, B och C
		for(int i = 1; i < 4; i++) { //A = i 
			for(int j = 1; j < 4; j++) { //B = j
				for(int k = 1; k < 4; k++) { //C = k
					aLength = i;
					bLength = j;
					cLength = k;

					if(aOccurences == 0) {
						//System.out.println("0 A occurences");
						aLength = 0;
						i = 4;
					}
					if(bOccurences == 0) {
						//System.out.println("0 B occurences");
						bLength = 0;
						j = 4;
					}
					if(cOccurences == 0) {
						//System.out.println("0 C occurences");
						cLength = 0;
						k = 4;
					}

					if((aLength * aOccurences) + (bLength * bOccurences) + (cLength * cOccurences) == wantedGenomeLength) {
						//System.out.println("A length is " +aLength +"; B length is " +bLength +"; C length is " +cLength);

						possibleMultationsLengthOld[possibleMultationCount] = String.format("%d%d%d", aLength, bLength, cLength);
						possibleMultationCount++;
					}
				}
			}
		}

		String[] possibleMultationsLengthNew = new String[possibleMultationCount]; //en finare String utan "null"
		for(int i = 0; i < possibleMultationCount; i++) { 
			possibleMultationsLengthNew[i] = possibleMultationsLengthOld[i];
		}

		for(int i = 0; i < possibleMultationsLengthNew.length; i++) {
			//System.out.println(possibleMultationsLengthNew[i]);
		}


		String[] containeredWantedGenome = new String[srcGenomeLength];
		int srcGenomeIndexCount;
		int wantedGenomeIndexCount;

		int doCount = 0;
		boolean run = true;

		do { //kollar om någon av sätt funkar, och om ja, vilket är bäst
			srcGenomeIndexCount = 0;
			wantedGenomeIndexCount = 0;

			aLength = ((int) possibleMultationsLengthNew[doCount].charAt(0)) - 48;
			bLength = ((int) possibleMultationsLengthNew[doCount].charAt(1)) - 48;
			cLength = ((int) possibleMultationsLengthNew[doCount].charAt(2)) - 48;
			System.out.println(aLength +" " +bLength +" " +cLength);

			do {				
				if(sourceGenome.charAt(srcGenomeIndexCount) == 'A') {
					containeredWantedGenome[srcGenomeIndexCount] = wantedGenome.substring(wantedGenomeIndexCount, wantedGenomeIndexCount + aLength);
					srcGenomeIndexCount++;
					wantedGenomeIndexCount += aLength;
				}
				else if(sourceGenome.charAt(srcGenomeIndexCount) == 'B') {	
					containeredWantedGenome[srcGenomeIndexCount] = wantedGenome.substring(wantedGenomeIndexCount, wantedGenomeIndexCount + bLength);
					srcGenomeIndexCount++;
					wantedGenomeIndexCount += bLength;
				}
				else {		
					containeredWantedGenome[srcGenomeIndexCount] = wantedGenome.substring(wantedGenomeIndexCount, wantedGenomeIndexCount + cLength);
					srcGenomeIndexCount++;
					wantedGenomeIndexCount += cLength;
				}

			} while (srcGenomeIndexCount < srcGenomeLength);	
			doCount++;

			for(int i = 0; i < containeredWantedGenome.length; i++) {
				System.out.println(containeredWantedGenome[i]);
			}
			
			if(doesItMutate(sourceGenome, containeredWantedGenome, aOccurences, bOccurences, cOccurences) == true) {
				System.out.println("Yass");
			}
			System.out.println();


			if(doCount >= possibleMultationsLengthNew.length) {
				run = false;
			}
		} while(run);

		return "A";
	}

		public static boolean doesItMutate(String srcGenome, String[] containeredGenome, int aOccurenceNumber, int bOccurenceNumber, int cOccurenceNumber) {
			if(srcGenome.indexOf('A') != -1) {
				int[] aOccurences = new int[aOccurenceNumber];
				int aOccurencesCount = 0;
				int index = srcGenome.indexOf('A');
	
				while (index >= 0) {
					aOccurences[aOccurencesCount] = index;
					aOccurencesCount++;
					index = srcGenome.indexOf('A', index + 1);
				}
			
				for(int i = 0; i < aOccurenceNumber - 1; i++) {
				    for(int j = i + 1; j < aOccurenceNumber; j++) {
				        if (!containeredGenome[aOccurences[i]].equals(containeredGenome[aOccurences[j]])) {
				            System.out.println("A fail i is " + i + " j is " + j + " first occ is '" + containeredGenome[aOccurences[i]] + "' second occ is '" + containeredGenome[aOccurences[j]] + "'");
				            return false;
				        }
				    }
				}
			}
			if(srcGenome.indexOf('B') != -1) {
				int[] bOccurences = new int[bOccurenceNumber];
				int bOccurencesCount = 0;
				int index = srcGenome.indexOf('B');
	
				while (index >= 0) {
					bOccurences[bOccurencesCount] = index;
					bOccurencesCount++;
					index = srcGenome.indexOf('B', index + 1);
				}
	
				for(int i = 0; i < aOccurenceNumber - 1; i++) {
				    for(int j = i + 1; j < aOccurenceNumber; j++) {
				        if (!containeredGenome[bOccurences[i]].equals(containeredGenome[bOccurences[j]])) {
				            System.out.println("B fail i is " + i + " j is " + j + " first occ is '" + containeredGenome[bOccurences[i]] + "' second occ is '" + containeredGenome[bOccurences[j]] + "'");
				            return false;
				        }
				    }
				}
			}
			if(srcGenome.indexOf('C') != -1) {
				int[] cOccurences = new int[cOccurenceNumber];
				int cOccurencesCount = 0;
				int index = srcGenome.indexOf('C');
	
				while (index >= 0) {
					cOccurences[cOccurencesCount] = index;
					cOccurencesCount++;
					index = srcGenome.indexOf('C', index + 1);
				}
				
				for(int i = 0; i < aOccurenceNumber - 1; i++) {
				    for(int j = i + 1; j < aOccurenceNumber; j++) {
				        if (!containeredGenome[cOccurences[i]].equals(containeredGenome[cOccurences[j]])) {
				            System.out.println("C fail i is " + i + " j is " + j + " first occ is '" + containeredGenome[cOccurences[i]] + "' second occ is '" + containeredGenome[cOccurences[j]] + "'");
				            return false;
				        }
				    }
				}
			}
			
			return true;
		}

	public static void randomMultation() {
		int genomeLength = (int)(Math.random() * 4 + 2);
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