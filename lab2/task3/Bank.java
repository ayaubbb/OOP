package lab2.task3;
import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	public Bank() {
		// TODO Auto-generated constructor stub
		accounts = new Vector<>();
	}
	
	public void openAccount(Account a) {
		accounts.add(a);
	}
	
	public void closeAccount(Account a) { 
        accounts.remove(a);
    }
	
	public void update() {
		for (Account a : accounts) {
			if (a instanceof SavingsAccount) {
				((SavingsAccount) a).addInterest();
			}else if (a instanceof CheckingAccount) {
				((CheckingAccount) a).deductFee();
			}
		}
	}

}
