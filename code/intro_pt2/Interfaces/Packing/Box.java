package intro_pt2.Interfaces.Packing;

import java.util.ArrayList;

public class Box implements Packable
{
    private final double capacity;
    private ArrayList<Packable> box;

    public Box(int capacity) {
        this.capacity = capacity;
        box = new ArrayList<>();
    }


    public void add(Packable item) {
        if (!box.contains(item))
        {
            if (weight() + item.weight() <= capacity) {
                box.add(item);
            }
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable item : box) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public ArrayList<Packable> getBoxContents() {
        return this.box;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + "kg";
    }
}
