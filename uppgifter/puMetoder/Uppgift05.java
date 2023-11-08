package puMetoder;

public class Uppgift05 {

	public static void main(String[] args) {
		System.out.println(getBigger('a'));
		System.out.println(getBigger('x'));

	}
	
	public static char getBigger(char smallLetter) {
		char bigLetter = (char)((int)smallLetter - 32);
		return bigLetter;
	}
}
