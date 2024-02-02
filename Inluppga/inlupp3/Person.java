package inlupp3;

import java.io.Serializable; //behövs för att spara/ladda up filer

public class Person implements Serializable {
	private String name; //persons namn
	private String txtNumber; //persons nummer
	
	//konstruktor
	public Person(String name) {
		this.name = name;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String txtNumber) {
		this.txtNumber = txtNumber;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getNumber() {
		return txtNumber;
	}
}
