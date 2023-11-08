package intro;

public class ExternalMethodes {
	
	//kollar om tecknet är versal
	public static boolean charTest(char character) {
		int unicode = (int)character;
		if(unicode >= 65 && unicode <= 90) {
			return true;
		}
		else {
			return false;
		}
	}
}
