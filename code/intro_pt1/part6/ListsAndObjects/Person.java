package intro_pt1.part6.ListsAndObjects;

public class Person
{
    private final double height;
    private final String name;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + "cm)";
    }
}
