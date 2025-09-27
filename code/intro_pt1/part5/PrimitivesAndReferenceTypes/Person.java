package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class Person
{
    private final String name;
    private int weight;
    private int height;
    private SimpleDate birthday;
    private Pet pet;
    public Person(String name) {
        this(name, 0, 0, 0);
    }
    public Person(String name, int height, int weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }
    public Person(String personName, Pet petName) {
        this.name = personName;
        this.pet = petName;
    }
    public Person(String name, SimpleDate date, int height, int weight) {
        this.name = name;
        this.birthday = date;
        this.height = height;
        this.weight = weight;
    }
    // other constructors and methods
    public boolean isOlder(Person compare) {
        return this.getBirthday().before(compare.getBirthday());
    }
    public String getName() {
        return this.name;
    }
//    public int getAge() {
//        return this.age;
//    }
    public int getWeight() {
        return this.weight;
    }
    public int getHeight() {
        return this.height;
    }
//    public void growOlder() {
//        this.age = this.age + 1;
//    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    public SimpleDate getBirthday() {
        return this.birthday;
    }
    public boolean isEqual(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Person comparePerson)) {
            return false;
        }

        return this.birthday.equals(comparePerson.birthday) &&
                this.name.equals(comparePerson.name) &&
                this.height == comparePerson.height &&
                this.weight == comparePerson.weight;
    }

    @Override
    public String toString() {
        return this.name + " has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")";
    }
}

