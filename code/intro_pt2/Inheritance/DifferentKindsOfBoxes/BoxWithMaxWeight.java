package intro_pt2.Inheritance.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box
{
    private final int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }


    public void add(Item item) {
        if (!isInBox(item))
        {
            if (currentBoxWeight() + item.getItemWeight() <= capacity) {
                items.add(item);
            }
        }
    }

    public int currentBoxWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getItemWeight();
        }
        return totalWeight;
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
