package intro_pt2.Inheritance.Person;

public class Person
{
    private String name;
    private String address;

    public Person(String firstName, String address) {
        this.name = firstName;
        this.address = address;
    }


    @Override
    public String toString() {
        return name + ",\n\t" + address;
    }
}
