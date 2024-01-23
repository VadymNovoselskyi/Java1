package bank;

public class Account {
	//Instansvariabler
	private String name;
	private int balance;
	private int accountN;


	//statiska variabel
	private static int counter = 1;

	//konstruktor:
	public Account(String name) {
		this.name = name;
		accountN = 1000 + counter;
		counter++;
	}

	//insättning
	public void insertion(int amount) {
		balance += amount;
	}
	//uttag
	public boolean withdrawal(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}

	//get metoder
	public int getAccountN() {
		return accountN;
	}
	public int getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}




}
