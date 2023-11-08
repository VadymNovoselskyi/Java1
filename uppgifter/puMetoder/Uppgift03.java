package puMetoder;

public class Uppgift03 {

	public static void main(String[] args) {
		System.out.println(potens(2, 3));
		System.out.println(potens(13, 6));
	}
	public static int potens(int base, int exponent) {
		int potens = base;
		for(int i = 0; i < exponent; i++) {
			potens *= base; 
		}
		return potens;
	}
}
