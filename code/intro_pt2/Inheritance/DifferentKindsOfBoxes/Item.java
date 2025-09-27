package intro_pt2.Inheritance.DifferentKindsOfBoxes;

import java.util.Objects;

public class Item
{
    private final String name;
    private int weight;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public int getItemWeight() {
        return weight;
    }

    public String getName () {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item that = (Item) o;
        return that.name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
