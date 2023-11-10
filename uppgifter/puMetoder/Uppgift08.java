package puMetoder;

public class Uppgift08 {

	public static void main(String[] args) {
		int[] test1 = {1, 43, 32, -2, 0};
		int[] test2 = {-1, -22143, 432, 986, 12};
		int[] test3 = {8, 3, -332, -22, 504};
		
		for(int a :findMinMax(test1)) {
			System.out.println(a);
		}
		
		for(int a :findMinMax(test2)) {
			System.out.println(a);
		}
		
		for(int a :findMinMax(test3)) {
			System.out.println(a);
		}
		
	}
	public static int[] findMinMax(int[] numberList) {
		int min = 0;
		int max = 0;
		
		for(int a :numberList) {
			if(a < min) {
				min = a;
			}
			else if (a > max) {
				max = a;
			}
		}
		
		int[] minMax = {min, max};
		return minMax;
	}
	
}
