package extra;

public class Uppgift05 {

	public static void main(String[] args) {
		int border = 50; //alla tal 0 - border ska testas om de är primtal
		int count = 1; //första två värde är bestämda (1 och 2)

		int[] arrayPrime = new int[100];
		arrayPrime[0] = 1; //tilldela värderna till första två primtal, för att ha möjligheten att jämföra andra tal med de, och dividera inte med 0
		arrayPrime[1] = 2;

		boolean iIsPrime; //iIsPrime ändras till false om i är inte en primtal

		for(int i = 2; i <= border; i++) {
			iIsPrime = true; //refresha värde på iIsPrime varje gång vi kör om cyklen
			for(int j = 1; j <= count; j += 2) { //kolla om i kan delas med något primtal som vi har fått hittils
				if(i % arrayPrime[j] == 0) {
					iIsPrime = false; //iIsPrim ändras till false om i kan delas med något annat primtal
					break;
				}
			}
			if(iIsPrime) {
				count++;
				arrayPrime[count] = i; //spara i om det är primtal

			}

		}
		System.out.print("All prime numbers from 0 to " +border +" are: "); //output av alla primtal
		for(int i = 0; i <= count; i++) {
			if(i == count) {
				System.out.println("and " +arrayPrime[i]);
			}
			else {
				System.out.print(arrayPrime[i] +", ");
			}
		}

	}
}
