package puMetoder;

public class Uppgift09 {

	public static void main(String[] args) {
		englishAlphabet();
		englishAlphabet();
	}
	
	public static void englishAlphabet() {
		for(int i = 97; i <= 122; i++) {
			if(i < 122) {				
				System.out.print((char)i +", ");
			}
			else {
				System.out.println((char)i);
			}
		}
	}
}
