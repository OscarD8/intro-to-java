package intro_pt2.Streams;

public class Person
{
    private String name;
    private String lastName;
    private int yob;

    public Person(String name, String lastName, int yob) {
        this.name = name;
        this.lastName = lastName;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYob() {
        return yob;
    }

    public String toString() {
        return name + ", " + lastName;
    }
}
