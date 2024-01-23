package bank;

import java.util.ArrayList;

public class BankMain {

	public static void main(String[] args) {
		//samling
		ArrayList<Account> accountList = new ArrayList<>();
		//andra typer av samlingar: HashMap,
		
		//lägga till objekt i listan
		accountList.add(new Account("Vadym Novoselskyi"));
		//Ändrar i objetk
		accountList.get(0).insertion(2000000);
		
		accountList.add(new Account("Gösta Lind"));
		
		System.out.println(accountList.get(0).getBalance() +" " +accountList.get(1).getAccountN());
		
		
		//söker efter bankkonto
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getName().equals("Gösta Lind")) {
				System.out.println(accountList.get(i).getBalance());
			}
		}
		
	}

}
