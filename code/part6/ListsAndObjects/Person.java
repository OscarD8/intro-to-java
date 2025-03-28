package part6.ListsAndObjects;

public class Person
{
    private double height;
    private String name;

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
