package intro_pt2.Inheritance.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box
{
    private ArrayList<Item> items;

    public OneItemBox() {
        items = new ArrayList<>();
    }


    public void add(Item item) {
        if (!isInBox(item))
        {
            if (items.isEmpty()) {
                items.add(item);
            }
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
