package puMetoderExtra;

import java.time.LocalTime;

public class Uppgift09 {

	public static void main(String[] args) {
		//randomMultation();
		System.out.println(LocalTime.now());
		makeMyMutation("CCB", "CACACB");
		System.out.println(LocalTime.now());
		
	}

	public static boolean makeMyMutation(String srcGenome, String wantedGenome) {
		int srcGenomeLength = srcGenome.length();
		int wantedGenomeLength = wantedGenome.length();

		String[] possibleMultationsLengthOld = new String[10]; 
		int possibleMultationCount = 0;

		int aOccurences = 0;
		int bOccurences = 0;
		int cOccurences = 0;

		/*
			if(wantedGenomeLength / srcGenomeLength <= 3) {

			}
		 */

		for(int i = 0; i < srcGenomeLength; i++) { //antal förekommelse av A, B och C
			if(srcGenome.charAt(i) == 'A') {
				aOccurences++;
			}
			else if(srcGenome.charAt(i) == 'B') {
				bOccurences++;
			}
			else if(srcGenome.charAt(i) == 'C') {
				cOccurences++;
			}
			else {
				System.out.println("Wrong input, only 'A', 'B' and 'C' are allowed");
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


		String[] containeredWantedGenome;
		int srcGenomeIndexCount;
		int wantedGenomeIndexCount;
		String[] fastetMultation = new String[srcGenomeLength];
		int bestMultationQuantity = 4;

		int doCount = 0;
		boolean run = true;

		do { //kollar om någon av sätt funkar, och om ja, vilket är bäst
			containeredWantedGenome = new String[srcGenomeLength];
			srcGenomeIndexCount = 0;
			wantedGenomeIndexCount = 0;

			aLength = ((int) possibleMultationsLengthNew[doCount].charAt(0)) - 48;
			bLength = ((int) possibleMultationsLengthNew[doCount].charAt(1)) - 48;
			cLength = ((int) possibleMultationsLengthNew[doCount].charAt(2)) - 48;
			System.out.println(aLength +" " +bLength +" " +cLength);

			do {				
				if(srcGenome.charAt(srcGenomeIndexCount) == 'A') {
					containeredWantedGenome[srcGenomeIndexCount] = wantedGenome.substring(wantedGenomeIndexCount, wantedGenomeIndexCount + aLength);
					srcGenomeIndexCount++;
					wantedGenomeIndexCount += aLength;
				}
				else if(srcGenome.charAt(srcGenomeIndexCount) == 'B') {	
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

			if(doesItMutate(srcGenome, containeredWantedGenome, aOccurences, bOccurences, cOccurences) == true) {
				String aReplace = "A";
				String bReplace = "B";
				String cReplace = "C";
				if(aOccurences > 0) {						
					aReplace = containeredWantedGenome[srcGenome.indexOf('A')];
				}
				if(bOccurences > 0) {						
					bReplace = containeredWantedGenome[srcGenome.indexOf('B')];
				}
				if(cOccurences > 0) {						
					cReplace = containeredWantedGenome[srcGenome.indexOf('C')];
				}
				if(numberOfMutations(srcGenome, containeredWantedGenome, aOccurences, bOccurences, cOccurences) <= bestMultationQuantity && (srcGenome.replace("A", aReplace).replace("B", bReplace).replace("C", cReplace).equals(wantedGenome) || srcGenome.replace("A", aReplace).replace("C", cReplace).replace("B", bReplace).equals(wantedGenome) || srcGenome.replace("B", bReplace).replace("A", aReplace).replace("C", cReplace).equals(wantedGenome) || srcGenome.replace("B", bReplace).replace("C", cReplace).replace("A", aReplace).equals(wantedGenome) || srcGenome.replace("C", cReplace).replace("A", aReplace).replace("B", bReplace).equals(wantedGenome) || srcGenome.replace("C", cReplace).replace("B", bReplace).replace("A", aReplace).equals(wantedGenome))) {
					fastetMultation = containeredWantedGenome;
					bestMultationQuantity = numberOfMutations(srcGenome, containeredWantedGenome, aOccurences, bOccurences, cOccurences);
				}
			}
			System.out.println();

			if(doCount >= possibleMultationsLengthNew.length) {
				run = false;
			}
		} while(run);

		if(bestMultationQuantity != 4) {			
			String aReplace = "A";
			String bReplace = "B";
			String cReplace = "C";
			if(aOccurences > 0) {						
				aReplace = fastetMultation[srcGenome.indexOf('A')];
			}
			if(bOccurences > 0) {						
				bReplace = fastetMultation[srcGenome.indexOf('B')];
			}
			if(cOccurences > 0) {						
				cReplace = fastetMultation[srcGenome.indexOf('C')];
			}

			if(srcGenome.replace("A", aReplace).replace("B", bReplace).replace("C", cReplace).equals(wantedGenome)) {
				if(!aReplace.equals("A")) {				
					if(!cReplace.equals("C")) {
						if(!bReplace.equals("B")) {						
							System.out.println("A --> " +aReplace +"\nB --> " +bReplace +"\nC --> " +cReplace);
						}
						else {
							System.out.println("A --> " +aReplace +"\nC --> " +cReplace);
						}
					}
					else if(!bReplace.equals("B")) {
						System.out.println("A --> " +aReplace +"\nB --> " +bReplace);
					}
					else {
						System.out.println("A --> " +aReplace);
					}
				}
				
				else {
					if(!cReplace.equals("C")) {
						if(!bReplace.equals("B")) {						
							System.out.println("\nB --> " +bReplace +"\nC --> " +cReplace);
						}
						else {
							System.out.println("\nC --> " +cReplace);
						}
					}
					else if(!bReplace.equals("B")) {
						System.out.println("\nB --> " +bReplace);
					}
				}
			}

			else if(srcGenome.replace("A", aReplace).replace("C", cReplace).replace("B", bReplace).equals(wantedGenome)) {
				if(!bReplace.equals("B")) {
					if(!cReplace.equals("C")) {
						System.out.println("A --> " +aReplace +"\nC --> " +cReplace +"\nB --> " +bReplace);
					}
					else {
						System.out.println("A --> " +aReplace +"\nB --> " +bReplace);
					}
				}
				else if(!cReplace.equals("C")) {
					System.out.println("A --> " +aReplace +"\nC --> " +cReplace);
				}
				else {
					System.out.println("A --> " +aReplace);
				}

			}

			else if(srcGenome.replace("B", bReplace).replace("A", aReplace).replace("C", cReplace).equals(wantedGenome)) {
				if(!cReplace.equals("C")) {
					if(!aReplace.equals("A")) {
						System.out.println("B --> " +bReplace +"\nA --> " +aReplace +"\nC --> " +cReplace);
					}
					else {
						System.out.println("B --> " +bReplace +"\nC --> " +cReplace);
					}
				}
				else if(!aReplace.equals("A")) {
					System.out.println("B --> " +bReplace +"\nA --> " +aReplace);
				}
				else {
					System.out.println("B --> " +bReplace);
				}
			}

			else if(srcGenome.replace("B", bReplace).replace("C", cReplace).replace("A", aReplace).equals(wantedGenome)) {
				if(!aReplace.equals("A")) {
					if(!cReplace.equals("C")) {
						System.out.println("B --> " +bReplace +"\nC --> " +cReplace +"\nA --> " +aReplace);
					}
					else {
						System.out.println("B --> " +bReplace +"\nA --> " +aReplace);
					}
				}
				else if(!aReplace.equals("C")) {
					System.out.println("B --> " +bReplace +"\nC --> " +cReplace);
				}
				else {
					System.out.println("B --> " +bReplace);
				}
			}

			else if(srcGenome.replace("C", cReplace).replace("A", aReplace).replace("B", bReplace).equals(wantedGenome)) {
				if(!bReplace.equals("B")) {
					if(!aReplace.equals("A")) {
						System.out.println("C --> " +cReplace +"\nA --> " +aReplace +"\nB --> " +bReplace);
					}
					else {
						System.out.println("C --> " +cReplace +"\nB --> " +bReplace);
					}
				}
				else if(!aReplace.equals("A")) {
					System.out.println("C --> " +cReplace +"\nA --> " +aReplace);
				}
				else {
					System.out.println("C --> " +cReplace);
				}
			}

			else if(srcGenome.replace("C", cReplace).replace("B", bReplace).replace("A", aReplace).equals(wantedGenome)) {
				if(!aReplace.equals("A")) {
					if(!bReplace.equals("B")) {
						System.out.println("C --> " +cReplace +"\nB --> " +bReplace +"\nA --> " +aReplace);
					}
					else {
						System.out.println("C --> " +cReplace +"\nA --> " +aReplace);
					}
				}
				else if(!bReplace.equals("B")) {
					System.out.println("C --> " +cReplace +"\nB --> " +bReplace);
				}
				else {
					System.out.println("C --> " +cReplace);
				}
			}

			else {
				bestMultationQuantity = 4;
			}
			System.out.println(bestMultationQuantity);
			return true;
		}
		if(bestMultationQuantity == 4) {
			System.out.println("BOZZOOO");
			return false;
		}
		else {
			return false;
		}

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

			for(int i = 0; i < bOccurenceNumber - 1; i++) {
				for(int j = i + 1; j < bOccurenceNumber; j++) {
					if (!containeredGenome[bOccurences[i]].equals(containeredGenome[bOccurences[j]])) {
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

			for(int i = 0; i < cOccurenceNumber - 1; i++) {
				for(int j = i + 1; j < cOccurenceNumber; j++) {
					if (!containeredGenome[cOccurences[i]].equals(containeredGenome[cOccurences[j]])) {
						return false;
					}
				}
			}
		}

		return true;
	}


	public static int numberOfMutations(String srcGenome, String[] containeredGenome, int aOccurenceNumber, int bOccurenceNumber, int cOccurenceNumber) {
		int mutationsQuantity = 0;

		if(aOccurenceNumber > 0) {			
			if(containeredGenome[srcGenome.indexOf('A')].length() > 1) {
				mutationsQuantity++;
			}
			else if(aOccurenceNumber > 0 && srcGenome.charAt(srcGenome.indexOf('A')) != containeredGenome[srcGenome.indexOf('A')].charAt(0)) {
				mutationsQuantity++;
			}
		}

		if(bOccurenceNumber > 0) {			
			if(containeredGenome[srcGenome.indexOf('B')].length() > 1) {
				mutationsQuantity++;
			}
			else if(bOccurenceNumber > 0 && srcGenome.charAt(srcGenome.indexOf('B')) != containeredGenome[srcGenome.indexOf('B')].charAt(0)) {
				mutationsQuantity++;
			}
		}

		if(cOccurenceNumber > 0) {			
			if(containeredGenome[srcGenome.indexOf('C')].length() > 1) {
				mutationsQuantity++;
			}
			else if(cOccurenceNumber > 0 && srcGenome.charAt(srcGenome.indexOf('C')) != containeredGenome[srcGenome.indexOf('C')].charAt(0)) {
				mutationsQuantity++;
			}
		}

		return mutationsQuantity;
	}



	public static void randomMultation() {
		int genomeLength = (int)(Math.random() * 5 + 1);
		int multationNumber = (int) (Math.random()  + 3);

		String genome = "";

		String charReplacement = "";

		System.out.println("Im running. genome length is - " +genomeLength +" number of multations is - " +multationNumber);
		for(int i = 0; i < genomeLength; i++) {
			genome += (char) (int)(Math.random() * 3 + 65);
		}

		System.out.println(genome);

		for(int i = 0; i < multationNumber; i++) {
			String charToReplace = "C";
			charReplacement = "";

			//charToReplace += (char) (int)(Math.random() * 3 + 65);
			System.out.println("Char to replace is " +charToReplace +" " +i);


			int multationLength = (int)(Math.random() * 3 + 1);
			System.out.println("Multation length is " +multationLength +" " +i);

			for(int j = 0; j < multationLength; j++) {
				charReplacement += (char) (int)(Math.random() * 3 + 65);
				System.out.println("String replacement is - " +charReplacement);
			}

			genome = genome.replace(charToReplace, charReplacement);

			System.out.println(genome +" " +genome.length());
		}
	}

}