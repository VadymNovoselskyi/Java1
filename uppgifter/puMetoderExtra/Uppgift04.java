package puMetoderExtra;

public class Uppgift04 {

	public static void main(String[] args) {
		System.out.println(gcf(60, 75));

	}

	public static int gcf(int number1, int number2) {
		int gcf = number1;
		
		for(int i = 0; i < number2; i++) {
			if(number1 % gcf == 0 && number2 % gcf == 0) {
				return gcf;
			}
			gcf--;
		}
		return gcf;
		
	}

}
