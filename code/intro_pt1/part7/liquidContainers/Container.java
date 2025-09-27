package intro_pt1.part7.liquidContainers;

public class Container
{
    private final int capacity;
    private int fill;

    public Container() {
        capacity = 100;
        fill = 0;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            fill = 0;
        }
        else if (amount > capacity){
            fill = 100;
        }
        else {
            fill = amount;
        }
    }

    public int getFill(){
        return fill;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Fill: " + fill + "    Capacity: " + capacity;
    }
}
