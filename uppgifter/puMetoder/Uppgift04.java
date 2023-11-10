package puMetoder;

public class Uppgift04 {

	public static void main(String[] args) {
		romb(3);
		System.out.println();
		romb(6);

	}
	
	public static void romb (int column) {
		String row = "*";
		
		for(int i = 1; i < column; i++) {
			row += "*";
		}
		
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(row);
		}
	}
}
