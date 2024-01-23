package intro;

public class OwnObject {
	//instansvariabler
	private String name;
	private int grade;
	private int age;
	private boolean allergi;
	
	//konstruktor
	public OwnObject(String name, boolean allergi) {
		this.name = name;
		grade = 1;
		age = 7;
		this.allergi = allergi;
	}
	
	//set&get metoder
	public int getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public void newYear() {
		grade++;
		age++;
	}
	
}
