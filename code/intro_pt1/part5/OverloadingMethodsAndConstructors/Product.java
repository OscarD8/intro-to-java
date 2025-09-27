package intro_pt1.part5.OverloadingMethodsAndConstructors;

public class Product
{
    private final String name;
    private final String location;
    private final int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, location, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + "kg)" + " can be found from the " + location;
    }
}
