package intro_pt1.part4;

class Account {
    private final String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return name + ": " + balance;
    }
}

public class OOPIntro
{
    public static void main(String[] args){
        Account oscarAcc = new Account("Oscar's Saver", 100.0);
        System.out.println(oscarAcc);
        oscarAcc.deposit(20);
        System.out.println(oscarAcc.balance());

        Account mattAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdraw(100);
        myAccount.deposit(100);

        System.out.println(mattAccount);
        System.out.println(myAccount);


    }
}
