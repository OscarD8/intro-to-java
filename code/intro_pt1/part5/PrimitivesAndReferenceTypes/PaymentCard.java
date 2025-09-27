package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class PaymentCard
{
        private double balance;

        public PaymentCard(double openingBalance) {
            this.balance = openingBalance;
        }
        public void addMoney(double amount) {
            if (this.balance + amount > 150) this.balance = 150;
            else if (amount > 0) this.balance += amount;
        }
        public boolean takeMoney(double amount) {
            if (this.balance - amount >= 0) {
                this.balance -= amount;
                return true;
            }
            return false;
        }
        public double getBalance(){
            return this.balance;
        }
        @Override
        public String toString() {
            return "The card has a balance of " + this.balance + " euros.";
        }
}
