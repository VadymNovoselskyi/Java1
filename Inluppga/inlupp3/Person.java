package inlupp3;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private String txtNumber;
	
	//konstruktor
	public Person(String name) {
		this.name = name;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String txtNumber) {
		this.txtNumber = txtNumber;
	}
	
	//get
	public String getName() {
		return name;
	}
	public String getNumber() {
		return txtNumber;
	}
}
