package puMetoder;

public class Uppgift01 {

	public static void main(String[] args) {
		System.out.println(isPositive(10.6));
		System.out.println(isPositive(15));
		System.out.println(isPositive(-10.6));
	}
	public static char isPositive(double number) {
		if(number >= 0) {
			return '+';
		}
		else {
			return '-';
		}
	}
}
