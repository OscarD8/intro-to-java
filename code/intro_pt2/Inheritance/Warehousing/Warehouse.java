package intro_pt2.Inheritance.Warehousing;

import java.text.DecimalFormat;

public class Warehouse
{
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
    private double capacity;
    private double fill;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        }
        this.capacity = capacity;
    }


    public double getBalance() {
        return fill;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - fill;
    }

    public void addToWarehouse(double amount) {
        if (fill + amount > capacity) {
            fill = capacity;
        }
        else if (amount > 0) {
            fill += amount;
        }
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken;
        if (fill - amount < 0) {
            amountTaken = fill;
            fill = 0;
            return amountTaken;
        }
        else if (amount > 0) {
            return fill -= amount;
        }

        return fill;
    }

    @Override
    public String toString() {
        return "balance = " + fill + ", space left " + DECIMAL_FORMAT.format(capacity - fill);
    }
}
