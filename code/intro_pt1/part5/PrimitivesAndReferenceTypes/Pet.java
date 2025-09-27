package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class Pet
{
    private final String name;
    private int age;
    private final String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName () {
        return this.name;
    }
    public String getBreed() {
        return this.breed;
    }
    public int getAge() {
        return this.age;
    }
}
