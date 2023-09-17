package extra;

public class Uppgift01 {

	public static void main(String[] args) {
		double total = 0;
		double loan = 0.01;
		int days= 0;

		boolean run = true;
		do {
			total += loan;
			days++;
			System.out.println(total +" " +loan +" " +days);
			if(total >= 1000000) {
				run = false;
			}
			loan *= 2;
		} while(run);
		System.out.println("it takes " +days +" days to reach a loan of 1.000.000");
	}

}
