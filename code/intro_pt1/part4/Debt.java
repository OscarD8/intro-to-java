package intro_pt1.part4;

public class Debt
{
    private final double interestRate;
    private double balance;

    public Debt(double initialBalance, double initialInterestRate){
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }

    public void printBalance() {
        System.out.printf("%.2f%n", balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}
