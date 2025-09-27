package intro_pt2.Inheritance.Person;

public class Teacher extends Person
{
    private int monthlySalary;

    public Teacher(String name, String address, int monthlySalary) {
        super(name, address);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" + "salary " + monthlySalary + " euro/month";
    }
}
