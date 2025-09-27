package intro_pt2.DataVisualisation.Calculator;


import java.util.ArrayList;
import java.util.List;

public class SavingsAccount
{
    List<Integer> savings;
    List<Integer> savingsWithInterest;

    public SavingsAccount(int initialBalance, int rate) {
        savings = new ArrayList<>();
        savingsWithInterest = new ArrayList<>();
        initialiseSavings(initialBalance);
        initialiseInterest(rate);
    }

    public void initialiseSavings(int initialBalance) {
        savings.clear();
        savings.add(0);
        for (int i = 1; i <= 30; i++) {
            savings.add(i * initialBalance);
        }
    }

    public void initialiseInterest(int rate) {
        savingsWithInterest.clear();
        savingsWithInterest.add(0);
        double r = rate / 100.0;

        for (int year = 1; year < savings.size(); year++) {
            int principal = savings.get(year);
            double amountWithInterest = principal * Math.pow(1 + r, year);
            savingsWithInterest.add((int) amountWithInterest); // cast to int if you want whole numbers
        }
    }

//    public void updateMonthlySavingAmount(Double amount) {
//        this.initialBalance = amount;
//        updateSavings();
//    }

//    private void updateSavings() {
//        initialiseSavings();
//    }

    public List<Integer> getSavings() {
        return savings;
    }

    public List<Integer> getSavingsWithInterest() {
        return savingsWithInterest;
    }

    public Integer getValueAtIndex(int index, List<Integer> list) {
        return list.get(index);
    }

//    public static void main(String[] args) {
//        SavingsAccount savingsAccount = new SavingsAccount(500);
//        List<Double> list = savingsAccount.getSavings();
//
//        list.forEach(System.out::println);
//    }
}
