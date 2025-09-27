package intro_pt2.Recap.LiquidContainers;

public class Container
{
    private int capacity;
    private int fill;

    public Container() {
        this(100, 0);
    }

    public Container(int capacity, int fill) {
        this.capacity = capacity;
        this.fill = fill;
    }


    public void addAmount(int amount)
    {
        if (amount < 0) {
            return;
        }

        if (fill + amount > capacity) {
            fill = capacity;
            return;
        }
        fill += amount;
    }

    public void setFill(int amount) {
        fill = amount;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFill() {
        return fill;
    }

    public void removeAmount(int amount) {
        if (fill - amount < 0) {
            fill = 0;
            return;
        }
        fill -= amount;
    }

    @Override
    public String toString() {
        return  "Container{" + "capacity=" + capacity + ", fill=" + fill + '}';
    }
}
