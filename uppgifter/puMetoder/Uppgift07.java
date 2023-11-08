package puMetoder;

public class Uppgift07 {

	public static void main(String[] args) {
		char[] test1 = {'d', 'w', 'E', ';', 'r', '*', 'ä'};
		char[] test2 = {'Ä', 'h', '-', '1', '<', '¤', 'p'};
		char[] test3 = {'D', 'x', '&', 'µ', 'e', 'I', '¨'};
		
		System.out.println(indexOfCharacter(test1, 'w'));
		System.out.println(indexOfCharacter(test1, '*'));
		System.out.println(indexOfCharacter(test1, '#'));
		System.out.println(indexOfCharacter(test2, '-'));
		System.out.println(indexOfCharacter(test2, '1'));
		System.out.println(indexOfCharacter(test3, 'e'));
		System.out.println(indexOfCharacter(test3, '¤'));

	}
	public static int indexOfCharacter(char[] list, char wantedCharacter) {
		for(int i = 0; i < list.length; i++) {
			if (list[i] == wantedCharacter) {
				return i;
			}
		}
		return -1;
	}
	
}
