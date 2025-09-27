package intro_pt2.Streams.CargoHold;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase
{
    private ArrayList<Item> inSuitcase;
    private int totalWeight;
    private final int weightLimit;

    public Suitcase(int weightLimit) {
        this.inSuitcase = new ArrayList<>();
        this.weightLimit = weightLimit;
    }

    public void addItem(Item item) {
        boolean weightStatus = weightCheck(item);
        if (weightStatus) {
            this.inSuitcase.add(item);
            this.totalWeight += item.getWeight();
        }
        else {
            System.out.println("Item: " + item + " not added. Weight exceeded.");
        }
    }

    public boolean weightCheck(Item item) {
        return (this.totalWeight + item.getWeight()) <= this.weightLimit;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

    public void printItems() {
        inSuitcase.stream().forEach(System.out::println);
    }

    public Item heaviestItem() {
//        Item heaviestItem = inSuitcase.getFirst();
//        for (int i = 1; i < inSuitcase.size(); i++) {
//            if (inSuitcase.get(i).getWeight() > heaviestItem.getWeight()) {
//                heaviestItem = inSuitcase.get(i);
//            }
//        }
//        return heaviestItem;

        return inSuitcase.stream()
                .max(Comparator.comparingInt(Item::getWeight))
                .orElse(null);
    }

    public boolean compareWeight(Item current, Item compare) {
        return current.getWeight() > compare.getWeight();
    }

    @Override
    public String toString() {
        if (inSuitcase.isEmpty()) {
            return "No items";
        } else if (inSuitcase.size() == 1) {
            return this.inSuitcase.size() + " item (" + this.totalWeight + "kg)";
        } else {
            return this.inSuitcase.size() + " items (" + this.totalWeight + "kg)";
        }
    }
}
