package lab2.task3;

public class SavingsAccount extends Account {
	public double interestRate;
	public SavingsAccount(int a, double interestRate) {
		super(a);
		// TODO Auto-generated constructor stub
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double amountOfPercentage = interestRate * getBalance(); 
		super.deposit(amountOfPercentage);
	}
	
	public String toString() {
		return super.toString() + ". Interest rate is " + interestRate;
	}
} 
