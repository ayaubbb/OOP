package lab2.task3;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        
        SavingsAccount sa = new SavingsAccount(1, 0.1); 
        CheckingAccount ca = new CheckingAccount(2);
        
        sa.deposit(1000);
        ca.deposit(500); 
        ca.withdraw(100); 
        ca.deposit(50);  
        ca.deposit(10);  
        
        myBank.openAccount(sa);
        myBank.openAccount(ca);
        
        myBank.update();
        
        System.out.println(sa); //1100
        System.out.println(ca); //460 
        myBank.closeAccount(sa);
    }
}