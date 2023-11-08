package intro;

public class arrayMethod {

	public static void main(String[] args) {
		//test array
		char[] test1 = {'d', 'w', 'E', ';', 'r', '*', 'ä'};
		
		int[] result1 = arrayConvertor(test1);
		
		//annan typ av fortsats (variabeltyp och namn i samling : samling)

		for(int a :result1) {
			System.out.println(a);
		}
		
	}
	//metoden tar emot en tecken array och returnerar teckenas Unicodevärden i en int-array
	public static int[] arrayConvertor(char[] character) {
		int quantity = character.length; //antal position u retur-array:en
		int[] uniCode = new int[quantity]; //array som ska returneras
		
		for(int i = 0; i < character.length; i++) {
			uniCode[i] = (int)character[i]; //castar unicode värde som heltal
		}
		
		return uniCode;
	}
}
