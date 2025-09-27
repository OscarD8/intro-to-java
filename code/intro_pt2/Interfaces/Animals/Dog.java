package intro_pt2.Interfaces.Animals;

public class Dog extends Animal implements NoiseCapable
{
    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }


    public void bark() {
        System.out.println(super.name + " barks...");
    }

    public void makeNoise() {
        bark();
    }
}
