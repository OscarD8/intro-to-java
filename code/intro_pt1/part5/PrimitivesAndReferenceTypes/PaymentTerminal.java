package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class PaymentTerminal
{
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    double affordableMeal = 2.50;
    double heartyMeal = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            affordableMeals += 1;
            this.money += affordableMeal;
            return payment - affordableMeal;
        }
        return payment;
    }
    public boolean eatAffordably(PaymentCard card) {
        if (card.getBalance() - affordableMeal >= 0) {
            card.takeMoney(-affordableMeal);
            affordableMeals += 1;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment >= heartyMeal) {
            heartyMeals += 1;
            this.money += heartyMeal;
            return payment - heartyMeal;
        }
        else return payment;
    }
    public boolean eatHeartily(PaymentCard card) {
        if (card.getBalance() - heartyMeal >= 0) {
            card.takeMoney(heartyMeal);
            heartyMeals += 1;
            return true;
        }
        return false;
    }
    public void addMoneyToCard(PaymentCard card, double amount) {
        card.addMoney(amount);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
