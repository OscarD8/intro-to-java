package part4;

public class PaymentCard
{
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) this.balance -= 2.60;
        else System.out.println("Warning: balance not high enough.");
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) this.balance -= 4.60;
        else System.out.println("Warning: balance not high enough.");
    }

    public void addMoney(double amount) {
        if (this.balance + amount > 150) this.balance = 150;
        else if (amount > 0) this.balance += amount;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros.";
    }
}
