package puMetoder;

public class Uppgift02 {

	public static void main(String[] args) {
		personalInfo("Vadym", "Novoselskyi", 701916730);
		personalInfo("Samuel", "Dexe", 701234567);
	}
	public static void personalInfo(String firstName, String secondName, long telNumber) {
		System.out.println(firstName +" " +secondName +" " +telNumber);
	}
}
