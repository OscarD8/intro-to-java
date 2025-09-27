package intro_pt2.Inheritance.Person;

public class Student extends Person
{
    private int credits;

    public Student(String firstname, String address) {
        super(firstname, address);
        this.credits = 0;
    }

    public void study() {
        credits += 1;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" + "Study credits " + getCredits();
    }
}
