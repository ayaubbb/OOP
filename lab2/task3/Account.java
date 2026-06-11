package lab2.task3;
public class Account{
	private double balance; // The current balance
	private int accNumber; // The account number
	public Account(int a){
		balance = 0.0;
		accNumber = a;
	}
	public void deposit(double sum) { 
		this.balance += sum;
	}
	public void withdraw(double sum) { 
		if (sum > 0 && sum <= balance) {
			this.balance -= sum;
		}
	}
	public double getBalance() { 
		return balance;
	}
	public double getAccountNumber() { 
		return accNumber;
	}
	public void transfer(double amount, Account other) { 
		this.withdraw(amount);
		other.deposit(amount);
	}
	public String toString() { 
		return "Account number: " + accNumber + ", Balance: "+ balance;
	}
	public final void print() {
	// Don’t override this, override the toString method
		System.out.println(toString());
	}
}