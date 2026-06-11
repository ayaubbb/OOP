package practice1;

public class Savings {
    public static void main(String[] args) {
        double balance = (double)590.0F;
        double interest = 0.05;
        balance += balance * interest;
        System.out.println("new balance " + balance);
    }
}
