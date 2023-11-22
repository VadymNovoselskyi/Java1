package puMetoderExtra;

public class Uppgift06 {

	public static void main(String[] args) {
		System.out.println(heronsMethod(11, 3));

	}

	public static double heronsMethod(int number, int decimals) {
		double sqrtNew = 2; //gissning
		double sqrtOld = 1; //gammla gissning

		while((sqrtNew % (Math.pow(10, decimals * -1)) != (sqrtOld % (Math.pow(10, decimals * -1))))) { 	//jämför den gamlare och den nyare gissningars värde från den sista decimal och uppåt
			sqrtOld = sqrtNew;
			sqrtNew = ((number / sqrtNew) + sqrtNew) / 2; //herons metod
		}
		return sqrtOld;
	}
	
	public static double heronsMethod(double number, int decimals) {
		double sqrtNew = 1; //gissning
		double sqrtOld = 0; // gammla gissning

		while((sqrtNew % (1 / (Math.pow(10, decimals))) != (sqrtOld % (1 / (Math.pow(10, decimals)))))) { 	//jämför den gamlare och den nyare gissningars värde från den sista decimal och uppåt
			sqrtOld = sqrtNew;
			sqrtNew = ((number / sqrtNew) + sqrtNew) / 2; //herons metod
		}
		return sqrtOld;
	}
	
}
