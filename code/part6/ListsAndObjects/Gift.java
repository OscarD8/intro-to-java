package part6.ListsAndObjects;

public class Gift
{
    private final int weight;
    private final String name;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "weight=" + weight +
                ", name='" + name + ' ' +
                '}';
    }
}
