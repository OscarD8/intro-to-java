package intro_pt1.part6.ListsAndObjects.CargoHold;

public class Item
{
    private final String name;
    private final int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + "kg)";
    }
}
