package puMetoderExtra;

public class Uppgift07 {

	public static void main(String[] args) {
		System.out.println(howManyCubes(7	));

	}
	
	public static int howManyCubes(int n) {
		int smallCubes = 0;
		for(int i = 1; i <= n; i++) {
			smallCubes += Math.pow(i, 3);
		}
		
		return smallCubes;
	}

}
