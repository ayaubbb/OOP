package lab2.task3;

public class CheckingAccount extends Account {
	public int transactionCount;
	static final int FREE_TRANSACTIONS = 3;
	static final double TRANSACTION_FEE = 0.02;
	public CheckingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
	public void deposit(double sum) { 
		super.deposit(sum);
		transactionCount++;
	}
	public void withdraw(double sum) { 
		super.withdraw(sum);
		transactionCount++;
	}
	public void deductFee() {
		double fee = 0;
		if (transactionCount > FREE_TRANSACTIONS) {
			int extra = transactionCount - FREE_TRANSACTIONS;
			fee = extra * TRANSACTION_FEE;
		}
		super.withdraw(fee);
		transactionCount = 0;
	}
}
