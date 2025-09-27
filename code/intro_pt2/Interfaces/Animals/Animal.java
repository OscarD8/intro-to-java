package intro_pt2.Interfaces.Animals;

public abstract class Animal
{
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat()   {System.out.println(name + " eats");};
    public void sleep() {System.out.println(name + " sleeps");};

    public String getName() {
        return name;
    }
}
