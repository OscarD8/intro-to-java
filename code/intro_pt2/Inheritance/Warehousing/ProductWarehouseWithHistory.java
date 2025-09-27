package intro_pt2.Inheritance.Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse
{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }


    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amountTaken;
    }

    public void printAnalysis() {
        System.out.println(history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + String.format("%.2f", changeHistory.average()));
    }

    public String history() {
        return changeHistory.toString();
    }
}
