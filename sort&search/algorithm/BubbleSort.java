package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] test1 = {1, 5, 8, 4, 9, 0, 2, 6};
		int[] result1 = bubbleSort(test1);
		
		for(int a:result1) {
			System.out.print(a +", ");
		}
		
		System.out.println();
		System.out.print(binarySearch(result1, 0));

	}

	public static int[] bubbleSort(int[] intArray) {
		int temp;
		int size = intArray.length;

		for(int i = size - 1; i > 0; i--) { //for-sats som minskar ner 'intArray' efter sorteringsrunderna
			for(int k = 0; k < i; k++) {
				if(intArray[k] > intArray[k + 1]) {
					temp = intArray[k];
					intArray[k] = intArray[k + 1];
					intArray[k + 1] = temp;
				}
			}
		}
		return intArray;
	}
	
	public static int binarySearch(int[] intArray, int searchedInt) {
		int index = -1;
		int min = 0;
		int max = intArray.length - 1;
		int mid;
		
		while(index == -1 && min <= max) {
			mid = (max + min) / 2;
			if(searchedInt > intArray[mid]) {
				min = mid + 1;
			}
			else if(searchedInt < intArray[mid]) {
				max = mid - 1;
			}
			else {
				index = mid;
			}
		}
		return index;
	}
}
